package com.sapient.cui.client;

import java.io.Serializable;

public class Address implements Serializable {
	private static final long serialVersionUID=1L;
	String street;
	String country;
	public void setStreet(String street )
	{
		this.street=street;
	}
	public void setCountry(String country)
	{
		this.country=country;
	}
	public String getStreet()
	{
		return street;
	}
	public String getCountry()
	{
		return country;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return new StringBuffer("Street :")
		.append(this.street)
		.append("country :")
		.append(this.country).toString();
	}
	
}
