package com.bhavna.task1;

import java.util.*;
public class DeliveryTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Option 1: Batsman and Bowler details of the delivery");
		System.out.println("Option 2: Number of runs scored in the delivery Based on user’s input");
		System.out.print("User's choice: ");
		int n=sc.nextInt();
		Delivery obj=new Delivery();
		if(n==1) {
			System.out.print("Enter last name of the bowler: ");
			String bowler=sc.next();
			System.out.print("Enter last name of the batsman: ");
			String batsman=sc.next();
			obj.displayDeliveryDetails(bowler, batsman);
		}else if(n==2) {
			System.out.print("Enter runs: ");
			Long runs=sc.nextLong();
			obj.displayDeliveryDetails(runs);
		}

	}

}
