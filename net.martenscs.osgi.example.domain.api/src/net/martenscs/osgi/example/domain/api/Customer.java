package net.martenscs.osgi.example.domain.api;

public interface Customer {

	public abstract int getCustomernumber();

	public abstract void setCustomernumber(int customernumber);

	public abstract String getAddressline1();

	public abstract void setAddressline1(String addressline1);

	public abstract String getAddressline2();

	public abstract void setAddressline2(String addressline2);

	public abstract String getCity();

	public abstract void setCity(String city);

	public abstract String getContactfirstname();

	public abstract void setContactfirstname(String contactfirstname);

	public abstract String getContactlastname();

	public abstract void setContactlastname(String contactlastname);

	public abstract String getCountry();

	public abstract void setCountry(String country);

	public abstract double getCreditlimit();

	public abstract void setCreditlimit(double creditlimit);

	public abstract String getCustomername();

	public abstract void setCustomername(String customername);

	public abstract String getPhone();

	public abstract void setPhone(String phone);

	public abstract String getPostalcode();

	public abstract void setPostalcode(String postalcode);

	public abstract int getSalesrepemployeenumber();

	public abstract void setSalesrepemployeenumber(int salesrepemployeenumber);

	public abstract String getState();

	public abstract void setState(String state);

}