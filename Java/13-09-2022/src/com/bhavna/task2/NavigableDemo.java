package com.bhavna.task2;

import java.util.*;

public class NavigableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NavigableSet<String> lstOfNames = new TreeSet<>();
		lstOfNames.add("Alex");
		lstOfNames.add("Ethan");
		lstOfNames.add("Tom");
		lstOfNames.add("George");
		lstOfNames.add("Richard");
		
		// Get a reverse view of the navigable set
		NavigableSet<String> reverseNs = lstOfNames.descendingSet();

		// Print the normal and reverse views
		System.out.println("Normal order: " + lstOfNames);
		System.out.println("Reverse order: " + reverseNs);

				
	}

}
