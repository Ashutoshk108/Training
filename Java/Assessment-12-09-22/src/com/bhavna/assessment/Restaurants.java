package com.bhavna.assessment;

import java.util.*;

public class Restaurants{
	
	//method to search for the hotel using current location
	public void searchHotels(double latitude, double longitude) {
		int num=noOfHotels();
		if(num<5) {
			System.out.println("\nChecking within the radius of 2.5 km");

		}else {
			System.out.println("\nChecking within the radius of 1.5 km");
			
		}
		display(num);
		
	}
	
	//method to determine number of hotels available and it can be between 0 and 10
	public int noOfHotels() {
		Random rand=new Random();
		int max=11;
		int n=rand.nextInt(max);
		
		return n;
	}
	
	public void display(int n) {
		ArrayList<String> rest=new ArrayList<String>();
		rest.add("KFC");
		rest.add("Haldiram");
		rest.add("Bikaner");
		rest.add("Chawla");
		rest.add("Bicano");
		rest.add("McD");
		rest.add("Burger King");
		rest.add("Dominos");
		rest.add("Pizza Point");
		rest.add("Chai Vatika");
		System.out.println("\nRestaurants available in your area:-");
		for(int i=1;i<=n;i++) {
			System.out.println(rest.get(i));
		}
	}

}
