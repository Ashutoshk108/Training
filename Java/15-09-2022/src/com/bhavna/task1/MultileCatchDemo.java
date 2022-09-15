package com.bhavna.task1;

public class MultileCatchDemo {
	public void division(int a, int b) {
		try {
			double res=a/b;
			System.out.println("Result: "+res);
		}catch(NullPointerException e) {
			System.out.println(e);
		}catch(ArithmeticException e){
			System.out.println(e);
		}catch(Exception e) {
			System.out.println(e);
		}finally{
			System.out.println("In finally block");
		}
	}
}
