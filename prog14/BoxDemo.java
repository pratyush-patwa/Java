class Box{

	double w;
	double l;
	double d;
	
/*	Box(){		//Empty Constructor
	

	}
*/
	//Parameterised Constructor
	Box(double w, double l, double d){
		
		this.w=w; 			://This refer to current object
		this.l=l;
		this.d=d;
	}
	double volume(){
		return w*l*d;
	}
	
	void printVolume(String boxName){
		System.out.println("Volume of " + boxName + " : " + volume());
	}
		

}

public class BoxDemo{
	public static void main(String args[]){
	
		Box b1 = new Box(1,23,3);
		b1.printVolume("b1");
		Box b2 = new Box(2,4,6);
		b2.printVolume("b2");
	}
}	
