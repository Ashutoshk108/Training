package com.bhavna.task1;

public class Search {
	public static void search(int[] arr, int item) {
		for(int i=0;i<arr.length;i++) {
			if(item==arr[i]) {
				System.out.println(item+" is present at "+i+"th index");
				return;
			}
		}
		System.out.println(item+" not found");
		return;
	}
	
	public static void binarySearch(int[] arr, int frst, int lst, int item) {
		int mid=(frst+lst)/2;
		
		while(frst<=lst) {
			if(item==arr[mid]) {
				System.out.println(item+" is found at "+mid+"th index.");
				break;
			}else if(arr[mid]<item) {
				frst=mid+1;
			}else if(arr[mid]>item) {
				lst=mid-1;
			}
			mid=(frst+lst)/2;
		}
		if(frst>lst) {
			System.out.println(item+" not present in the array.");
		}
	}

}
