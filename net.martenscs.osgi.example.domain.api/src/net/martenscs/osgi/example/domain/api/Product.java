package net.martenscs.osgi.example.domain.api;

public interface Product {

	public abstract String getProductcode();

	public abstract void setProductcode(String productcode);

	public abstract double getBuyprice();

	public abstract void setBuyprice(double buyprice);

	public abstract double getMsrp();

	public abstract void setMsrp(double msrp);

	public abstract String getProductdescription();

	public abstract void setProductdescription(String productdescription);

	public abstract String getProductline();

	public abstract void setProductline(String productline);

	public abstract String getProductname();

	public abstract void setProductname(String productname);

	public abstract String getProductscale();

	public abstract void setProductscale(String productscale);

	public abstract String getProductvendor();

	public abstract void setProductvendor(String productvendor);

	public abstract short getQuantityinstock();

	public abstract void setQuantityinstock(short quantityinstock);

}