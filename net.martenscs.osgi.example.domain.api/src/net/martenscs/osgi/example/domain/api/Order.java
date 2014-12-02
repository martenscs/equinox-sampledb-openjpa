package net.martenscs.osgi.example.domain.api;

import java.sql.Timestamp;

public interface Order {

	public abstract int getOrdernumber();

	public abstract void setOrdernumber(int ordernumber);

	public abstract String getComments();

	public abstract void setComments(String comments);

	public abstract int getCustomernumber();

	public abstract void setCustomernumber(int customernumber);

	public abstract Timestamp getOrderdate();

	public abstract void setOrderdate(Timestamp orderdate);

	public abstract Timestamp getRequireddate();

	public abstract void setRequireddate(Timestamp requireddate);

	public abstract Timestamp getShippeddate();

	public abstract void setShippeddate(Timestamp shippeddate);

	public abstract String getStatus();

	public abstract void setStatus(String status);

}