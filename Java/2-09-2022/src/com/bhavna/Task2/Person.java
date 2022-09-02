package com.bhavna.Task2;

public class Person {
	protected String pname;
	protected String address;
	protected int age;
	
	public Person(String pname, String address, int age) {
		super();
		this.pname = pname;
		this.address = address;
		this.age = age;
	}
	
	public void display() {
		System.out.println("Name\tAddress\t\tAge");
		System.out.println(this.pname+"\t"+this.address+"\t"+this.age);
	}
}

/*
Write program having class Person with data members pname,address,age.
Create Two classes Employee(eId,company,salary) and Student(rollno,class,per) as Child .
Accept records and display.
1.Use Constructor in all classes
2.Override methods

*/