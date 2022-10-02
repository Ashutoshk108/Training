package com.bhavna.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bhavna.bean.Company;


public class App {
	public static void main(String[] args) {
		ApplicationContext appContxtObj = new ClassPathXmlApplicationContext("Config.xml");

		Company comp=(Company) appContxtObj.getBean("companyObj");
		System.out.println(comp);
		System.out.println(comp.getEmployee());
		System.out.println(comp.getDepartment());
		((ClassPathXmlApplicationContext) appContxtObj).close();
	}
}
