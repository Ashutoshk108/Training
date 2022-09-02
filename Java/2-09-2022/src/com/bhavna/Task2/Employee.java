package com.bhavna.Task2;

public class Employee extends Person{
	protected int eId;
	protected String company;
	protected int Salary;
	
	public Employee(String pname, String address, int age, int eId, String company, int salary) {
		super(pname, address, age);
		this.eId = eId;
		this.company = company;
		Salary = salary;
	}
	
	public void display() {
		System.out.println("Name\tAddress\tAge\tE_ID\tCompany\tSalary");
		System.out.println(this.pname+"\t"+this.address+"\t"+this.age+"\t"+this.eId+"\t"+this.company+"\t"+this.Salary);
	}
	
	
}

/*
Write program having class Person with data members pname,address,age.
Create Two classes Employee(eId,company,salary) and Student(rollno,class,per) as Child .
Accept records and display.
1.Use Constructor in all classes
2.Override methods
*/