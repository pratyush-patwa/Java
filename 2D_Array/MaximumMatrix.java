public class MaxMinMatrix{
	public static void main(String [] args){
	
	if(args.length != 9){
		System.out.println("Please Enter 9 integer numbers");
	}
	else{
		//Declaring a 2d array of 3*3
		int [] [] array = new int [3][3];
		int x =0;

		//Storing the array in 2D array
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				array[i][j] = Integer.parseInt(args[x++]);
			}
		}
		int max =-1;
		//Printing Matrix
		System.out.println("The given array is:");
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				//finding maximum element in 2d array
				max = ((max>array[i][j])?max : array[i][j]);	
				
				System.out.print(array[i][j]+ " ");
			}
			System.out.println();
		}
		System.out.println("The Greatest number in the given array is " + max);
		
		}
	}	
}