package com.bhavna.Task2.Shape;

public class Square extends Shape {
	protected int side;

	public Square(int side) {
		super("Square");
		this.side = side;
	}
	
	public double calculateArea() {
		return this.side*this.side;
	}

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}
	
	

}

/*
 
Create a class called Rectangle that extends Shape
Data members: 
length – of type Integer. 
breadth – of type Integer. 
Methods: 
calculateArea() – calculates and returns the area of the Rectangle. The return type of this method is Double. 
Constructor: 
Create a constructor that initializes the length and breadth. (2-argument constructor).  
Call the super class constructor to initialize the shapeName as "Rectangle".
 
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