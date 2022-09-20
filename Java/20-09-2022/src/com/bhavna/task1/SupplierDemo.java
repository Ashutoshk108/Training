package com.bhavna.task1;

import java.util.function.Supplier;
public class SupplierDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Supplier<Double> ref = () -> Math.random();
        System.out.println("Random value is: "+ref.get());

	}

}
