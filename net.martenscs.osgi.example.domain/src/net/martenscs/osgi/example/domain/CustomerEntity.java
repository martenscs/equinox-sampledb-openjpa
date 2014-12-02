package net.martenscs.osgi.example.domain;

import java.io.Serializable;
import javax.persistence.*;

import net.martenscs.osgi.example.domain.api.Customer;

/**
 * The persistent class for the CUSTOMERS database table.
 * 
 */
@Entity
@NamedQueries({
		@NamedQuery(name = "findCustomerById", query = "select p from CustomerEntity p WHERE p.customernumber = :id"),
		@NamedQuery(name = "findAllCustomers", query = "select p from CustomerEntity p"),
		@NamedQuery(name = "deleteCustomerById", query = "delete from CustomerEntity p WHERE p.customernumber = :id") })
@Table(name = "CUSTOMERS")
public class CustomerEntity implements Serializable, Customer {

	private static final long serialVersionUID = 1L;

	@Id
	private int customernumber;

	private String addressline1;

	private String addressline2;

	private String city;

	private String contactfirstname;

	private String contactlastname;

	private String country;

	private double creditlimit;

	private String customername;

	private String phone;

	private String postalcode;

	private int salesrepemployeenumber;

	private String state;

	public CustomerEntity() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.martenscs.osgi.example.domain.Customer#getCustomernumber()
	 */
	@Override
	public int getCustomernumber() {
		return this.customernumber;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.martenscs.osgi.example.domain.Customer#setCustomernumber(int)
	 */
	@Override
	public void setCustomernumber(int customernumber) {
		this.customernumber = customernumber;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.martenscs.osgi.example.domain.Customer#getAddressline1()
	 */
	@Override
	public String getAddressline1() {
		return this.addressline1;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * net.martenscs.osgi.example.domain.Customer#setAddressline1(java.lang.
	 * String)
	 */
	@Override
	public void setAddressline1(String addressline1) {
		this.addressline1 = addressline1;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.martenscs.osgi.example.domain.Customer#getAddressline2()
	 */
	@Override
	public String getAddressline2() {
		return this.addressline2;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * net.martenscs.osgi.example.domain.Customer#setAddressline2(java.lang.
	 * String)
	 */
	@Override
	public void setAddressline2(String addressline2) {
		this.addressline2 = addressline2;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.martenscs.osgi.example.domain.Customer#getCity()
	 */
	@Override
	public String getCity() {
		return this.city;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.martenscs.osgi.example.domain.Customer#setCity(java.lang.String)
	 */
	@Override
	public void setCity(String city) {
		this.city = city;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.martenscs.osgi.example.domain.Customer#getContactfirstname()
	 */
	@Override
	public String getContactfirstname() {
		return this.contactfirstname;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * net.martenscs.osgi.example.domain.Customer#setContactfirstname(java.lang
	 * .String)
	 */
	@Override
	public void setContactfirstname(String contactfirstname) {
		this.contactfirstname = contactfirstname;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.martenscs.osgi.example.domain.Customer#getContactlastname()
	 */
	@Override
	public String getContactlastname() {
		return this.contactlastname;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * net.martenscs.osgi.example.domain.Customer#setContactlastname(java.lang
	 * .String)
	 */
	@Override
	public void setContactlastname(String contactlastname) {
		this.contactlastname = contactlastname;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.martenscs.osgi.example.domain.Customer#getCountry()
	 */
	@Override
	public String getCountry() {
		return this.country;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * net.martenscs.osgi.example.domain.Customer#setCountry(java.lang.String)
	 */
	@Override
	public void setCountry(String country) {
		this.country = country;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.martenscs.osgi.example.domain.Customer#getCreditlimit()
	 */
	@Override
	public double getCreditlimit() {
		return this.creditlimit;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.martenscs.osgi.example.domain.Customer#setCreditlimit(double)
	 */
	@Override
	public void setCreditlimit(double creditlimit) {
		this.creditlimit = creditlimit;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.martenscs.osgi.example.domain.Customer#getCustomername()
	 */
	@Override
	public String getCustomername() {
		return this.customername;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * net.martenscs.osgi.example.domain.Customer#setCustomername(java.lang.
	 * String)
	 */
	@Override
	public void setCustomername(String customername) {
		this.customername = customername;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.martenscs.osgi.example.domain.Customer#getPhone()
	 */
	@Override
	public String getPhone() {
		return this.phone;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * net.martenscs.osgi.example.domain.Customer#setPhone(java.lang.String)
	 */
	@Override
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.martenscs.osgi.example.domain.Customer#getPostalcode()
	 */
	@Override
	public String getPostalcode() {
		return this.postalcode;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * net.martenscs.osgi.example.domain.Customer#setPostalcode(java.lang.String
	 * )
	 */
	@Override
	public void setPostalcode(String postalcode) {
		this.postalcode = postalcode;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * net.martenscs.osgi.example.domain.Customer#getSalesrepemployeenumber()
	 */
	@Override
	public int getSalesrepemployeenumber() {
		return this.salesrepemployeenumber;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * net.martenscs.osgi.example.domain.Customer#setSalesrepemployeenumber(int)
	 */
	@Override
	public void setSalesrepemployeenumber(int salesrepemployeenumber) {
		this.salesrepemployeenumber = salesrepemployeenumber;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.martenscs.osgi.example.domain.Customer#getState()
	 */
	@Override
	public String getState() {
		return this.state;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * net.martenscs.osgi.example.domain.Customer#setState(java.lang.String)
	 */
	@Override
	public void setState(String state) {
		this.state = state;
	}

}