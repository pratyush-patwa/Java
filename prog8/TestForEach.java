public class TestForEach{
public static void main(String args[]){

int[][] a= new int[4][4];
int x = 1;
for(int i=0; i<4; i++){
	for (int j=0; j<4; j++){
		a[i][j]=x++;
}
}
for(int[] y:a){
	for(int z:y){
		System.out.print(z+"\t");
		}
		System.out.println();

			
}
}
}
