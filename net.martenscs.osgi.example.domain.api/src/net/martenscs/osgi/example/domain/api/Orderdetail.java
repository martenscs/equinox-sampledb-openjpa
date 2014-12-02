package net.martenscs.osgi.example.domain.api;



public interface Orderdetail<PK> {

	public abstract PK getId();

	public abstract void setId(PK id);

	public abstract short getOrderlinenumber();

	public abstract void setOrderlinenumber(short orderlinenumber);

	public abstract double getPriceeach();

	public abstract void setPriceeach(double priceeach);

	public abstract int getQuantityordered();

	public abstract void setQuantityordered(int quantityordered);

}