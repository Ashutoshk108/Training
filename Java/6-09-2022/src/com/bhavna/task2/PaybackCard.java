package com.bhavna.task2;

public class PaybackCard extends Card {
	private int pointsEarned;
	private double totalAmount;
	
	public PaybackCard(String holderName, String cardNumber, String expiryDate, int pointsEarned, double totalAmount) {
		super(holderName, cardNumber, expiryDate);
		this.pointsEarned = pointsEarned;
		this.totalAmount = totalAmount;
	}

	public int getPointsEarned() {
		return pointsEarned;
	}

	public void setPointsEarned(int pointsEarned) {
		this.pointsEarned = pointsEarned;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	
	public void display() {
		System.out.println("HolderName\t|CardNumber\t\t|ExpiryDate\t|PointsEarned\t|TotalAmount");
		System.out.println(this.holderName+"\t "+this.cardNumber+"\t "+this.expiryDate+"\t "+this.pointsEarned+"\t\t "+this.totalAmount);
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