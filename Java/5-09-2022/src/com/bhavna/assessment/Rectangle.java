package com.bhavna.assessment;

public class Rectangle extends Shape {
	protected int length;
	protected int breadth;
	
	public Rectangle(int length, int breadth) {
		super("Rectangle");
		this.length = length;
		this.breadth = breadth;
	}
	
	public double calculateArea() {
		return this.length*this.breadth;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
}

/*

Create a class called Circle that extends Shape
Data members: 
radius – of type Integer. 
Methods: 
calculateArea() – calculates and returns the area of the Circle. The return type of this method is Double. 
Constructor: 
Create a constructor that initializes the radius. (1-argument constructor).  
Call the super class constructor to initialize the shapeName as "Circle". 
 Include appropriate getters and setters in all the given classes. 
Create a class Main to capture the input details from the user and display the calculated area to the use

*/