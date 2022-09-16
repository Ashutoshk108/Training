package com.bhavna.service;

public class Operation {
	public boolean isGreater(int a, int b) {
		if(a>b) return true;
		else {
			return false;
		}
	}
	
	public String displayName(String str) {
		return "Your name is: "+str;
	}
	
	public boolean isEqual(String str1, String str2) {
		if(str1==str2) return true;
		return false;
	}
	public boolean isEven(int num) {
		if(num%2==0) return true;
		return false;
	}
}
