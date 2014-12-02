package net.martenscs.osgi.example.domain;

import java.io.Serializable;
import javax.persistence.*;

import net.martenscs.osgi.example.domain.api.Product;

/**
 * The persistent class for the PRODUCTS database table.
 * 
 */
@Entity
@NamedQueries({
		@NamedQuery(name = "findProductById", query = "select p from ProductEntity p WHERE p.productcode = :id"),
		@NamedQuery(name = "findAllProducts", query = "select p from ProductEntity p"),
		@NamedQuery(name = "deleteProductById", query = "delete from ProductEntity p WHERE p.productcode = :id") })
@Table(name = "PRODUCTS")
public class ProductEntity implements Serializable, Product {
	private static final long serialVersionUID = 1L;

	@Id
	private String productcode;

	private double buyprice;

	private double msrp;

	private String productdescription;

	private String productline;

	private String productname;

	private String productscale;

	private String productvendor;

	private short quantityinstock;

	public ProductEntity() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.martenscs.osgi.example.domain.Product#getProductcode()
	 */
	@Override
	public String getProductcode() {
		return this.productcode;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * net.martenscs.osgi.example.domain.Product#setProductcode(java.lang.String
	 * )
	 */
	@Override
	public void setProductcode(String productcode) {
		this.productcode = productcode;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.martenscs.osgi.example.domain.Product#getBuyprice()
	 */
	@Override
	public double getBuyprice() {
		return this.buyprice;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.martenscs.osgi.example.domain.Product#setBuyprice(double)
	 */
	@Override
	public void setBuyprice(double buyprice) {
		this.buyprice = buyprice;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.martenscs.osgi.example.domain.Product#getMsrp()
	 */
	@Override
	public double getMsrp() {
		return this.msrp;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.martenscs.osgi.example.domain.Product#setMsrp(double)
	 */
	@Override
	public void setMsrp(double msrp) {
		this.msrp = msrp;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.martenscs.osgi.example.domain.Product#getProductdescription()
	 */
	@Override
	public String getProductdescription() {
		return this.productdescription;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * net.martenscs.osgi.example.domain.Product#setProductdescription(java.
	 * lang.String)
	 */
	@Override
	public void setProductdescription(String productdescription) {
		this.productdescription = productdescription;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.martenscs.osgi.example.domain.Product#getProductline()
	 */
	@Override
	public String getProductline() {
		return this.productline;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * net.martenscs.osgi.example.domain.Product#setProductline(java.lang.String
	 * )
	 */
	@Override
	public void setProductline(String productline) {
		this.productline = productline;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.martenscs.osgi.example.domain.Product#getProductname()
	 */
	@Override
	public String getProductname() {
		return this.productname;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * net.martenscs.osgi.example.domain.Product#setProductname(java.lang.String
	 * )
	 */
	@Override
	public void setProductname(String productname) {
		this.productname = productname;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.martenscs.osgi.example.domain.Product#getProductscale()
	 */
	@Override
	public String getProductscale() {
		return this.productscale;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * net.martenscs.osgi.example.domain.Product#setProductscale(java.lang.String
	 * )
	 */
	@Override
	public void setProductscale(String productscale) {
		this.productscale = productscale;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.martenscs.osgi.example.domain.Product#getProductvendor()
	 */
	@Override
	public String getProductvendor() {
		return this.productvendor;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * net.martenscs.osgi.example.domain.Product#setProductvendor(java.lang.
	 * String)
	 */
	@Override
	public void setProductvendor(String productvendor) {
		this.productvendor = productvendor;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.martenscs.osgi.example.domain.Product#getQuantityinstock()
	 */
	@Override
	public short getQuantityinstock() {
		return this.quantityinstock;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.martenscs.osgi.example.domain.Product#setQuantityinstock(short)
	 */
	@Override
	public void setQuantityinstock(short quantityinstock) {
		this.quantityinstock = quantityinstock;
	}

}