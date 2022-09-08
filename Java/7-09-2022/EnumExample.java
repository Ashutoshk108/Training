package com.bhavna.task1;

enum EnumExample {
	Var1("First Variable"),
	Var2("Second Variable"),
	Var3("Third Variable");
	
	private final String info;
	
	private EnumExample(String info) {
		this.info=info;
	}
	
	public String getInfo() {
		return info;
	}
}

/*
Write a program to find the day of the week for the day number given. 1 should return Sun, 2 should return Mon, etc.
Declare and Initialize array in a single line using curly braces.
Sample Input and Output: 
Enter the day number 3 Day of the week is Tue
*/