package com.bhavna.task1;

import java.util.*;
import java.util.stream.Collectors;
public class EmployeeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1=new Employee(1,"Aman",80000);
		Employee emp2=new Employee(2,"Abhijeet",70000);
		Employee emp3=new Employee(3,"Vivek",100000);
		Employee emp4=new Employee(4,"Karan",50000);
		Employee emp5=new Employee(5,"Muneem",60000);
		
		List<Employee> empLst=new ArrayList<Employee>();
		empLst.add(emp1);
		empLst.add(emp2);
		empLst.add(emp3);
		empLst.add(emp4);
		empLst.add(emp5);
		
		//to display employee having name ends with 'm'
		System.out.println("\nEmployee whose name ends with 'm'");
		List<Employee> emp=empLst.stream()
							.filter(em->em.getName().endsWith("m"))
								.collect(Collectors.toList());
		System.out.println(emp);
		
		System.out.println("\nList of employees sorted by their name: ");
		//to sort employees based on name
		List<Employee> sortedEmp=empLst.stream()
				.sorted()
					.collect(Collectors.toList());
		
		for(Employee e:sortedEmp)
			System.out.println(e);
		
		System.out.println("\nList of employees in descending order of salary:-");
		empLst.stream()
			.sorted(Comparator.reverseOrder())
				.forEach(item->System.out.println(item));
		
		System.out.println("\n");
		Optional<Employee> maxSalaryEmp = 
	            empLst.stream()
	            .collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));
	    System.out.println("Employee with max salary:"
	            + (maxSalaryEmp.isPresent()? maxSalaryEmp.get():"Not Applicable"));
		
	    System.out.println("\n");
	    Optional<Employee> minSalEmp =    
	            empLst.stream()
	            .collect(Collectors.minBy(Comparator.comparing(Employee::getSalary)));
	    System.out.println("Employee with min Salary:"
	            + (minSalEmp.isPresent()? minSalEmp.get():"Not Applicable"));
		
	    System.out.println("\n");
	    Integer totalSal =    
	            empLst.stream()
	            	.collect(Collectors.summingInt(Employee::getSalary));
	    System.out.println("Total Salary paid: "+totalSal);
	    
	    System.out.println("\n");
	    
	    List<Employee> l1=empLst.stream()
	    	.filter(E->E.getSalary()>70000)
	    		.collect(Collectors.toList());
	    System.out.println("Total number of employees having salary greater than 70k: "+l1.size());
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