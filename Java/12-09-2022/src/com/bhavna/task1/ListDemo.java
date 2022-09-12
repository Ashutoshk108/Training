package com.bhavna.task1;

import java.util.*;
public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> lst=new ArrayList<String>();
		lst.add("Dog");
		lst.add("Cow");
		lst.add("Tiger");
		lst.add("Lion");
		
		System.out.println("Using Simple for:-");
		for(int i=0;i<lst.size();i++) {
			System.out.print(lst.get(i)+" ");
		}
		
		System.out.println("\n\nUsing advanced for:-");
		for(String s:lst) {
			System.out.print(s+" ");
		}
		
		System.out.println("\n\nUsing Iterator:-");
		Iterator<String> iter=lst.iterator();
		while(iter.hasNext()) {
			System.out.print(iter.next()+" ");
		}
		
		System.out.println("\n\nUsing listIterator:-");
		ListIterator<String> lI=lst.listIterator();
		System.out.println("Forward traversing:-");
		while(lI.hasNext()) {
			System.out.print(lI.next()+" ");
		}
		
		System.out.println("\n\nBackward traversing:-");
		while(lI.hasPrevious()) {
			System.out.print(lI.previous()+" ");
		}
	}

}

/*
Write Program to create new array list , add some animals name in it as String and display 
each element by using-simple for -Advanced for - Iterator -ListIterator
*/