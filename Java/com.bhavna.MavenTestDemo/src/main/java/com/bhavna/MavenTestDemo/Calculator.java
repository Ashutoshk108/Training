package com.bhavna.MavenTestDemo;

public class Calculator {
	public int addition(int num1, int num2) {
		return num1 + num2;
	}

	public double addition(double num1, double num2) {
		return num1 + num2;
	}

	public String addition(String num1, String num2) {
		return num1+num2;
	}

	public double division(double n1, double n2) {
		double res = n1 / n2;
		return res;
	}
	public int subtraction(int n1,int n2) {
		return n1-n2;
	}
	public int multiplication(int n1,int n2) {
		return n1*n2;
	}

}
/*
 * Use Case in which you have to create Maven Application having class
 * Calculator Following are the functionalities
 * 
 * 1.Overloaded functions for addition of two integers,doubles and Strings
 * 2.Division of two doubles substraction of two integers 4. multiplication of
 * two integers
 * 
 */