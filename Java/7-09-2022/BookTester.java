package com.bhavna.task1;

import java.util.*;
public class BookTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book obj=new Book();
		Book[] b=new Book[3];
		b[0]=new Book("Book1","Richard Feynman",500,"08-1998");
		b[1]=new Book("Book2","Joseph Murphy",200,"02-1988");
		b[2]=new Book("Book3","James Rowling",300,"06-1989");
		System.out.println("Book\t|Author\t\t|Price\t|Date");
		for(Book book:b) {
			book.display();
		}
		Arrays.sort(b);
		//Arrays.binarySearch();
		System.out.println("\nBooks after sorting by date: ");
		System.out.println("Book\t|Author\t\t|Price\t|Date");
		for(Book book:b) {
			book.display();
		}
		
		System.out.println("\nDetails of searched book is: ");
		System.out.println("Book\t|Author\t\t|Price\t|Date");
		obj.search(b,"Book1");
	}

}
