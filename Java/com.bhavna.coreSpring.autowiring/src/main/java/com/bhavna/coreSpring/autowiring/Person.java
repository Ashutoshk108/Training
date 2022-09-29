package com.bhavna.coreSpring.autowiring;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Person {
	private String name;
	private String city;
	private List<String> mobileNo;
	private Set<String> vehicleNo;
	private Map<String, String> yearQualification;
	private Company company;
	
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public List<String> getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(List<String> mobileNo) {
		this.mobileNo = mobileNo;
	}
	public Set<String> getVehicleNo() {
		return vehicleNo;
	}
	public void setVehicleNo(Set<String> vehicleNo) {
		this.vehicleNo = vehicleNo;
	}
	public Map<String, String> getYearQualification() {
		return yearQualification;
	}
	public void setYearQualification(Map<String, String> yearQualification) {
		this.yearQualification = yearQualification;
	}
	
	public Person(String name, String city, List<String> mobileNo, Set<String> vehicleNo,
			Map<String, String> yearQualification, Company company) {
		super();
		this.name = name;
		this.city = city;
		this.mobileNo = mobileNo;
		this.vehicleNo = vehicleNo;
		this.yearQualification = yearQualification;
		this.company = company;
	}
	public Person() {
		super();
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", city=" + city + ", mobileNo=" + mobileNo + ", vehicleNo=" + vehicleNo
				+ "\n, yearQualification=" + yearQualification + ", company=" + company + "]";
	}
		

}
