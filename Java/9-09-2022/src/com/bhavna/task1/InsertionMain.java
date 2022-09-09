package com.bhavna.task1;

public class InsertionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[] {9,12,5,4,3,2,8,1};
		System.out.print("Array before sorting: ");
		for(int e: arr) {
			System.out.print(e+" ");
		}
		Insertion.sort(arr);
		System.out.print("\nArray after sorting: ");
		for(int e: arr) {
			System.out.print(e+" ");
		}
	}

}
