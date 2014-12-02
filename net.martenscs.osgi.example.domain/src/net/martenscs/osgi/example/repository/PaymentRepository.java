package net.martenscs.osgi.example.repository;

import javax.persistence.NoResultException;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import net.martenscs.osgi.example.domain.PaymentEntity;
import net.martenscs.osgi.example.domain.PaymentPK;
import net.martenscs.osgi.example.domain.api.Payment;
import net.martenscs.osgi.example.domain.api.Repository;

public class PaymentRepository extends
		GenericRepository<Payment<PaymentPK>, PaymentPK> implements
		Repository<Payment<PaymentPK>, PaymentPK> {

	public void init() {
	}

	@Override
	public String getDeleteNamedQuery() {
		return "deletePaymentById";
	}

	@Override
	public String getFindNamedQuery() {
		return "findPaymentById";
	}

	@Override
	public String getFindAllNamedQuery() {
		return "findAllPayments";
	}
	
	

	@Override
	public void delete(PaymentPK id) {
		try {
			Query query = getEntityManager().createNamedQuery(
					getDeleteNamedQuery(), getEntityClass());
			
			query.setParameter("id", id.getCustomernumber())
					.setParameter("ckn", id.getChecknumber()).executeUpdate();
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
		}
		getEntityManager().flush();

	}

	@SuppressWarnings("unchecked")
	@Override
	public Payment<PaymentPK> get(PaymentPK id) {
		Payment<PaymentPK> r = null;
		try {
			TypedQuery<?> query = getEntityManager().createNamedQuery(
					getFindNamedQuery(), getEntityClass());
			r = (Payment<PaymentPK>) query
					.setParameter("id", id.getCustomernumber())
					.setParameter("ckn", id.getChecknumber()).getSingleResult();
		} catch (NoResultException e) {
			LOGGER.error(e.getMessage());
		}
		return r;
	}

	@Override
	public Class<?> getEntityClass() {
		return PaymentEntity.class;
	}

}
