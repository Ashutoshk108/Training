package com.bhavna.springCore.com.bhavna.springCore;

public class Student {
	private int rollNo;
	private String name;
	private int salary;
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
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
	public Student(int rollNo, String name, int salary) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.salary = salary;
	}
	public Student() {
		super();
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", salary=" + salary + "]";
	}
	

}
