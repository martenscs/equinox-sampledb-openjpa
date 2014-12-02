package net.martenscs.osgi.example.domain.api;

public interface Office {

	public abstract String getOfficecode();

	public abstract void setOfficecode(String officecode);

	public abstract String getAddressline1();

	public abstract void setAddressline1(String addressline1);

	public abstract String getAddressline2();

	public abstract void setAddressline2(String addressline2);

	public abstract String getCity();

	public abstract void setCity(String city);

	public abstract String getCountry();

	public abstract void setCountry(String country);

	public abstract String getPhone();

	public abstract void setPhone(String phone);

	public abstract String getPostalcode();

	public abstract void setPostalcode(String postalcode);

	public abstract String getState();

	public abstract void setState(String state);

	public abstract String getTerritory();

	public abstract void setTerritory(String territory);

}