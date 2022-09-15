package com.bhavna.task1;

public class Division {
	public void division(int a, int b) {
		try {
			int res=a/b;
			System.out.println("Result: "+res);
		}catch(Exception e) {
			System.out.println(e);
		}finally {
			System.out.println("In finally block");
		}
	}

}
