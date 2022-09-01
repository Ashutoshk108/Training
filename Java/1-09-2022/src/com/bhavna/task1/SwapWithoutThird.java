package com.bhavna.task1;

public class SwapWithoutThird {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5,b=7;
		System.out.println("Numbers before swap: "+a+" "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Numbers after swap: "+a+" "+b);

	}

}
