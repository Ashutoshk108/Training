package com.bhavna.Task1;

import java.util.*;
public class Table {
	public static void GenerateTable(int n, int i) {
		if(i>10) {
			return;
		}
		System.out.println(n+" X "+i+" = "+n*i);
		GenerateTable(n,i+1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number to generate it's table: ");
		int n=sc.nextInt();
		sc.close();
		GenerateTable(n,1);
		
	}

}
