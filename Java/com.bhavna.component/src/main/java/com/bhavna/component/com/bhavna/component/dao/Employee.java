package com.bhavna.component.com.bhavna.component.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("employeeObj")
public class Employee {
	@Value("Aman")
	private String name;
	@Value("#{}")
	private List<String> language;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getLanguage() {
		return language;
	}
	public void setLanguage(List<String> language) {
		this.language = language;
	}
	public Employee(String name, List<String> language) {
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
