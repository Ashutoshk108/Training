package com.bhavna.task1;

import java.io.*;
public class MergeFileDemo {

	public void merge(File f1, File f2) {
		try {
			FileWriter writer=new FileWriter("D://newFile.txt",true);
			if(f1.exists() && f1.isFile() && f2.exists() && f2.isFile()) {
				FileReader reader=new FileReader(f1);
				FileReader reader1=new FileReader(f2);
				while(true) {
					int i=reader.read();
					int j=reader1.read();
					if(i==-1 && j==-1) {
						break;
					}
					writer.write((char)i);
					writer.write((char)j);
				}


				reader.close();
				reader1.close();
			}
			writer.close();
			System.out.println("Merge successful");
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
/*
Write program to merge alternate character of two files into third file. Handle the exceptions.

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
*/