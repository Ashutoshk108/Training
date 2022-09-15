package com.bhavna.task2;

import java.util.*;
public class TesterInvalidAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your age: ");
		int age=sc.nextInt();
		InvalidAge obj=new InvalidAge();
		obj.checkAge(age);
		sc.close();
	}

}
