public class TestIncDec{
public static void main(String args[]){
int a=10;
int b=20;
int c, d;
c=++b;
d=a++;
c++;
System.out.println(a); //11
System.out.println(b); //21
System.out.println(c); //22
System.out.println(d); //10
}
}
