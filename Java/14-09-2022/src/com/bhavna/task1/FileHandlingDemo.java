package com.bhavna.task1;

import java.io.*;
public class FileHandlingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int subdirectory=0;
			int file1=0;
			File file=new File("D:\\Basic");
			File arr[] = file.listFiles();
			for(int i = 0; i<arr.length;i++) {
			    if(arr[i].isDirectory()) {
			        subdirectory += 1;
			    }
			    else if(arr[i].isFile()) {
			        file1 += 1;
			}
			}
			System.out.println("Totoal Number of directory "+subdirectory);
			System.out.println("Toatal Number of file "+file1);
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
/*
Write program to count total number of files and folders in perticular folder
*/
