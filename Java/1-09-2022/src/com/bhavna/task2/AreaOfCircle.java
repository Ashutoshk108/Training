package com.bhavna.task2;

public class AreaOfCircle {
	public double pi;
	public double radius;
	
	AreaOfCircle(double pi, double radius){
		this.pi=pi;
		this.radius=radius;
	}
	AreaOfCircle(double radius){
		this.pi=Math.PI;
		this.radius=radius;
	}
	
	public static void display(AreaOfCircle obj) {
		System.out.println("Area of circle: "+(obj.pi*obj.radius*obj.radius));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AreaOfCircle obj=new AreaOfCircle(5.6);
		display(obj);
		AreaOfCircle obj1=new AreaOfCircle(3.14, 5.6);
		display(obj1);

	}

}
