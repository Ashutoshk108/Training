package com.bhavna.assessment;

import java.util.*;

import java.io.*;
public class Referral implements Serializable {
	public static ArrayList<ArrayList<String>> referralLst=new ArrayList<ArrayList<String>>();
	private String name;
	private String mobileNo;
	private String emailId;
	static int pnts;
	static String referralCode="krsmel108";
	
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
	
	public static void incrementPnts() {
		Referral.pnts+=1000;
	}
	
	public void addReferral(String name, String mobileNo, String emailId) {
		ArrayList<String> referralDetail=new ArrayList<String>();
		referralDetail.add(name);
		referralDetail.add(mobileNo);
		referralDetail.add(emailId);
		referralLst.add(referralDetail);
		write(referralDetail);
	}
	
	public void viewReferral() {
		for(ArrayList<String> arr:referralLst) {
			System.out.println(arr.get(0)+"\t"+arr.get(1)+"\t"+arr.get(2));
		}
		//displayFromFile();
		
	}
	
	public void editReferral(String name, String newMobileNo, String newEmailId) {
		for(int i=0;i<referralLst.size();i++) {
			if(referralLst.get(i).get(0)==name) {
				referralLst.get(i).set(1,newMobileNo);
				referralLst.get(i).set(2,newEmailId);
			}
		}
		
	}
	
	public static void write(ArrayList<String> r) {
		try {
			File file=new File("D://data.csv");
			FileOutputStream fout=new FileOutputStream(file, true);
			ObjectOutputStream oos=new ObjectOutputStream(fout);
			//Referral ref=(new Referral(r.getName(),r.getMobileNo(),r.getEmailId()));
			oos.writeObject(r);
			System.out.println("Record added Successfully");
			oos.close();
			fout.close();
		}catch(Exception e) {
			System.out.println(e);
		}finally{
			System.out.println("Data stored successfully!");
		}
	}
	
	public static void displayfromFile() {
		try {
			File file=new File("D://text.csv");
			FileInputStream fin=new FileInputStream(file);
			ObjectInputStream ois=new ObjectInputStream(fin);
			ArrayList<String> data=(ArrayList<String>) ois.readObject();
			System.out.println(data.get(0)+"\t"+data.get(1)+"\t"+data.get(2));
			
			ois.close();
			fin.close();
		}catch(Exception e) {
			System.out.println(e);
		}finally{
			System.out.println("Successfull function!");
		}
	}

}
