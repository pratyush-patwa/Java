public class TestArray{
public static void main(String args[]){
int[] array1;
array1 = new int[4];
array1[0]=10;
array1[1]=20;
array1[2]=30;
array1[3]=40;

for(int i=0; i<array1.length;i++)
{
System.out.println(array1[i]);
}

int[] array2= {1,2,3,4};
for(int x:array2){
System.out.println(x);
}


int[][] twoD = new int[2][2];
int x = 0;
for(int i=0;i<2;i++){
	for(int j=0;j<2;j++){
		x+=10;
		twoD[i][j]=x;
	}
}
for(int i=0;i<2;i++){
System.out.println("");
	for(int j=0;j<2;j++){
	System.out.print(twoD[i][j]+"\t");
}
}

	
}
}
