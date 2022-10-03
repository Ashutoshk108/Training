package com.bhavna.bean;

import java.util.*;

public class PurchaseMobile {
	private String mobileNumber;
	private String name;
	private String referralCode;

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getReferralCode() {
		return referralCode;
	}

	public void setReferralCode(String referralCode) {
		this.referralCode = referralCode;
	}

	public PurchaseMobile() {
		super();
	}

	public PurchaseMobile(String mobileNumber, String name, String referralCode) {
		super();
		this.mobileNumber = mobileNumber;
		this.name = name;
		this.referralCode = referralCode;
	}

}