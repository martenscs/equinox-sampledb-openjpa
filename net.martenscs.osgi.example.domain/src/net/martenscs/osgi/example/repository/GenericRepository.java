package net.martenscs.osgi.example.repository;

import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import net.martenscs.osgi.example.domain.api.Repository;

public abstract class GenericRepository<Entity, PK> implements
		Repository<Entity, PK> {
	protected final Logger LOGGER = LoggerFactory.getLogger(getClass());

	private EntityManager entityManager;

	public abstract String getDeleteNamedQuery();

	public abstract String getFindNamedQuery();

	public abstract String getFindAllNamedQuery();

	public abstract Class<?> getEntityClass();

	@Override
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	public EntityManager getEntityManager() {
		return entityManager;
	}

	@Override
	public void add(Entity entity) {
		getEntityManager().persist(entity);
		getEntityManager().flush();

	}

	@Override
	public void delete(PK id) {
		try {
			Query query = getEntityManager().createNamedQuery(
					getDeleteNamedQuery(), getEntityClass());
			query.setParameter("id", id).executeUpdate();
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
		}
		entityManager.flush();

	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public List<Entity> getAll() {
		List<Entity> list = new ArrayList<Entity>();
		try {
			List cu = getEntityManager().createNamedQuery(
					getFindAllNamedQuery(), getEntityClass()).getResultList();
			list.addAll(cu);
		} catch (NoResultException e) {
			LOGGER.error(e.getMessage());
		}
		return list;
	}

	@SuppressWarnings("unchecked")
	@Override
	public Entity get(PK id) {
		Entity r = null;
		try {
			TypedQuery<?> query = getEntityManager().createNamedQuery(
					getFindNamedQuery(), getEntityClass());
			r = (Entity) query.setParameter("id", id).getSingleResult();
		} catch (NoResultException e) {
			LOGGER.error(e.getMessage());
		}
		return r;
	}
}
