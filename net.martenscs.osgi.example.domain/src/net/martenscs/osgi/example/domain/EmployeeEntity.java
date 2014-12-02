package net.martenscs.osgi.example.domain;

import java.io.Serializable;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

import net.martenscs.osgi.example.domain.api.Employee;

/**
 * The persistent class for the EMPLOYEES database table.
 * 
 */
@Entity
@NamedQueries({
		@NamedQuery(name = "findEmployeeById", query = "select p from EmployeeEntity p WHERE p.employeenumber = :id"),
		@NamedQuery(name = "findAllEmployees", query = "select p from EmployeeEntity p"),
		@NamedQuery(name = "deleteEmployeeById", query = "delete from EmployeeEntity p WHERE p.employeenumber = :id") })
@Table(name = "EMPLOYEES")
@XmlRootElement(name="EMPLOYEES")
public class EmployeeEntity implements Serializable, Employee {
	private static final long serialVersionUID = 1L;

	@Id
	private int employeenumber;

	private String email;

	private String extension;

	private String firstname;

	private String jobtitle;

	private String lastname;

	private String officecode;

	private int reportsto;

	public EmployeeEntity() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.martenscs.osgi.example.domain.Employee#getEmployeenumber()
	 */
	@Override
	public int getEmployeenumber() {
		return this.employeenumber;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.martenscs.osgi.example.domain.Employee#setEmployeenumber(int)
	 */
	@Override
	public void setEmployeenumber(int employeenumber) {
		this.employeenumber = employeenumber;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.martenscs.osgi.example.domain.Employee#getEmail()
	 */
	@Override
	public String getEmail() {
		return this.email;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * net.martenscs.osgi.example.domain.Employee#setEmail(java.lang.String)
	 */
	@Override
	public void setEmail(String email) {
		this.email = email;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.martenscs.osgi.example.domain.Employee#getExtension()
	 */
	@Override
	public String getExtension() {
		return this.extension;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * net.martenscs.osgi.example.domain.Employee#setExtension(java.lang.String)
	 */
	@Override
	public void setExtension(String extension) {
		this.extension = extension;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.martenscs.osgi.example.domain.Employee#getFirstname()
	 */
	@Override
	public String getFirstname() {
		return this.firstname;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * net.martenscs.osgi.example.domain.Employee#setFirstname(java.lang.String)
	 */
	@Override
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.martenscs.osgi.example.domain.Employee#getJobtitle()
	 */
	@Override
	public String getJobtitle() {
		return this.jobtitle;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * net.martenscs.osgi.example.domain.Employee#setJobtitle(java.lang.String)
	 */
	@Override
	public void setJobtitle(String jobtitle) {
		this.jobtitle = jobtitle;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.martenscs.osgi.example.domain.Employee#getLastname()
	 */
	@Override
	public String getLastname() {
		return this.lastname;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * net.martenscs.osgi.example.domain.Employee#setLastname(java.lang.String)
	 */
	@Override
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.martenscs.osgi.example.domain.Employee#getOfficecode()
	 */
	@Override
	public String getOfficecode() {
		return this.officecode;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * net.martenscs.osgi.example.domain.Employee#setOfficecode(java.lang.String
	 * )
	 */
	@Override
	public void setOfficecode(String officecode) {
		this.officecode = officecode;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.martenscs.osgi.example.domain.Employee#getReportsto()
	 */
	@Override
	public int getReportsto() {
		return this.reportsto;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.martenscs.osgi.example.domain.Employee#setReportsto(int)
	 */
	@Override
	public void setReportsto(int reportsto) {
		this.reportsto = reportsto;
	}

}