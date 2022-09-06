package com.bhavna.task2;

public class MembershipCard extends Card {
	private int rating;
	
	MembershipCard(String holderName, String cardNumber, String expiryDate, int rating){
		super(holderName, cardNumber, expiryDate);
		this.holderName=holderName;
		this.cardNumber=cardNumber;
		this.expiryDate=expiryDate;
		this.rating=rating;
	}
	
	public int getRating() {
		return this.rating;
	}
	
	public void setRating(int rating) {
		this.rating=rating;
	}
	
	public void display() {
		System.out.println("HolderName\t|CardNumber\t\t|ExpiryDate\t|Rating");
		System.out.println(this.holderName+"\t "+this.cardNumber+"\t "+this.expiryDate+"\t "+this.rating);
	}
}

/*
Create a class named MembershipCard derived from Card. Include the following private attributes / member variables. 
•	Integer rating 
Include appropriate getters and setters. 
Include 4-argument constructor, the order of the arguments is holderName, cardNumber, expiryDate, rating.
Create a class named PaybackCard derived from Card. Include the following private attributes / member variables. 
•	Integer pointsEarned; 
•	Double totalAmount; 
Include appropriate getters and setters.
Include a 5-argument constructor, the order of the arguments is holderName, cardNumber, expiryDate, pointsEarned, 
totalAmount. 
Create another class called Main. In the method, create instances of the above classes and test the above classes.  
 
Note: The card details are entered separated by a ‘|’.
*/