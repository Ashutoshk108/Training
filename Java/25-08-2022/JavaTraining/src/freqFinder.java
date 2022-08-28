import java.util.*;
public class freqFinder {

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
		Arrays.sort(arr);
		System.out.println("Element\tFrequency");
		int cnt=1;
		for(int i=0;i<n-1;i++) {
			int j=i+1;
			if(arr[i]==arr[j]) {
				cnt++;
			}else {
				System.out.println(arr[i]+"\t"+cnt);
				cnt=1;
			}
		}
		if(arr[n-1]==arr[n-2]) {
			cnt++;
			System.out.println(arr[n-1]+"\t"+cnt);
		}else {
			System.out.println(arr[n-1]+"\t"+1);
		}
		
	}

}
