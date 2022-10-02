package com.bhavna.bean;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;

@Component
public class Employee {
	@Value("101")
	private int eId;
	@Value("Gaurav")
	private String name;
	@Value("100000")
	private int salary;
	
	@Value("#{company}")
	private Company company;
	
	@Value("#{department}")
	private Department department;
	
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public Employee(int eId, String name, int salary, Company company, Department department) {
		super();
		this.eId = eId;
		this.name = name;
		this.salary = salary;
		this.company = company;
		/*this.department = department;*/
	}
	public Employee() {
		super();
	}
	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", name=" + name + ", salary=" + salary + ", company=" + company
				+ ", department=" + department + "]";
	}
	
	
	

}
