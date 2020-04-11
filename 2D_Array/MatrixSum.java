public class MatrixSum{
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
		int sum=0;
		int mean=0;
		//Printing Matrix
		System.out.println("The given array is:");
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				sum += array[i][j];	
				System.out.print(array[i][j]+ " ");
			}
			System.out.println();
		}
		mean = (sum/9);
		System.out.println("The sum of the given array is " + sum);
		System.out.println("The mean of the given array is " + mean);
		}
	}	
}