import java.util.*;
public class TwoMatrixSum{
	public static void main(String args[]){
	int rowA, rowB, colA, colB;
	rowA = rowB = colA = colB =0;

	Scanner sc = new Scanner (System.in);
	
	rowA = sc.nextInt();
	rowB = sc.nextInt();
	colA = sc.nextInt();
	colB = sc.nextInt();
	
	if(rowA == rowB && colA == colB){
		int [][] matA = new int[rowA][colA];
		int [][] matB = new int[rowB][colB];
		int [][] sum  = new int[rowA][colA]; 
		System.out.print("Enter the first Matrix");
		for(int i=0; i<rowA; i++){
			for(int j=0; j<colA; j++){
			matA[i][j]= sc.nextInt();
			}
		}
		System.out.print("Enter the second Matrix");
		for(int i=0; i<rowB; i++){
			for(int j=0; j<colB; j++){
			matB[i][j]= sc.nextInt();
			}
		}		
		for(int i=0; i<rowA; i++){
			for(int j=0; j<colA; j++){
				sum[i][j]  = matA [i][j] + matB[i][j];
				System.out.print(sum[i][j]+" ");
			}
			System.out.println();
		}
	}
	else{
		System.out.print("The order of matrix does not match");

	}	
	}
}