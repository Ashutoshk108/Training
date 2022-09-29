package com.bhavna.coreSpring.autowiring;

public class Company {
	private String companyName;
	private String city;
	private int pinCode;
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	public Company(String companyName, String city, int pinCode) {
		super();
		this.companyName = companyName;
		this.city = city;
		this.pinCode = pinCode;
	}
	@Override
	public String toString() {
		return "Company [companyName=" + companyName + ", city=" + city + ", pinCode=" + pinCode + "]";
	}
	public Company() {
		super();
	}
	

}
