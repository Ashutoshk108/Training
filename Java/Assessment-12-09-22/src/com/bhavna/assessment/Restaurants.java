package com.bhavna.assessment;

import java.util.*;

public class Restaurants{
	//method to search for the hotel using current location
	public void searchHotels(double latitude, double longitude) {
		int num=noOfHotels();
		if(num<5) {
			System.out.println("Checking within the radius of 2.5 km");

		}else {
			System.out.println("Checking within the radius of 1.5 km");
			
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
		System.out.println("Restaurants available in your area:-");
		for(int i=1;i<=n;i++) {
			System.out.println("Restaurant "+i);
		}
	}

}
