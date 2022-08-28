import java.util.Arrays;
import java.util.Scanner;

public class LeastAndGreatest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size n of array: ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter n elements in the array: ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int largst=Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			largst=Math.max(largst,arr[i]);
		}
		int secLargest=Integer.MIN_VALUE;
		for(int i=0;i<n;i++)
		{
			if(arr[i] != largst)
				secLargest=Math.max(secLargest,arr[i]);
		}
		if(secLargest!=Integer.MIN_VALUE)
			System.out.println("Second largest number is: "+secLargest);
	}

}
