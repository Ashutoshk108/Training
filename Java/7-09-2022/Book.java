package com.bhavna.task1;

public class Book implements Comparable<Book>{
	private String name;
	private String author;
	private int price;
	private String date;
	
	public Book() {
		
	}
	
	public Book(String name, String author, int price, String date) {
		super();
		this.name = name;
		this.author = author;
		this.price = price;
		this.date = date;
	}
	
	public void display() {
		System.out.println(this.name+"\t"+this.author+"\t"+this.price+"\t"+this.date);
	}
	
	public void search(Book[] obj, String name) {
		for(Book b:obj)
		if(b.name.equals(name)) {
			b.display();
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	public int compareTo(Book b)
    {
		if(this.getDate().compareTo(b.getDate()) != 0) {
            return b.getDate().compareTo(this.getDate());
        }
        else {
            return 0;
        }
		
    }
}

/*class sortByPriceThenName implements Comparator<Book>{
	public int compare(Book o1, Book o2) {
		return 1;
	}
}
*/


/*
Write Java program to accept record of Books and store in array of object.
1. Display All Records
2. Search book by name
3. Display All Book Record Sorted by price and Name of Book
4. Display Record  of all Books in decending order of date.
*/