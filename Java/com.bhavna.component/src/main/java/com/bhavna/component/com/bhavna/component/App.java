package com.bhavna.component.com.bhavna.component;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bhavna.component.com.bhavna.component.dao.Company;

public class App {
	public static void main(String[] args) {
		ApplicationContext appContxtObj = new ClassPathXmlApplicationContext("src/main/java/NewFile.xml");

		Company comp=(Company) appContxtObj.getBean("companyObj");
		System.out.println(comp);
	}
}
