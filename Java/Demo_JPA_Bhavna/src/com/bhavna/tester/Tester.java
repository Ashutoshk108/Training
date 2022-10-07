package com.bhavna.tester;

import com.bhavna.dao.EmployeeDao;

public class Tester {

	public static void main(String[] args) {
		EmployeeDao daoObj=new EmployeeDao();
		//daoObj.addEmployee();
		//daoObj.updateEmployee();
		//daoObj.deleteEmployee();
		daoObj.viewEmployee();
	}
	
}
