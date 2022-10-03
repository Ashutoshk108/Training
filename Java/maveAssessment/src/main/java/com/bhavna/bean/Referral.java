package com.bhavna.bean;

import java.util.*;

import java.io.*;
public class Referral implements Serializable {
	private String name;
	private String mobileNo;
	private String emailId;
	private static int pnts;
	private static String referralCode="krsmel108";
	
	public Referral() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public static int getPnts() {
		return pnts;
	}

	public static void setPnts(int pnts) {
		Referral.pnts = pnts;
	}
	

	public static String getReferralCode() {
		return referralCode;
	}

	public static void setReferralCode(String referralCode) {
		Referral.referralCode = referralCode;
	}

	public Referral(String name, String mobileNo, String emailId) {
		super();
		this.name = name;
		this.mobileNo = mobileNo;
		this.emailId = emailId;
	}
	

}
