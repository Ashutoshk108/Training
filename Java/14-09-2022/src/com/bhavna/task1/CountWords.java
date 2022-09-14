package com.bhavna.task1;

import java.io.File;
import java.io.FileInputStream;

public class CountWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File file=new File("D:\\Basic\\temp.txt");
			
			if(file.exists() && file.isFile()) {
				FileInputStream fin=new FileInputStream(file);
				int wordsCnt=1;
				while(true) {
					int i=fin.read();
					if(i==-1) {
						System.out.println("Total number of words: "+wordsCnt);
						break;
					}else if(i==32) {
						wordsCnt++;
					}
					
				}
				fin.close();
			}else {
				System.out.println("File not exist");
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
