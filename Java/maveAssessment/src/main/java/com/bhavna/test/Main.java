package com.bhavna.test;

import java.util.*;

import com.bhavna.service.AccountService;
import com.bhavna.service.PurchaseService;
import com.bhavna.service.ReferralService;
import com.bhavna.service.ServiceProvider;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			Scanner sc=new Scanner(System.in);
			System.out.println("\t\t****Welcome to DPhone Corporation****");
			System.out.println("Enter 1 to register");
			System.out.println("Enter 2 to login");
			int choice=sc.nextInt();
			AccountService usr=new AccountService();
			//usr.register();
			if(choice==1) {
				usr.register();
			}else if(choice==2){
				usr.login();
				//System.out.print("Do you want to refer to your friend(y/n)? ");
				//char referralChoice=sc.next().charAt(0);
				ReferralService user=new ReferralService();
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
						ServiceProvider.insertReferralData();
					}else if(option==2) {
						ServiceProvider.viewReferralData();
					}else if(option==3) {
						ServiceProvider.updateReferralData();
						ServiceProvider.viewReferralData();
					}else if(option==4) {
						ReferralService refObj=new ReferralService();
						//System.out.print("your pnts: ");
						System.out.print("Your referral point is: "+refObj.viewPnts());
						//System.out.println("It is equivalent to rs"+Referral.getPnts());
					}
					System.out.println("\n\n");
					System.out.println("User entered: "+option);
					option++;
				}while(option!=5);
				ReferralService refObj=new ReferralService();
				System.out.println("\n\n");
				System.out.println("\t******Welcome to Dphone Corporation*****");
				PurchaseService mobileObj=new PurchaseService();
				mobileObj.purchase();
				System.out.println("\n\nYour referral point is: "+refObj.viewPnts());
				System.out.println("It is equivalent to rs"+refObj.viewPnts());
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
