package com.bhavna.task2;

//import java.util.*;
public class CardMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc=new Scanner(System.in);
		Card obj;
		obj=new MembershipCard("Aman Gupta","4444XXXXXXXX4444","08/2027",4);
		obj.display();
		System.out.println();
		obj=new PaybackCard("Aman Gupta","4444XXXXXXXX4444","08/2027",2987,20000);
		obj.display();
		//sc.close();
		

	}

}
