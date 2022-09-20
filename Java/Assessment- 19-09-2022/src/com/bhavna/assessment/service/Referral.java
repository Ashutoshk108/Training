package com.bhavna.assessment.service;

import java.util.*;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
public class Referral implements Serializable{
	String name;
	Long mobileNo;
	String emailId;
	boolean status;
	static int pnts;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(Long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	public boolean getStatus() {
		return this.status;
	}

	public int getPnts() {
		return pnts;
	}

	public Referral() {

	}

	public Referral(String name, Long mobileNo, String emailId, boolean status) {
		//super();
		this.name = name;
		this.mobileNo = mobileNo;
		this.emailId = emailId;
		this.status = status;
		if(status == true)
			this.pnts += 1000;
	}

	public void viewReferral() {
		System.out.println(this.name + "\t" + this.mobileNo + "\t" + this.emailId + "\t" + this.status);
	}

	public void editReferral(Long mobileNo, String emailId) {
		this.setMobileNo(mobileNo);
		this.setEmailId(emailId);
		System.out.println("Data updated successfully!");
	}

	public void deleteReferral(Referral obj) {
		obj=null;
		System.out.println("Data successfully deleted");
	}
	/*
	public void writeToFile() throws Exception {
		try {
			File f = new File("D:\\data.txt");
			FileWriter myWriter = new FileWriter("data.txt");
			myWriter.write("name, mobile no ,email id, status");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	*/
	public void write(Referral r) {
		try {
			File file=new File("D://data.txt");
			FileOutputStream fout=new FileOutputStream(file, true);
			ObjectOutputStream oos=new ObjectOutputStream(fout);
			Referral ref=(new Referral(r.getName(),r.getMobileNo(),r.getEmailId(), r.getStatus()));
			oos.writeObject(ref);
			System.out.println("Record added Successfully");
			oos.close();
			fout.close();
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
