package com.bhavna.task1;
import java.io.*;

public class ReadFile {
	
	public void countLowerCaseChar(FileInputStream f) {
		try {
			int cntLowerCase=0;
			while(true) {
				int i=f.read();
				if(i==-1) {
					break;
				}else if(i>=97 && i<=122) {
					cntLowerCase++;
				}
			}
			System.out.println("Total number of lower case character is: "+cntLowerCase);
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public void countUpperCaseChar(FileInputStream f) {
		try {
			int cntUpperCase=0;
			while(true) {
				int i=f.read();
				if(i==-1) {
					break;
				}else if(i>=65 && i<=90) {
					cntUpperCase++;
				}
			}
			System.out.println("Total number of Upper case character is: "+cntUpperCase);
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public void countDigits(FileInputStream f) {
		try {
			int cntDigits=0;
			while(true) {
				int i=f.read();
				if(i==-1) {
					break;
				}else if(i>=48 && i<=57) {
					cntDigits++;
				}
			}
			System.out.println("Total number of digits is: "+cntDigits);
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public void countVowels(FileInputStream f) {
		try {
			int cntVowels=0;
			while(true) {
				int i=f.read();
				if(i==-1) {
					break;
				}/*else if(i==65 || i==69 || i==73 || i==79 || i==85 || i==97 || i==101 || i==105 || i==111 || i==117) {
					cntVowels++;
				}*/
				else {
					switch(i) {
					case 65:
						cntVowels++;
						break;
					case 69:
						cntVowels++;
						break;
					case 73:
						cntVowels++;
						break;
					case 79:
						cntVowels++;
						break;
					case 85:
						cntVowels++;
						break;
					case 97:
						cntVowels++;
						break;
					case 101:
						cntVowels++;
						break;
					case 105:
						cntVowels++;
						break;
					case 111:
						cntVowels++;
						break;
					case 117:
						cntVowels++;
					}
				}
			}
			System.out.println("Total number of vowel is: "+cntVowels);
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
/*
 Write program  to count total number of words in file
Write Program to count
1. Total number of upper case characters
2.Total number of lower  case characters
3. Total number of digits
4.Total number of vovels
Use separate method for each operation

 */
