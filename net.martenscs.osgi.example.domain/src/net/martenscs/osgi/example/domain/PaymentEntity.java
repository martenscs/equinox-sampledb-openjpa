package net.martenscs.osgi.example.domain;

import java.io.Serializable;
import javax.persistence.*;

import net.martenscs.osgi.example.domain.api.Payment;

import java.sql.Timestamp;

/**
 * The persistent class for the PAYMENTS database table.
 * 
 */
@Entity
@NamedQueries({
		@NamedQuery(name = "findPaymentById", query = "select p from OrderEntity p WHERE p.id.customernumber = :id and p.id.checknumber = :ckn"),
		@NamedQuery(name = "findAllPayments", query = "select p from OrderEntity p"),
		@NamedQuery(name = "deletePaymentById", query = "delete from OrderEntity p WHERE p.id.customernumber = :id and p.id.checknumber = :ckn") })
@Table(name = "PAYMENTS")
public class PaymentEntity implements Serializable, Payment<PaymentPK> {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private PaymentPK id;

	private double amount;

	private Timestamp paymentdate;

	public PaymentEntity() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.martenscs.osgi.example.domain.Payment#getId()
	 */
	@Override
	public PaymentPK getId() {
		return this.id;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * net.martenscs.osgi.example.domain.Payment#setId(net.martenscs.osgi.example
	 * .domain.PaymentPK)
	 */
	@Override
	public void setId(PaymentPK id) {
		this.id = id;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.martenscs.osgi.example.domain.Payment#getAmount()
	 */
	@Override
	public double getAmount() {
		return this.amount;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.martenscs.osgi.example.domain.Payment#setAmount(double)
	 */
	@Override
	public void setAmount(double amount) {
		this.amount = amount;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.martenscs.osgi.example.domain.Payment#getPaymentdate()
	 */
	@Override
	public Timestamp getPaymentdate() {
		return this.paymentdate;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * net.martenscs.osgi.example.domain.Payment#setPaymentdate(java.sql.Timestamp
	 * )
	 */
	@Override
	public void setPaymentdate(Timestamp paymentdate) {
		this.paymentdate = paymentdate;
	}

}