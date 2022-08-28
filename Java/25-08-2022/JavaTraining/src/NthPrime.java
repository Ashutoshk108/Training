import java.util.*;
public class NthPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number n to find nth prime number: ");
		int n=sc.nextInt();
		
		int num=1,cnt=0;
		int i;
		while(cnt<n) {
			num+=1;
			for(i=2;i<=num;i++) {
				if(num%i==0)
					break;
			}
			if(i==num) {
				cnt+=1;
			}
		}
		System.out.println(n+"th prime number is "+num);
	}

}
