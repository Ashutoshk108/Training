import java.util.*;
public class MatrxAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int row=3;
		int col=3;
		
		int mat1[][]=new int[row][col];
		int mat2[][]=new int[row][col];
		
		System.out.println("Enter elements in matrix 1 of dimension "+row+"x"+col+": ");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				mat1[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter elements in matrix 2 of dimension "+row+"x"+col+": ");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				mat2[i][j]=sc.nextInt();
			}
		}
		
		int resMat[][]=new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				resMat[i][j]=mat1[i][j]+mat2[i][j];
			}
		}
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(resMat[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
