package com.bhavna.assessment;

import java.util.*;
public class TestFoodMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating scanner object to take input from the user
		Scanner sc=new Scanner(System.in);
		//creating object of class Accounts
		Accounts user=new Accounts();
		//calling register method on user object
		user.register();
		System.out.println("\n\n");
		
		//calling logInt method on user object
		user.logIn();
		
		//asking user to enter his/her location in order to get list of nearby hotels
		System.out.println("Enter your location to get nearby hotels:-");
		System.out.print("Latitude: ");
		double latitude=sc.nextDouble();
		double longitude=sc.nextDouble();
		sc.next();
		//creating object of class Restaurants
		Restaurants res=new Restaurants();
		//calling searchHotels() method to display  list of hotels
		res.searchHotels(latitude,longitude);
	}

}
