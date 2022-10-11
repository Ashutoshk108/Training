package com.bhavna.dao;

import java.util.*;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.bhavna.entity.Employee;


public class EmployeeDao {
	public static void addEmployee() {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("unit1");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Employee emp=new Employee(102,"Aman",90);
		entityManager.getTransaction().begin();
		entityManager.persist(emp);
		entityManager.getTransaction().commit();
		entityManager.close();
		
	}
	public static void updateEmployee() {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("unit1");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Employee emp=new Employee(101,"Axat kumar",86);
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
		
	}
	public static void viewEmployee() {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("unit1");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		List<Employee> listEmployee = entityManager.createQuery("SELECT e FROM Employee e").getResultList();

		if (listEmployee == null) {
			System.out.println("No employee found . ");
		} else {
			for (Employee empl : listEmployee) {
				System.out.println(empl);
			}
		}
		entityManager.getTransaction().begin();
		//entityManager.merge(emp);
		entityManager.getTransaction().commit();
		entityManager.close();
		
	}
}
