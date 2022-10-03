package com.bhavna.service;

import java.util.Scanner;

import com.bhavna.bean.Account;

public class AccountService {
	Account acntObj=new Account();

	public void register() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\t\t*****Registration Page*****");
		System.out.print(" Enter firstName : ");
		String firstName = sc.nextLine();
		acntObj.setFirstName(firstName);

		System.out.print(" Enter lastName : ");
		String lastName = sc.nextLine();
		acntObj.setLastName(lastName);

		System.out.print(" Enter userName : ");
		String userName = sc.nextLine();
		acntObj.setUserName(userName);

		System.out.print(" Enter password : ");
		String password = sc.nextLine();
		acntObj.setPassword(password);

		System.out.print(" Enter emailId : ");
		String emailId = sc.nextLine();
		acntObj.setEmailId(emailId);

		System.out.print(" Enter phoneNo : ");
		Long phoneNo = sc.nextLong();
		acntObj.setPhoneNo(phoneNo);
		System.out.println("\t\tRegistration Successful!");
		System.out.println("\n\n");
		sc.close();

	}

	public void login() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\t\t*****Login Page*****");
		System.out.print(" Enter user name : ");
		String userName=sc.nextLine();

		System.out.print(" Enter password : ");
		String password = sc.nextLine();

		if ("Ashutosh".equals(userName) && "123456789".equals(password)) {
			System.out.println("\t\tUser successfully logged-in.. ");
		} else {
			System.out.println("\t\tInvalid userName or password ");
		}
		System.out.println("\n\n");
		sc.close();

	}


}
