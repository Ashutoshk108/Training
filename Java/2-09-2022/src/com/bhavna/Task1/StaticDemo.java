package com.bhavna.Task1;

public class StaticDemo {
	private String name;
	private int id;
	private static final String type="Living being";
	final String planet="Earth";
	
	StaticDemo(String name, int id){
		this.name=name;
		this.id=id;
	}
	public static void display(StaticDemo obj) {
		System.out.println("Name: "+obj.name);
		System.out.println("Id: "+obj.id);
		System.out.println("Type: "+StaticDemo.type);
		//obj.planet="pluto"; giving error
		System.out.println("Home Planet: "+obj.planet);
		System.out.println("\n\n");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticDemo obj1=new StaticDemo("Jack",1);
		StaticDemo obj2=new StaticDemo("Ethan",2);
		StaticDemo obj3=new StaticDemo("Alex",3);
		display(obj1);
		display(obj2);
		display(obj3);

	}

}

/*
Write program to demonstrate use of
1. static variable
2. final variable
3. static final variable
*/