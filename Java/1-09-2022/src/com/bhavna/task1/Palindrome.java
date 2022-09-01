package com.bhavna.task1;

import java.util.*;

public class Palindrome {
	public static void isPalindrome(int n) {
		int sum=0;
		int temp,remainder;
		
		temp=n;
		
		while(n>0) {
			remainder=n%10;
			sum=(sum*10)+remainder;
			n/=10;
		}
		n=temp;
		if(n==sum) {
			System.out.println(n+" is palindrome!");
		}else {
			System.out.println(n+" is not palindrome!");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number to check if it is palindrome or not: ");
		int n=sc.nextInt();
		sc.close();
		isPalindrome(n);

	}

}
