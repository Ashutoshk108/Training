package com.bhavna.task1;

import java.util.function.Consumer;
public class ConsumerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<Integer> ref=(num)->{
            if(num%2==0) {
                System.out.println(num+" is even number");
            }else {
                System.out.println(num+" is odd number");
            }
        };
        
        ref.accept(19);
        ref.accept(20);
        ref.accept(108);
	}

}
