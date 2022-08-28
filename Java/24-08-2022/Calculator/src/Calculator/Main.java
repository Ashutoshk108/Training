package Calculator;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("\t***Calculator***\t");
		System.out.println("Enter 1 for performing addition.");
		System.out.println("Enter 2 for performing subtraction.");
		System.out.println("Enter 3 for performing multiplication.");
		System.out.println("Enter 4 for performing division.");
		int n=sc.nextInt();
		int n1,n2;
		System.out.println("Enter 1st and 2nd number: ");
		n1=sc.nextInt();
		n2=sc.nextInt();
		if(n==1) {
			System.out.println("Result: "+(n1+n2));
		}else if(n==2) {
			System.out.println("Result: "+(n1-n2));
		}else if(n==3) {
			System.out.println("Result: "+(n1*n2));
		}else if(n==4) {
			System.out.println("Result: "+(n1/n2));
	}

}
}