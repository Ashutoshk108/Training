package com.bhavna.task1;

public class LambdaWithoutArg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OperationPrint prnt=()-> {
			return "You can print any statement here!";
		};
		
		System.out.println(prnt.display());
	}

}
