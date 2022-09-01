package com.bhavna.task1;

import java.util.*;
public class isPrime {
	public static void Prime(int n) {
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0) {
				System.out.println(n+" is not a prime number");
				return;
			}
		}
		System.out.println(n+" is a prime number.");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number to check if it is prime or not: ");
		int n=sc.nextInt();
		sc.close();
		Prime(n);

	}

}
