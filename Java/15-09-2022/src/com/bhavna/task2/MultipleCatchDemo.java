package com.bhavna.task2;

import java.io.*;
public class MultipleCatchDemo {
	public void exceptionTester(int n)  throws FileNotFoundException {
		try {
			int a=5;
			int b=0;
			switch(n){
				case 1:
					if(b==0) throw new ArithmeticException("b is  0"); 
			
				case 2:
					boolean[] arr=new boolean[5];
					if(arr[5]) {
						throw new NullPointerException("arr[5] not exist");
					}
				case 3:
					File f=new File("D://ATemp.txt");
					if(!f.exists()) {
						throw new FileNotFoundException("file not found");
					}
			}
		}catch(NullPointerException e) {
			System.out.println(e);
		}catch(ArithmeticException e) {
			System.out.println(e);
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}

}

/*
Write program to throw and handle follwing exceptions explicitely. Use multiple catches
1.NullPointerException
2.ArithmeticException
3.FileNotFoundException
*/