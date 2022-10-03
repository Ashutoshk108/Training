package com.bhavna.service;

import java.util.Scanner;

import com.bhavna.bean.PurchaseMobile;
import com.bhavna.bean.Referral;

public class PurchaseService {
	PurchaseMobile purchaseObj=new PurchaseMobile();
	public void purchase() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Name: ");
        //name=sc.next();
        String name="Aman";
        System.out.println(name);
        System.out.print("\nEnter your mobile number: ");
        //mobileNumber= sc.next();
        String mobileNumber="544657878";
        System.out.println(mobileNumber);
        System.out.print("\nDo you have referral code(y/n):");
        char choice;
        //choice= sc.nextLine().charAt(0);
        choice='y';
        System.out.println(choice);
        if(choice=='y') {
        	System.out.print("\nEnter your referral code: ");
            //referralCode=sc.next();
        	String referralCode="krsmel108";
        	System.out.println(referralCode);
            if(Referral.getReferralCode().equals(referralCode) && name.equals("Aman")) {
            	//System.out.println("Checkpnt!");
            	ReferralService refObj1=new ReferralService();
            	//refObj1.incrementPnts();
            }
        }
        System.out.println("Enjoy your shoping!!");
    }

}
