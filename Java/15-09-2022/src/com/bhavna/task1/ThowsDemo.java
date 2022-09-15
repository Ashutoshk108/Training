package com.bhavna.task1;

import java.io.*;
public class ThowsDemo {
	public void reader() throws FileNotFoundException, IOException{
		
		File file=new File("D://temp.txt");
		FileReader read1=new FileReader(file);
		while(true) {
			int i=read1.read();
			System.out.print((char)i);
		}
		//read1.close();
	}
}

/*
Write a program to demonstrate the use of throws clause.
Raise FileNotFoundException , IoException
*/