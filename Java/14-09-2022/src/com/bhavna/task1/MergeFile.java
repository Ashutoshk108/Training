package com.bhavna.task1;

import java.io.*;
public class MergeFile {

	public static void main(String[] args) {
		try {
			File file=new File("D:\\file.txt");
			File file1=new File("D:\\file1.txt");
			FileWriter writer=new FileWriter("D:\\newMerged.txt", true);
			if(file.exists() && file.isFile()) {
				FileReader reader=new FileReader(file);
				while(true) {
					int i=reader.read();
					if(i==-1) {
						break;
					}
					writer.write((char)i);
				}
			}
			if(file1.exists() && file1.isFile()) {
				FileReader reader=new FileReader(file1);
				while(true) {
					int i=reader.read();
					if(i==-1) {
						break;
					}
					writer.write((char)i);
				}
				
			}
			
			writer.close();
			System.out.println("Done");
		}catch(Exception e){
			System.out.println(e);
		}
	}

}
