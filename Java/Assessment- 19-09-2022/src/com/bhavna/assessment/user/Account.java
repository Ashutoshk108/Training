package com.bhavna.assessment.user;

import java.util.*;
public class Account {
	String firstName;
	String lastName;
	String userName;
	String password;
	String emailId;
	Long phoneNo;
	
	public void register() {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("\t\t*****Registration Page*****");
            System.out.print(" Enter firstName : ");
            String firstName = sc.nextLine();
            this.firstName=firstName;

            System.out.print(" Enter lastName : ");
            String lastName = sc.nextLine();
            this.lastName=lastName;
            
            System.out.print(" Enter userName : ");
            String userName = sc.nextLine();
            this.userName=userName;
            
            System.out.print(" Enter password : ");
            String password = sc.nextLine();
            this.password=password;
            
            System.out.print(" Enter emailId : ");
            String emailId = sc.nextLine();
            this.emailId=emailId;
            
            System.out.print(" Enter phoneNo : ");
            Long phoneNo = sc.nextLong();
            this.phoneNo=phoneNo;
            System.out.println("\t\tRegistration Successful!");
            System.out.println("\n\n");
        }
	}
	public void login() {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("\t\t*****Login Page*****");
            System.out.print(" Enter user name : ");
            userName = sc.nextLine();

            System.out.print(" Enter password : ");
            password = sc.nextLine();

            if ("Ashutosh".equals(userName) && "123456789".equals(password)) {
                System.out.println("\t\tUser successfully logged-in.. ");
            } else {
                System.out.println("\t\tInvalid userName or password ");
            }
            System.out.println("\n\n");
        }
	}

}
