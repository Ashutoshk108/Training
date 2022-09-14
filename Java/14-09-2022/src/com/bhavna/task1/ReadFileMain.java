package com.bhavna.task1;

import java.io.*;
public class ReadFileMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File file=new File("D:\\Basic\\temp.txt");
			if(file.exists() && file.isFile()) {
				FileInputStream fin=new FileInputStream(file);
				ReadFile obj=new ReadFile();
				obj.countDigits(fin);
				fin=new FileInputStream(file);
				obj.countLowerCaseChar(fin);
				fin=new FileInputStream(file);
				obj.countUpperCaseChar(fin);
				fin=new FileInputStream(file);
				obj.countVowels(fin);
				
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
