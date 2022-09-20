package com.bhavna.task1;

public class LambdaBlockDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operation add=(num1,num2)->{
			int res=num1+num2;
			System.out.println("Sum of "+num1+" and num2 is "+res);
		};
		add.addition(78, 213);
	}

}