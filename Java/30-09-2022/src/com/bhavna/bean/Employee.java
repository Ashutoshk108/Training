package com.bhavna.bean;

//import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("employeeObj")
public class Employee {
	@Value("Aman")
	private String name;
	@Value("English")
	private String language;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public Employee(String name, String language) {
		super();
		this.name = name;
		this.language = language;
	}
	public Employee() {
		super();
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", language=" + language + "]";
	}
	
}
