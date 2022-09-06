package com.bhavna.task1;

import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int n=sc.nextInt();
		sc.close();
		ArrayExample obj=new ArrayExample(n);
		obj.populateArray();
		System.out.println();
		obj.display();
		obj.sum();
		obj.sum("s");

	}

}

