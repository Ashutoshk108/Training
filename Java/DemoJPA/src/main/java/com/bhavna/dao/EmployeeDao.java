package com.bhavna.dao;

import java.util.*;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.*;

import com.bhavna.entity.Employee;



public class EmployeeDao {
	public static void addEmployee(Employee emp) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("unit1");
		System.out.println("Database Information readed");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		//Employee emp=new Employee(102,"Aman",90,"Faridabad");
		entityManager.getTransaction().begin();
		entityManager.persist(emp);
		entityManager.getTransaction().commit();
		entityManager.close();
		
	}
	public static void updateEmployee() {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("unit1");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		Query query=entityManager.createQuery("update Employee e set e.name = 'Aman Gupta' where e.eId=102");
		query.executeUpdate();
		entityManager.getTransaction().commit();
		entityManager.close();
		
	}
	/*
	public static void updateEmployee() {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("unit1");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Employee emp=new Employee(101,"Axat kumar",86,"Delhi");
		entityManager.getTransaction().begin();
		entityManager.merge(emp);
		entityManager.getTransaction().commit();
		entityManager.close();
		
	}
	public static void deleteEmployee() {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("unit1");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Employee emp=entityManager.find(Employee.class,101);
		if(emp!=null) {
			entityManager.remove(emp);
		}
		entityManager.getTransaction().begin();
		//entityManager.merge(emp);
		entityManager.getTransaction().commit();
		entityManager.close();
		
	}*/

	public static void viewEmployee() {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("unit1");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Query query=entityManager.createQuery("Select e from Employee e");
		List<Employee> list=query.getResultList();
		for(Employee emp:list) {
			System.out.println(emp);
		}
		
	}
	public static void demoNamedQuery() {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("unit1");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Query query=entityManager.createNamedQuery("findEmployeesWithSalaryOver50");
		List<Employee> list=query.getResultList();
		for(Employee emp:list) {
			System.out.println(emp);
		}
		
	}
	public static void viewEmployeeBySalary() {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("unit1");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Query query=entityManager.createQuery("select e from Employee e where e.salary>50");
		List<Employee> list=query.getResultList();
		for(Employee emp:list) {
			System.out.println(emp);
		}
		
	}
	public static void viewEmployeeBySalaryParametrized() {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("unit1");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Query query=entityManager.createQuery("select e from Employee e where e.salary>:sal");
		//double sal=50;
		query.setParameter("sal",50);
		List<Employee> list=query.getResultList();
		for(Employee emp:list) {
			System.out.println(emp);
		}
	}
	public static void viewEmployeeBySalaryPositional() {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("unit1");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Query query=entityManager.createQuery("select e from Employee e where e.salary>?1");
		//double sal=50;
		query.setParameter(1,50);
		List<Employee> list=query.getResultList();
		for(Employee emp:list) {
			System.out.println(emp);
		}
	}
}
