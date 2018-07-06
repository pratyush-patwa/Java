class Test{
	public void calculate(int a, int b){
		a = 15;
		b = 20;
	}
}

class TestDemo{
	public static void main(String args[]){
	int a=5, b=7;
	Test ob = new Test();
	System.out.println("a = "+ a +" b = "+ b);
	ob.calculate(a,b);
	
	System.out.println("a = "+ a +" b = "+ b);
	}
}

