package com.bhavna.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

import com.bhavna.bean.Department;
import com.bhavna.dao.DepartmentDao;
import com.bhavna.dao.DepartmentDaoImp;
import java.util.*;

@RestController
public class DepartmentController {
	@Autowired
	DepartmentDaoImp dao;
	
	@RequestMapping(value="/createDepartment",method=RequestMethod.POST)
	public String createDepartment(@RequestBody Department department) {
		//Department depart=new Department(11,"Development","Ethan");
		return dao.addDepartment(department);
	}
	@RequestMapping(value="/updateDepartment",method=RequestMethod.PUT)
	public String updateDepartment(@RequestBody Department department) {
		return dao.addDepartment(department);
	}
	@RequestMapping(value="/deleteDepartment",method=RequestMethod.DELETE)
	public String deleteDepartment(@RequestBody int dId) {
		return dao.deleteDepartment(dId);
	}
	@RequestMapping(value="/viewDepartment",method=RequestMethod.GET)
	public List<Department> viewDepartment() {
		return dao.getDepartment();
	}
	@RequestMapping(value="/display",method=RequestMethod.GET)
	public String display() {
		return "In display";
	}
}
