package com.bhavna.task1;

public class SelectionSortMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[] {5,4,3,2,8,1};
		System.out.print("Array before sorting: ");
		for(int e: arr) {
			System.out.print(e+" ");
		}
		SelectionSort.Sort(arr);
		System.out.print("\nArray after sorting: ");
		for(int e: arr) {
			System.out.print(e+" ");
		}

	}

}
