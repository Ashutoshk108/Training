package com.bhavna.task1;

public class Delivery {
	void displayDeliveryDetails(String bowler, String batsman) {
		System.out.println("Bowler is: "+bowler);
		System.out.println("Batsman is: "+batsman);
	}
	
	void displayDeliveryDetails(Long runs) {
		if(runs==4) {
			System.out.println("It is a boundary");
		}else if(runs==6) {
			System.out.println("It is a sixer");
		}else {
			System.out.println(runs);
		}
	}
}

/*
Hope you would have used a cricket website that provides a ball by ball text commentary. Write 
a program to automate the text messages for each delivery. Initially we must automate the below 
two display variations: Option 1: Batsman and Bowler details of the delivery Option 2: Number of 
runs scored in the delivery Based on user’s input, either the Option 1 or Option 2 details will be
 displayed to the user.Note: Create a class named Delivery.

There are no attributes in this class. Include the following methods in the Delivery class. 
•    void displayDeliveryDetails(String bowler, String batsman) --- In this method, print 
the last names of the bowler and batsman of that particular delivery.

•    void displayDeliveryDetails(Long runs) --- In this method, display the run details of that
 delivery. 
If the number of runs scored in that delivery is 6 or 4 then display “It is a Sixer.” or “It is a
 boundary.” along with the number of runs, else print only the number of runs. Create a Main class
  to read the user inputs and invoke he displayDeliveryDetails() with appropriate parameters.
*/