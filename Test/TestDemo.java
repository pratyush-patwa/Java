class Test{
	int a, b;
	Test(int a,int b){
	this.a = a;
	this.b = b;
	}

	void changeVar(){
	a = a*10;
	b = b*5;
	}
	
	
}

class TestDemo{

public static void main(String args[]){
	int a =5, b=7;
	Test ob = new Test( a,b);
	

	System.out.println("Ob a= "+ob.a+ "Ob b = " +ob.b);
	System.out.println("a = "+ a + "b = "+b);
//	int a = 5;	int a = 10;
//	System.out.println("a= " +a);
	ob.changeVar();
	System.out.println("oa a= "+ob.a+ "ob b = " +ob.b);
	System.out.println("a = "+ a + "b = "+b);
}
}	
