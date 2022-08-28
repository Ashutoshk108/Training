import java.util.Scanner;

public class JaggedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows in the jagged array: ");
		int row=sc.nextInt();
		int arr[][]=new int[row][];
		int col;
		for(int i=0;i<row;i++) {
			System.out.print("Enter number of columns in "+(i+1)+"th sub-array of the given arr: ");
			col=sc.nextInt();
			arr[i]=new int[col];
			for(int j=0;j<col;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Elements of the jagged array: ");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
