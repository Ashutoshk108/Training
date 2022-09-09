package com.bhavna.task1;

public class SearchMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[] {5,4,3,2,8,1};
		System.out.println("Linear Search:-");
		Search.search(arr,7);
		Search.search(arr,8);
		
		System.out.println("\nBinary Search:-");
		int[] arr1=new int[] {1,2,3,4,5,6,7,8,9};
		Search.binarySearch(arr1,0,arr1.length-1,5);
		Search.binarySearch(arr1,0,arr1.length-1,15);
	}

}
