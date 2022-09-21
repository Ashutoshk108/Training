package com.bhavna.task1;

import java.util.*;
import java.util.stream.Collectors;

public class StreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names=new ArrayList<String>();
		names.add("Sahil");
		names.add("Jitu");
		names.add("Venkatesh");
		names.add("Vanshika");
		names.add("Aman");
		names.add("Vivek");
		names.add("Vijay");
		
		List<String> name=names.stream()
							.filter(nam->nam.startsWith("V"))
								.sorted()
									.limit(3)
										.collect(Collectors.toList());
		System.out.println(names);
		System.out.println(name);
	}

}
/*
Write program to demonstrate use of intermediate operations and terminating operations methods
of stream
Use filter,sorted,limit,map,collect,forEach,reduce
*/