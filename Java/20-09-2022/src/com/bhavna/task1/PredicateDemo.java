package com.bhavna.task1;

import java.util.function.Predicate;
public class PredicateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Integer> isEven=(num)->num%2==0;
		int n=15;
		System.out.println("Is "+n+" even? "+isEven.test(n));
	}

}
