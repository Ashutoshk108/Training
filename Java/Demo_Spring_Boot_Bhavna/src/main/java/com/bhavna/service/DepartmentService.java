package com.bhavna.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhavna.dao.DepartmentDao;

@Service
public class DepartmentService {
	
	@Autowired
	private DepartmentDao dao;
	

}
