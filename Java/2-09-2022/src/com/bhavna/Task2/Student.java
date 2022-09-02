package com.bhavna.Task2;

public class Student extends Person{
	private int rollno;
	private int class1;
	private double per;
	
	public Student(String pname, String address, int age, int rollno, int class1, double per) {
		super(pname, address, age);
		this.rollno = rollno;
		this.class1 = class1;
		this.per = per;
	}
	
	public void display() {
		System.out.println("Name\tAddress\tAge\tRoll_No\tClass\tPercentage");
		System.out.println(this.pname+"\t"+this.address+"\t"+this.age+"\t"+this.rollno+"\t"+this.class1+"\t"+this.per);
	}
	
	
}

/*
Write program having class Person with data members pname,address,age.
Create Two classes Employee(eId,company,salary) and Student(rollno,class,per) as Child .
Accept records and display.
1.Use Constructor in all classes
2.Override methods
*/