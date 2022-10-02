package com.bhavna.component.com.bhavna.component.dao;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("companyObj")
public class Company {
	@Value("Bhavna corp")
	private String companyName;
	@Value("Noida")
	private String city;
	@Value("121005")
	private int pinCode;
	@Value("#{departmentObj}")
	private Department department;
	//@Value("#{employeeObj}")
	//private Employee employee;
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
