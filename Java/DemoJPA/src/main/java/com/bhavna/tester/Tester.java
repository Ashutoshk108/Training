package com.bhavna.tester;

import com.bhavna.dao.EmployeeDao;
import com.bhavna.entity.Employee;

public class Tester {

	public static void main(String[] args) {
		EmployeeDao daoObj=new EmployeeDao();
		//daoObj.addEmployee(new Employee(103,"Axat",50,"Delhi"));
		//daoObj.updateEmployee();
		//daoObj.viewEmployee();
		//daoObj.viewEmployeeBySalary();
		//daoObj.viewEmployeeBySalaryParametrized();
		//daoObj.viewEmployeeBySalaryPositional();
		daoObj.demoNamedQuery();
		
	}
	
}
