package net.martenscs.osgi.example.domain.api;

import java.util.List;

import javax.persistence.EntityManager;

public interface Repository<Entity, PK> {

	public void setEntityManager(EntityManager em);

	public EntityManager getEntityManager();

	public void add(Entity entity);

	public void delete(PK entity);

	public Entity get(PK id);

	public List<Entity> getAll();
}
