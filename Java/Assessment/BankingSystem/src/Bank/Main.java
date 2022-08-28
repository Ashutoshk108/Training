package Bank;

import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the amount you want to deposit: ");
		double amnt=sc.nextDouble();
		System.out.print("Enter type of interest(Simple/Compound): ");
		String type=sc.next(); 
		System.out.print("Enter the rate of interest: ");
		double roi=sc.nextDouble();
		System.out.print("Enter your age: ");
		int age=sc.nextInt();
		System.out.print("Enter your gender(m/f): ");
		String gendr=sc.next();
		System.out.print("Enter the duration period: ");
		double duration=sc.nextDouble();
		sc.close();
		System.out.println();
		//double int_accrd=0;
		Calculation obj=new Calculation();
		roi=obj.effROI(age,gendr,duration,roi);
		System.out.println("Year\tInterest\tAccrued Interest\tBalance");
		System.out.println(0+"\t-\t\t-\t\t\t"+amnt);
		if(type.equals("Simple")) {
			obj.printSimpInt(amnt,roi,duration);
		}
		else if(type.equals("Compound")) {
			obj.printCompInt(amnt,roi,duration);
		}
		
		
		
	}

}

/*
You r hired by a bank. Build a console based application to calculate interest with the following 
input:- principal amnt, rate of int, type of int, age of depositor, gender of depositor and output 
should be interest accurred by the depositor, the principal + interest accurred every year

Rules:- if depositor age is greater than 60 then 1% extra rate of int applicable, 
If deposit is for 1 year then roi is same 
if deposit is for 1 to 3 year then roi is .5% extra, 
if deposit is for 3-5 year then roi is 1% extra, 
if deposit is for more than 5 year then roi is 1.5% extra
If depositor is female then roi is .5% extra

Duration is also taken as input

*/