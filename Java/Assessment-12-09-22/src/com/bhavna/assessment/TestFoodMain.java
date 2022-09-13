package com.bhavna.assessment;

import java.util.*;
public class TestFoodMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating scanner object to take input from the user
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1 to register ");
		System.out.println("Enter 2 to log in ");
		System.out.println("Enter 3 to get nearby restaurants: ");
		int choice=sc.nextInt();
		
		//creating object of class Accounts
		Accounts user=new Accounts();
		//calling register method on user object
		if(choice==1) {
			user.register();
		}
		if(choice==2) {
		//calling logInt method on user object
			user.logIn();
		}
		else if(choice==3){
			//asking user to enter his/her location in order to get list of nearby hotels
			System.out.println("\n\nEnter your location to get nearby restaurants:-");
			System.out.print("Latitude: ");
			double latitude=324.2;
			System.out.print(latitude);
			double longitude=154;
			System.out.println("\nLongitude: "+longitude);
			sc.close();
			//creating object of class Restaurants
			Restaurants res=new Restaurants();
			//calling searchHotels() method to display  list of hotels
			res.searchHotels(latitude,longitude);
		}
	}

}
