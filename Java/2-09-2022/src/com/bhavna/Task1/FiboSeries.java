package com.bhavna.Task1;

import java.util.*;
public class FiboSeries {
	public static int fibo(int n) {
		if(n<=1) {
			return n;
		}
		return fibo(n-1)+fibo(n-2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value of n to generate fibonacci series: ");
		int n=sc.nextInt();
		sc.close();
		for(int i=0;i<n;i++) {
			System.out.print(fibo(i)+" ");
		}

	}

}
