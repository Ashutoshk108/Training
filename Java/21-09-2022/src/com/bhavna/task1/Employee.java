package com.bhavna.task1;

public class Employee implements Comparable<Employee>{
	int eId;
	String name;
	int Salary;
	
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
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}
	public Employee(int eId, String name, int salary) {
		super();
		this.eId = eId;
		this.name = name;
		Salary = salary;
	}
	@Override
	public int compareTo(Employee obj){  
		return this.name.compareTo(obj.name);
	}  
	
	
	public String toString() {
		return eId+" "+name+" "+Salary;
	}
	
}

/*
Write program to having list of Emplyee (eId, name,salary) object and
1.obtain list of employees having name ends with "m"
2.Obtain list employees in sorted order of name
3. obtain list of employees in descending order of salary
4. Obtain total salary paid on employees
5. obtain maximum  and minimum salary paid
6. Count total number of employees having salary greater than 70k
USE STREAM API
*/