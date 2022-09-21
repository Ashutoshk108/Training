package com.bhavna.task1;

import java.util.*;
import java.util.stream.Collectors;
public class MyStreamDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> num=Arrays.asList(1,2,3,4,5);
		
		List<Integer> square=num.stream()
				.map(n->n*n)
					.collect(Collectors.toList());
		System.out.println("num: "+num);
		System.out.println("Square: "+square);
		
		
		System.out.print("\nAll even numbers in present in num: ");
		num.stream()
			.filter(n->n%2==0)
			.forEach(a->System.out.print(a+" "));
		
		System.out.println("\n");
		System.out.print("Sum of all numbers in num array: ");
		int sum=num.stream()
					.reduce(0,(n,i)->n+i);
		System.out.print(sum);

	}

}
/*
Write program to demonstrate use of intermediate operations and terminating operations methods
of stream
Use filter,sorted,limit,map,collect,forEach,reduce
*/