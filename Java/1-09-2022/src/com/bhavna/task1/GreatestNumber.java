package com.bhavna.task1;

import java.util.*;
public class GreatestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter 1st number: ");
		int n1=sc.nextInt();
		
		System.out.print("Enter 2nd number: ");
		int n2=sc.nextInt();
		
		System.out.print("Enter 3rd number: ");
		int n3=sc.nextInt();
		sc.close();
		
		if(n1>n2 && n1>n3) {
			System.out.println("Greatest number: "+n1);
		}else if(n2>n1 && n2>n3) {
			System.out.println("Greatest number: "+n2);
		}else {
			System.out.println("Greatest number: "+n3);
		}
	}

}
