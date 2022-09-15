package com.bhavna.task2;

public class InvalidAge {
	public void checkAge(int age) {
		try {
			if(age<19) {
				throw new InvalidAgeException("Invalid Age Exception is raised!");
			}else {
				System.out.println("Entered age is valid!");
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
/*
Write a program that accepts the age of the user as input. When the age of the user is less than 19, a custom exception 
named InvalidAgeException is thrown. Use exception handling mechanisms to handle this exception.
*/