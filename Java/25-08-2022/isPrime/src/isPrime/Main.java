package isPrime;

import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number to check if it is prime or not: ");
		int n=sc.nextInt();
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				System.out.println(n+" is not prime number.");
				return;
			}
		}
		System.out.println(n+" is a prime number");
		
	}

}
