package com.bhavna.task1;

import java.util.*;
public class BookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<Book> hs=new HashSet<Book>();
		hs.add(new Book(1,"Journey of truth",234,"Alex"));
		hs.add(new Book(2,"The science of life",300,"Ram"));
		hs.add(new Book(3,"The psycology of humans",269,"Ethan"));
		hs.add(new Book(3,"The psycology of humans",269,"Ethan"));
		
		System.out.println("Book_ID\tName\t\t\tPrice\tAuthor");
		for(Book b:hs) {
			b.display();
		}
		
		//System.out.println(hs);
		System.out.println();
		List<Book> lst = new ArrayList<Book>(hs);
        Collections.sort(lst);
		System.out.println("Book_ID\tName\t\t\tPrice\tAuthor");
		for(Book b:lst) {
			b.display();
		}
	}

}


//ArrayList<Book> lst=new ArrayList<Book>();
//lst.add(new Book(1,"Journey of truth",234,"Alex"));
//lst.add(new Book(2,"The science of life",300,"Ram"));
//lst.add(new Book(3,"The psycology of humans",269,"Ethan"));