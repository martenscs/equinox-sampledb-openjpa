package net.martenscs.osgi.example.domain.api;

import java.sql.Timestamp;

public interface Payment<PK> {

	public abstract PK getId();

	public abstract void setId(PK id);

	public abstract double getAmount();

	public abstract void setAmount(double amount);

	public abstract Timestamp getPaymentdate();

	public abstract void setPaymentdate(Timestamp paymentdate);

}