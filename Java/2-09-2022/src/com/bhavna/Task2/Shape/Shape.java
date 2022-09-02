package com.bhavna.Task2.Shape;

public class Shape {
	protected String shapeName;
	
	
	public Shape(String shapeName) {
		super();
		this.shapeName = shapeName;
	}


	public double calculateArea() {
		return 0;
	}


	public String getShapeName() {
		return shapeName;
	}


	public void setShapeName(String shapeName) {
		this.shapeName = shapeName;
	}

}

/*
Write a program to calculate the area of the given shape using a menu driven
application. 
Create a base class called Shape. 
Data members: 
protected String shapeName; 
Methods: 
calculateArea() – Return type of this method is Double. This method should
return the value 0.   
Constructor: 
Create a single argument constructor that initializes the shapeName. 
 
Create a class called Square that extends Shape 
Data members: 
side – of type Integer. 
Methods: 

calculateArea() – calculates and ret
Methods: 
calculateArea() – calculates and returns the area of the square. The return type of this method is Double. 
Constructor: 
Create a constructor that initializes the side. (1-argument constructor).  
Call the super class constructor to initialize the shapeName as "Square". 
 
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