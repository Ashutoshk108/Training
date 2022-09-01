package com.bhavna.task2;

public class Employee {
	private int eId;
	private String name;
	private int salary;
	private static String company="Bhavna Corp";
	
	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String getName() {
		return name;
	}

	public static String getCompany() {
		return company;
	}

	public static void setCompany(String company) {
		Employee.company = company;
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

	Employee(int eId, String name, int salary){
		this.eId=eId;
		this.name=name;
		this.salary=salary;
	}

}

/*
Create class Employeee with eId ,name,salary, company as member.
Accept recods for Employee
1.Display records having salary greater than 50k
2. Count total number objects.
*/