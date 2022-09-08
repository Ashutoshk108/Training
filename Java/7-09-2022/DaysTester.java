package com.bhavna.task1;

import java.util.*;
public class DaysTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number between 1 and 7 to get a day: ");
		int n=sc.nextInt();
		sc.close();
		for(Days d:Days.values()) {
			if(d.key==n) {
				System.out.println(d);
			}
			
		}
	}

}

