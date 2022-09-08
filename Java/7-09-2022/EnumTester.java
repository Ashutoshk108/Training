package com.bhavna.task1;

public class EnumTester {

	public static void main(String[] args) {
	      EnumExample obj = EnumExample.Var1;
	      System.out.println(obj.ordinal()+1);
	      System.out.println(obj.getInfo());
	      obj=EnumExample.Var2;
	      System.out.println(obj.ordinal()+1);
	      System.out.println(obj.getInfo());
	      obj=EnumExample.Var3;
	      System.out.println(obj.ordinal()+1);
	      System.out.println(obj.getInfo());
	      System.out.println(EnumExample.valueOf("Var1"));
	}

}
