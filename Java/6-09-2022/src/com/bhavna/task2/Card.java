package com.bhavna.task2;

abstract public class Card {
	
	protected String holderName;
	protected String cardNumber;
	protected String expiryDate;
	
	Card(String holderName, String cardNumber, String expiryDate){
		this.holderName=holderName;
		this.cardNumber=cardNumber;
		this.expiryDate=expiryDate;
	}
	
	abstract public void display();

}

/*
Write a program to read and display the card details. A card can be any one of the two types, either Payback or Membership. 
Based on the type of card, the kind of details to be displayed varies. Refer details below.
Payback Card: 
1. Card Number 
2. Points Earned 
3. Total Amount
Membership Card: 
1. Card Number 
2. Rating 
 Create an abstract class named Card with the following protected attributes / member variables. 
•	String holderName;
•	String cardNumber; 
•	String expiryDate; 
Include appropriate getters and setters. 
Include 3-argument constructor, the order of the arguments is holderName, cardNumber, expiryDate.



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