package com.bhavna.task2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee[] emp=new Employee[5];
		
		emp[0]=new Employee(1, "Aman", 50000);
		emp[1]=new Employee(2, "Ajay", 55000);
		emp[2]=new Employee(3, "Axat", 60000);
		emp[3]=new Employee(4, "Raj", 45000);
		emp[4]=new Employee(5, "Sahil", 80000);
		
		System.out.println("Record:-");
		System.out.println("E_ID\tName\tSalary\tCompany");
		for(int i=0;i<5;i++) {
			if(emp[i].getSalary()>50000) {
				System.out.println(emp[i].geteId()+"\t"+emp[i].getName()+"\t"+emp[i].getSalary()+"\t"+Employee.getCompany());
			}
		}
		System.out.println("\nTotal number of object: "+emp.length);
		
	}

}
