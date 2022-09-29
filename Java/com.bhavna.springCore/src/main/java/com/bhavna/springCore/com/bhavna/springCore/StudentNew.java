package com.bhavna.springCore.com.bhavna.springCore;

public class StudentNew {
	private int rollNo;
	private String name;
	private int salary;
	private String exam;
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
	public String getExam() {
		return exam;
	}
	public void setExam(String exam) {
		this.exam = exam;
	}
	public StudentNew(int rollNo, String name, int salary, String exam) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.salary = salary;
		this.exam = exam;
	}
	public StudentNew() {
		super();
	}
	
	@Override
	public String toString() {
		return "StudentNew [rollNo=" + rollNo + ", name=" + name + ", salary=" + salary + ", exam=" + exam + "]";
	}
}
/*
Create two classes StudentNew (rollno,name,salary,exam) and ExamNew (eId ,name , marks ) 
and inject dependencyUse Setter Injection as well as Constructor Injection*/