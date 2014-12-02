package net.martenscs.osgi.example.domain;

import java.io.Serializable;
import javax.persistence.*;

import net.martenscs.osgi.example.domain.api.Orderdetail;

/**
 * The persistent class for the ORDERDETAILS database table.
 * 
 */
@Entity
@Table(name = "ORDERDETAILS")
public class OrderdetailEntity implements Serializable,
		Orderdetail<OrderdetailPK> {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private OrderdetailPK id;

	private short orderlinenumber;

	private double priceeach;

	private int quantityordered;

	public OrderdetailEntity() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.martenscs.osgi.example.domain.Orderdetail#getId()
	 */
	@Override
	public OrderdetailPK getId() {
		return this.id;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * net.martenscs.osgi.example.domain.Orderdetail#setId(net.martenscs.osgi
	 * .example.domain.OrderdetailPK)
	 */
	@Override
	public void setId(OrderdetailPK id) {
		this.id = id;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.martenscs.osgi.example.domain.Orderdetail#getOrderlinenumber()
	 */
	@Override
	public short getOrderlinenumber() {
		return this.orderlinenumber;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * net.martenscs.osgi.example.domain.Orderdetail#setOrderlinenumber(short)
	 */
	@Override
	public void setOrderlinenumber(short orderlinenumber) {
		this.orderlinenumber = orderlinenumber;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.martenscs.osgi.example.domain.Orderdetail#getPriceeach()
	 */
	@Override
	public double getPriceeach() {
		return this.priceeach;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.martenscs.osgi.example.domain.Orderdetail#setPriceeach(double)
	 */
	@Override
	public void setPriceeach(double priceeach) {
		this.priceeach = priceeach;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.martenscs.osgi.example.domain.Orderdetail#getQuantityordered()
	 */
	@Override
	public int getQuantityordered() {
		return this.quantityordered;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * net.martenscs.osgi.example.domain.Orderdetail#setQuantityordered(int)
	 */
	@Override
	public void setQuantityordered(int quantityordered) {
		this.quantityordered = quantityordered;
	}

}