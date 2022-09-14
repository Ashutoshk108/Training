package com.bhavna.task2;

public class TesterFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileHandling obj=new FileHandling();
		Players p=new Players("Virat Kohli","Royal Challengers Bangalore",16);
		obj.addPlayer(p);
		obj.displayPlayer();
	}

}
