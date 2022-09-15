package com.bhavna.task2;

import java.util.Scanner;

public class TryWithResourceDemo {
	public void inputOutput() {
		try(Scanner sc=new Scanner(System.in)) {
			System.out.print("Enter any name: ");
			String name=sc.nextLine();
			System.out.println("Entered string is: "+name);
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
