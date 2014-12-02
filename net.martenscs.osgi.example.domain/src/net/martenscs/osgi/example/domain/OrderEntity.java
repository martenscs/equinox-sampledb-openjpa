package net.martenscs.osgi.example.domain;

import java.io.Serializable;
import javax.persistence.*;

import net.martenscs.osgi.example.domain.api.Order;

import java.sql.Timestamp;

/**
 * The persistent class for the ORDERS database table.
 * 
 */
@Entity
@NamedQueries({
		@NamedQuery(name = "findOrderById", query = "select p from OrderEntity p WHERE p.ordernumber = :id"),
		@NamedQuery(name = "findAllOrders", query = "select p from OrderEntity p"),
		@NamedQuery(name = "deleteOrderById", query = "delete from OrderEntity p WHERE p.ordernumber = :id") })
@Table(name = "ORDERS")
public class OrderEntity implements Serializable, Order {
	private static final long serialVersionUID = 1L;

	@Id
	private int ordernumber;

	private String comments;

	private int customernumber;

	private Timestamp orderdate;

	private Timestamp requireddate;

	private Timestamp shippeddate;

	private String status;

	public OrderEntity() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.martenscs.osgi.example.domain.Order#getOrdernumber()
	 */
	@Override
	public int getOrdernumber() {
		return this.ordernumber;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.martenscs.osgi.example.domain.Order#setOrdernumber(int)
	 */
	@Override
	public void setOrdernumber(int ordernumber) {
		this.ordernumber = ordernumber;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.martenscs.osgi.example.domain.Order#getComments()
	 */
	@Override
	public String getComments() {
		return this.comments;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * net.martenscs.osgi.example.domain.Order#setComments(java.lang.String)
	 */
	@Override
	public void setComments(String comments) {
		this.comments = comments;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.martenscs.osgi.example.domain.Order#getCustomernumber()
	 */
	@Override
	public int getCustomernumber() {
		return this.customernumber;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.martenscs.osgi.example.domain.Order#setCustomernumber(int)
	 */
	@Override
	public void setCustomernumber(int customernumber) {
		this.customernumber = customernumber;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.martenscs.osgi.example.domain.Order#getOrderdate()
	 */
	@Override
	public Timestamp getOrderdate() {
		return this.orderdate;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * net.martenscs.osgi.example.domain.Order#setOrderdate(java.sql.Timestamp)
	 */
	@Override
	public void setOrderdate(Timestamp orderdate) {
		this.orderdate = orderdate;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.martenscs.osgi.example.domain.Order#getRequireddate()
	 */
	@Override
	public Timestamp getRequireddate() {
		return this.requireddate;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * net.martenscs.osgi.example.domain.Order#setRequireddate(java.sql.Timestamp
	 * )
	 */
	@Override
	public void setRequireddate(Timestamp requireddate) {
		this.requireddate = requireddate;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.martenscs.osgi.example.domain.Order#getShippeddate()
	 */
	@Override
	public Timestamp getShippeddate() {
		return this.shippeddate;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * net.martenscs.osgi.example.domain.Order#setShippeddate(java.sql.Timestamp
	 * )
	 */
	@Override
	public void setShippeddate(Timestamp shippeddate) {
		this.shippeddate = shippeddate;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.martenscs.osgi.example.domain.Order#getStatus()
	 */
	@Override
	public String getStatus() {
		return this.status;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.martenscs.osgi.example.domain.Order#setStatus(java.lang.String)
	 */
	@Override
	public void setStatus(String status) {
		this.status = status;
	}

}