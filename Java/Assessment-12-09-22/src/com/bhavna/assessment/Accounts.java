package com.bhavna.assessment;

import java.util.*;
public class Accounts{
	
	//method to register user
	public void register() {
		Scanner sc=new Scanner(System.in);
		System.out.println("----Registration page----");
		System.out.print("Enter your name: ");
		String name=sc.next();
		System.out.print("Enter your email id: ");
		String email=sc.next();
		System.out.print("Enter your mobile number: ");
		long mob=sc.nextLong();
		sc.close();
		System.out.println("\n\t\tRegistration successful\n\n");
		System.out.println("You are registered as "+name+" with email Id as "+email+" and mobile number as "+mob);		
	}
	
	//method to log in user 
	public void logIn() {
        Scanner sc = new Scanner(System.in);
        System.out.println("----Login Page----");
        System.out.println("Enter your register mobile number");
        //long mobileNumber = sc.nextLong();
        long mobileNumber=1243565;
        System.out.println("Kidly verify your number by entering otp: ");
        //int otp = sc.nextInt();
        int otp=1234;
        sc.close();
        System.out.println("Mobile number entered by user: "+mobileNumber);
        System.out.println("Otp entered by user: "+otp);
        System.out.print("\n\t Login Successful");
        
    }

}
