package com.bhavna.task2;

import java.util.*;
public class CompanyTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no. of records that you want to insert: ");
		int n=sc.nextInt();
		Company[] obj;
		obj=new Company[n];
		for(int i=0;i<n;i++) {
			System.out.println("For "+(i+1)+"th company:-");
			System.out.print("Enter company id: ");
			int cId=sc.nextInt();
			System.out.print("Enter company name: ");
			String name=sc.next();
			System.out.print("Enter city name: ");
			String city=sc.next();
			System.out.print("Enter company turnover: ");
			int turnover=sc.nextInt();
			System.out.print("Enter no. of employees: ");
			int noOfEmp=sc.nextInt();
			obj[0]=new Company(cId, name, city, turnover, noOfEmp);
			System.out.println();
		}
		sc.close();
		System.out.println("C_ID\tName\tCity\tTurnover\tNo. of Emp");
		for(Company comp:obj) {
			comp.display();
		}
		
		System.out.println("Record of companies with employees > 100");
		for(Company comp:obj) {
			if(comp.getNoOfEmp()>10) {
				comp.display();
			}
			
		}
		
		System.out.println("Record of companies which are located in patna");
		for(Company comp:obj) {
			if(comp.getCity().equals("Patna")) {
				comp.display();
			}
			
		}
		
		System.out.println("Record of companies with turnover between 1000 and 10000");
		for(Company comp:obj) {
			if(comp.getTurnover()>=1000 && comp.getTurnover()<=10000) {
				comp.display();
			}
			
		}
	}

}
/*
Write Program to accept the Company records as cId,name,city,turnover,number of emloyees
and
1.Display All Companies
2.Display All Companies having employee greater than 100
3. Display All Companies  from Patan
4. Display All Companies Record having turnover between 1000-10000
*/