package com.bhavna.entity;

import javax.persistence.Entity;
import javax.persistence.*;

@Entity
/*@NamedQuery(
    name="findAllEmployeesByName",
    query="select e FROM Employee e WHERE e.name='Axat'"
)*/
@NamedQueries(
		{
		@NamedQuery(name="findAllEmployeesByName",query="select e FROM Employee e WHERE e.name='Axat'"),
		@NamedQuery(name="findEmployeesWithSalaryOver50",query="select e FROM Employee e WHERE e.salary>50")
		}
)
public class Employee {
	@Id
	private int eId;
	private String name;
	private int salary;
	private String address;
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Employee(int eId, String name, int salary, String address) {
		super();
		this.eId = eId;
		this.name = name;
		this.salary = salary;
		this.address = address;
	}
	public Employee() {
		super();
	}
	
	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", name=" + name + ", salary=" + salary + ", address=" + address + "]";
	}
	
}
