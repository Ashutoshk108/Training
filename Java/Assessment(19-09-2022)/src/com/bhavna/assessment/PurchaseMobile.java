package com.bhavna.assessment;

import java.util.*;
public class PurchaseMobile {
    String mobileNumber;
    String name;
    String referralCode;
    
   public void purchase() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Name: ");
        //name=sc.next();
        name="Aman";
        System.out.println(name);
        System.out.print("\nEnter your mobile number: ");
        //mobileNumber= sc.next();
        mobileNumber="544657878";
        System.out.println(mobileNumber);
        System.out.print("\nDo you have referral code(y/n):");
        char choice;
        //choice= sc.nextLine().charAt(0);
        choice='y';
        System.out.println(choice);
        if(choice=='y') {
        	System.out.print("\nEnter your referral code: ");
            //referralCode=sc.next();
        	referralCode="krsmel108";
        	System.out.println(referralCode);
            if(Referral.referralCode.equals(referralCode) && name.equals("Aman")) {
            	//System.out.println("Checkpnt!");
            	Referral.incrementPnts();
            }
        }
        System.out.println("Enjoy your shoping!!");
    }
}