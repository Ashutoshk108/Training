package com.bhavna.task1;

import java.util.*;
public class ArrayExample {
	private int n;
	private int[] arr;
	
	public ArrayExample(int n) {
		//super();
		this.n = n;
		arr = new int[n];
	}

	public void populateArray() {
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<n;i++) {
			System.out.print("Enter "+(i+1)+"th element in the array: ");
			arr[i]=sc.nextInt();
		}
		sc.close();
	}
	
	public void display() {
		System.out.println("Array elements are as following: ");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public void sum() {
		int sum=0;
		for(int e:arr) {
			sum+=e;
		}
		System.out.println("Sum of all elements in the array is: "+sum);
	}
	
	public void sum(String str) {
		int evenSum=0;
		int oddSum=0;
		
		for(int i=0;i<n;i++) {
			if(arr[i]%2==0) {
				evenSum+=arr[i];
			}else {
				oddSum+=arr[i];
			}
		}
		System.out.println("Sum of elements at even element is: "+evenSum);
		System.out.println("Sum of elements at odd element is: "+oddSum);
	}
	
	
	
}

/*
Write Program to accept elements for integer array and
1. Display All elements
2.Display Sum of all elements
3. Display sum of even elements and odd elements
Use method Overloading and Constructor
*/
