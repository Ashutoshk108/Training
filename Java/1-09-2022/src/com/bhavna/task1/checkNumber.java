package com.bhavna.task1;

import java.util.*;
public class checkNumber {
	public static void check(int n) {
		if(n==0) {
			System.out.println(n+" is zero!");
		}else if(n<0) {
			System.out.println(n+" is a negative number!");
		}else {
			System.out.println(n+" is a positive number!");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n=sc.nextInt();
		sc.close();
		check(n);

	}

}
