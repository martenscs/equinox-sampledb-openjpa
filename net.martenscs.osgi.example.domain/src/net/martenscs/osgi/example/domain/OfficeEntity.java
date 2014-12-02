package net.martenscs.osgi.example.domain;

import java.io.Serializable;
import javax.persistence.*;

import net.martenscs.osgi.example.domain.api.Office;

/**
 * The persistent class for the OFFICES database table.
 * 
 */
@Entity
@NamedQueries({
		@NamedQuery(name = "findOfficeById", query = "select p from OfficeEntity p WHERE p.officecode = :id"),
		@NamedQuery(name = "findAllOffices", query = "select p from OfficeEntity p"),
		@NamedQuery(name = "deleteOfficeById", query = "delete from OfficeEntity p WHERE p.officecode = :id") })
@Table(name = "OFFICES")
public class OfficeEntity implements Serializable, Office {
	private static final long serialVersionUID = 1L;

	@Id
	private String officecode;

	private String addressline1;

	private String addressline2;

	private String city;

	private String country;

	private String phone;

	private String postalcode;

	private String state;

	private String territory;

	public OfficeEntity() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.martenscs.osgi.example.domain.Office#getOfficecode()
	 */
	@Override
	public String getOfficecode() {
		return this.officecode;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * net.martenscs.osgi.example.domain.Office#setOfficecode(java.lang.String)
	 */
	@Override
	public void setOfficecode(String officecode) {
		this.officecode = officecode;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.martenscs.osgi.example.domain.Office#getAddressline1()
	 */
	@Override
	public String getAddressline1() {
		return this.addressline1;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * net.martenscs.osgi.example.domain.Office#setAddressline1(java.lang.String
	 * )
	 */
	@Override
	public void setAddressline1(String addressline1) {
		this.addressline1 = addressline1;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.martenscs.osgi.example.domain.Office#getAddressline2()
	 */
	@Override
	public String getAddressline2() {
		return this.addressline2;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * net.martenscs.osgi.example.domain.Office#setAddressline2(java.lang.String
	 * )
	 */
	@Override
	public void setAddressline2(String addressline2) {
		this.addressline2 = addressline2;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.martenscs.osgi.example.domain.Office#getCity()
	 */
	@Override
	public String getCity() {
		return this.city;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.martenscs.osgi.example.domain.Office#setCity(java.lang.String)
	 */
	@Override
	public void setCity(String city) {
		this.city = city;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.martenscs.osgi.example.domain.Office#getCountry()
	 */
	@Override
	public String getCountry() {
		return this.country;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * net.martenscs.osgi.example.domain.Office#setCountry(java.lang.String)
	 */
	@Override
	public void setCountry(String country) {
		this.country = country;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.martenscs.osgi.example.domain.Office#getPhone()
	 */
	@Override
	public String getPhone() {
		return this.phone;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.martenscs.osgi.example.domain.Office#setPhone(java.lang.String)
	 */
	@Override
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.martenscs.osgi.example.domain.Office#getPostalcode()
	 */
	@Override
	public String getPostalcode() {
		return this.postalcode;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * net.martenscs.osgi.example.domain.Office#setPostalcode(java.lang.String)
	 */
	@Override
	public void setPostalcode(String postalcode) {
		this.postalcode = postalcode;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.martenscs.osgi.example.domain.Office#getState()
	 */
	@Override
	public String getState() {
		return this.state;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.martenscs.osgi.example.domain.Office#setState(java.lang.String)
	 */
	@Override
	public void setState(String state) {
		this.state = state;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.martenscs.osgi.example.domain.Office#getTerritory()
	 */
	@Override
	public String getTerritory() {
		return this.territory;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * net.martenscs.osgi.example.domain.Office#setTerritory(java.lang.String)
	 */
	@Override
	public void setTerritory(String territory) {
		this.territory = territory;
	}

}