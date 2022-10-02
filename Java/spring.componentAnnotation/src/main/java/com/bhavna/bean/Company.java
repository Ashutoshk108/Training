package com.bhavna.bean;
import java.util.*;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;

@Component
public class Company {
	@Value("Bhavna Corp")
	private String companyName;
	@Value("Noida")
	private String location;
	
	@Value("#{feedClass.brancheList}")
	private Map<String,String> branches;
	
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	public Map<String, String> getBranches() {
		return branches;
	}
	public void setBranches(Map<String, String> branches) {
		this.branches = branches;
	}
	
	public Company(String companyName, String location, Map<String, String> branches) {
		super();
		this.companyName = companyName;
		this.location = location;
		this.branches = branches;
	}
	
	public Company() {
		super();
	}
	@Override
	public String toString() {
		return "Company [companyName=" + companyName + ", location=" + location + ", branches=" + branches + "]";
	}
	
	
}
