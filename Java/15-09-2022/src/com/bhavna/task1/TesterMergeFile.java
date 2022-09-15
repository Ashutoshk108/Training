package com.bhavna.task1;

import java.io.*;
public class TesterMergeFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MergeFileDemo obj=new MergeFileDemo();
		File f1=new File("D://file.txt");
		File f2=new File("D://file1.txt");
		obj.merge(f1, f2);
		
	}

}
