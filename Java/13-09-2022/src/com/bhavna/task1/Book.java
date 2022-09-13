package com.bhavna.task1;

public class Book implements Comparable<Book> {
	private int bookId;
	private String name;
	private int price;
	private String author;
	
	Book(){
		
	}
	
	public Book(int bookId, String name, int price, String author) {
		super();
		this.bookId = bookId;
		this.name = name;
		this.price = price;
		this.author = author;
	}

	public void display() {
		System.out.println(this.bookId+"\t"+this.name+"\t"+this.price+"\t"+this.author);
	}

	public int getBookId() {
		return bookId;
	}


	public void setBookId(int bookId) {
		this.bookId = bookId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String toString() {
		return this.bookId+"\t"+this.name+"\t"+this.price+"\t"+this.author;
	}
	
	public int compareTo(Book b) {
		if(this.getPrice()>b.getPrice()) return -1;
		else if(this.getPrice()<b.getPrice()) return 1;
		else return 0;
	}
	
	public boolean equals(Object obj)
    {
          
    // checking if both the object references are 
    // referring to the same object.
    if(this == obj)
            return true;
          
        // it checks if the argument is of the 
        // type Geek by comparing the classes 
        // of the passed argument and this object.
        // if(!(obj instanceof Geek)) return false; ---> avoid.
        if(obj == null || obj.getClass()!= this.getClass())
            return false;
          
        // type casting of the argument. 
        Book book = (Book) obj;
          
        // comparing the state of argument with 
        // the state of 'this' Object.
        return (book.name == this.name && book.bookId == this.bookId);
    }
      
    @Override
    public int hashCode()
    {
          
        // We are returning the Geek_id 
        // as a hashcode value.
        // we can also return some 
        // other calculated value or may
        // be memory address of the 
        // Object on which it is invoked. 
        // it depends on how you implement 
        // hashCode() method.
        return this.bookId;
    }
      
}



/*
Write program to create get details of book (bookId,name,price,Author) store it into set.
1. display all boo details
2. Display books in descending order  of price
3. implement hashcode and equals method to ensure that only unique record will be added 
show demo
*/