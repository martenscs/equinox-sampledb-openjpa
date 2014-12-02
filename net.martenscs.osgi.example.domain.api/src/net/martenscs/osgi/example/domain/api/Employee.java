package net.martenscs.osgi.example.domain.api;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "customer")
public interface Employee {

	public abstract int getEmployeenumber();

	public abstract void setEmployeenumber(int employeenumber);

	public abstract String getEmail();

	public abstract void setEmail(String email);

	public abstract String getExtension();

	public abstract void setExtension(String extension);

	public abstract String getFirstname();

	public abstract void setFirstname(String firstname);

	public abstract String getJobtitle();

	public abstract void setJobtitle(String jobtitle);

	public abstract String getLastname();

	public abstract void setLastname(String lastname);

	public abstract String getOfficecode();

	public abstract void setOfficecode(String officecode);

	public abstract int getReportsto();

	public abstract void setReportsto(int reportsto);

}