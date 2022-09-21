package com.bhavna.assessment.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import com.bhavna.assessment.bean.Referral;

public class ReferralDao {
	ArrayList<ArrayList<String>> referralLst=new ArrayList<ArrayList<String>>();
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
	public void delete(String name) {
		for(int i=0;i<referralLst.size();i++) {
			if(referralLst.get(i).get(0)==name) {
				referralLst.remove(i);
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
