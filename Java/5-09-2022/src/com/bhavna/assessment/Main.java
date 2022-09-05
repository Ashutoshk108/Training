package com.bhavna.assessment;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("\tArea Calculator for different Shapes");
		System.out.println("\t************************************");
		System.out.println("Enter 1 for Square");
		System.out.println("Enter 2 for Rectangle");
		System.out.println("Enter 3 for Circle");
		System.out.println("Enter 4 for Hexagon");
		System.out.println("Enter any other Number to exit");
		int choice=sc.nextInt();
		
		if(choice==1) {
			System.out.print("Enter value for side: ");
			int side=sc.nextInt();
			Square obj=new Square(side);
			System.out.println("Area of Square: "+obj.calculateArea());
		}else if(choice==2) {
			System.out.print("Enter value for length: ");
			int length=sc.nextInt();
			System.out.print("Enter value for breadth: ");
			int breadth=sc.nextInt();
			Rectangle obj=new Rectangle(length,breadth);
			System.out.println("Area of Rectangle: "+obj.calculateArea());
		}else if(choice==3) {
			System.out.println("Enter value for radius: ");
			int radius=sc.nextInt();
			Circle obj=new Circle(radius);
			System.out.println("Area of Circle: "+obj.calculateArea());
		}else if(choice==4){
			System.out.print("Enter value for side: ");
			int side=sc.nextInt();
			Hexagons obj=new Hexagons(side);
			System.out.println("Area of Square: "+obj.calculateArea());
		}else {
			System.out.println("Wrong choice");
		}
		sc.close();
	}

}

/*
We are enhancing the Area of a Shape to support calculation of area for Hexagon. 

Area of a Hexagon needs to be calculated, but the formula to calculate area is not known at the 
time of implementation. Hence, we are required to create the class Hexagon and not implement any
method for calculating the area. Copy and paste all the classes available in the previous “Area
of a Shape” program. Create a new class named Hexagon as per the specifications mentioned below.
Note: 

Create a class called Hexagon that extends Shape 
Data members: 
side – of type Integer.

Constructor: 
Create a constructor that initializes the side. (1-argument constructor).  
Call the super class constructor to initialize the shapeName as "Hexagon". 
Include appropriate getters and setters in all the given classes. 
Create a class Main to capture the input details from the user and display
 the calculated area to the user.
*/