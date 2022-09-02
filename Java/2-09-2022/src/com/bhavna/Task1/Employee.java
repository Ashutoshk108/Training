package com.bhavna.Task1;

import java.util.*;
public class Employee {
	static Scanner sc=new Scanner(System.in);
	private int eId;
	private String name;
	private String department;
	private final static String company_name="Bhavna Corp";
	
	
	public Employee(int eId, String name, String department) {
		super();
		this.eId = eId;
		this.name = name;
		this.department = department;
	}
	
	public static void show(Employee obj) {
		System.out.println("Employee Id: "+obj.eId);
		System.out.println("Employee name: "+obj.name);
		System.out.println("Employee Department: "+obj.department);
		System.out.println("Employee Company name: "+Employee.company_name);
		System.out.println("\n");
	}
	
	public static Employee createEmployee() {
		System.out.println("Enter employee id, name and department: ");
		int eId=sc.nextInt();
		String name=sc.next();
		sc.nextLine();
		String department=sc.nextLine();
		return new Employee(eId, name, department);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter employee id, name and department: ");
		int eId=sc.nextInt();
		String name=sc.next();
		sc.nextLine();
		String department=sc.nextLine();
		Employee e2;
		Employee e1=new Employee(eId, name, department);
		e2=e1;
		show(e2);
		Employee e3=createEmployee();
		show(e3);

	}

}
/*
Write program to demonstrate use of
1. change the reference
2. return reference
3. passing reference as argument to method
Observe output
Use Employee class for demonstration
*/