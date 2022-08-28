import java.util.*;

public class Greatest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter 3 numbers to find the largest number: ");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int n3=sc.nextInt();
		if(n1>n2 && n1>n3) {
			System.out.println("Largest number: "+n1);
		}else if(n2>n1 && n2>n3) {
			System.out.println("Largest number: "+n2);
		}else if(n3>n1 && n3>n2) {
			System.out.println("Largest number: "+n3);
		}else {
			System.out.println("None");
		}

	}

}
