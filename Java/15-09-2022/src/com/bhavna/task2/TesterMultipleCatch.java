package com.bhavna.task2;

import java.io.FileNotFoundException;

public class TesterMultipleCatch {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		MultipleCatchDemo obj=new MultipleCatchDemo();
		obj.exceptionTester(1);
		obj.exceptionTester(2);
		obj.exceptionTester(3);
	}

}
