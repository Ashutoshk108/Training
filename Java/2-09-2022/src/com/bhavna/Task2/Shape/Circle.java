package com.bhavna.Task2.Shape;

public class Circle extends Shape {
	protected int radius;

	public Circle(int radius) {
		super("Circle");
		this.radius = radius;
	}
	
	public double calculateArea() {
		return Math.PI*radius*radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
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