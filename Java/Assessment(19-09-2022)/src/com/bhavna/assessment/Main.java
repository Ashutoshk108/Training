package com.bhavna.assessment;

import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			Scanner sc=new Scanner(System.in);
			System.out.println("\t\t****Welcome to DPhone Corporation****");
			System.out.println("Enter 1 to register");
			System.out.println("Enter 2 to login");
			int choice=sc.nextInt();
			Account usr=new Account();
			if(choice==1) {
				usr.register();
			}else if(choice==2){
				usr.login();
				//System.out.print("Do you want to refer to your friend(y/n)? ");
				//char referralChoice=sc.next().charAt(0);
				Referral user=new Referral();
				int option=1;
				do {
					System.out.println("Enter 1 to insert your friends details ");
					System.out.println("Enter 2 to view your referrals ");
					System.out.println("Enter 3 to edit your referrals ");
					System.out.println("Enter 4 to check your referral points ");
					System.out.println("Enter 5 to exit ");
					//option=sc.nextInt();
					System.out.println("User entered: "+option);
					if(option==1) {
						user.addReferral("Aman","54347678","aman@gmail.com");
						user.addReferral("Sahil","43344769","sahil@gmail.com");
						user.addReferral("Jitu","98654347","jitu@gmail.com");
					}else if(option==2) {
						user.viewReferral();
					}else if(option==3) {
						user.editReferral("Aman","97176538","aman12@gmail.com");
						user.viewReferral();
					}else if(option==4) {
						System.out.println("Your referral point is: "+Referral.getPnts());
						System.out.println("It is equivalent to rs"+Referral.getPnts());
					}
					System.out.println("\n\n");
					System.out.println("User entered: "+option);
					option++;
				}while(option!=5);
				System.out.println("\n\n");
				System.out.println("\t******Welcome to Dphone Corporation*****");
				PurchaseMobile mobileObj=new PurchaseMobile();
				mobileObj.purchase();
				System.out.println("\n\nYour referral point is: "+Referral.getPnts());
				System.out.println("It is equivalent to rs"+Referral.getPnts());
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
