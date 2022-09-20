package com.bhavna.task1;

public class LambdaExpressionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operation add=(num1,num2)->System.out.println("Addition: "+(num1+num2));
		
		add.addition(15,25);
	}

}
