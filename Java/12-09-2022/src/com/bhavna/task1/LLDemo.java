package com.bhavna.task1;

import java.util.*;
public class LLDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> countries=new LinkedList<String>();
		countries.add("India");
		countries.add("Japan");
		countries.add("China");
		countries.add("Russia");
		
		ArrayList<String> lst=new ArrayList<String>();
		
		System.out.println("Using Linked list:-");
		Iterator<String> iter=countries.iterator();
		while(iter.hasNext()) {
			System.out.print(iter.next()+" ");
		}
		lst.add("UK");
		lst.add("USA");
		lst.add("UAE");
		lst.add("France");
		System.out.println("\n\nUsing Arraylist:-");
		iter=lst.iterator();
		while(iter.hasNext()) {
			System.out.print(iter.next()+" ");
		}

	}

}

/*
Write Program to create link list add Country names in it as String. Create new array list 
similar with link list. Display content of both using Iterator
*/