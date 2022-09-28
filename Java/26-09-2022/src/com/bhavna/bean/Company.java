package com.bhavna.bean;

public class Company {
	int company_Id;
	double turnOver;
	String address;
	String date;
	public Company() {
		
	}
	public int getCompany_Id() {
		return company_Id;
	}
	public void setCompany_Id(int company_Id) {
		this.company_Id = company_Id;
	}
	public double getTurnOver() {
		return turnOver;
	}
	public void setTurnOver(double turnOver) {
		this.turnOver = turnOver;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Company(int company_Id, double turnOver, String address, String date) {
		super();
		this.company_Id = company_Id;
		this.turnOver = turnOver;
		this.address = address;
		this.date = date;
	}
	
}
