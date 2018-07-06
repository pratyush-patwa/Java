class Box{

	double w;
	double l;
	double d;
	
	double volume(){
		return w*l*d;
	}
	
	void printVolume(String boxName){
		System.out.println("Volume of " + boxName + " : " + volume());
	}
		
	void setDim(double x, double y, double z){
		w=x;
		l=y;
		d=z;
	}
}

public class BoxDemo{
	public static void main(String args[]){
	
		Box b1 = new Box();
		Box b2 = b1;
		
		b1.l=2;
		b1.w=3;
		b1.d=4;
		
		b2.l=4;
		b2.w=5;
		b2.d=6;
			
		b2 = new Box();
		
		b1.setDim(1,2,3);
		b2.setDim(4,5,6);

		System.out.println("Length of B1: "+b1.l + "Width of B1: " +b1.w + "Depth of B1:" +b1.d + "Volume of b1: "+ b1.volume());
		System.out.println("Length of b2: "+b2.l + "Width of B2: " +b2.w + "Depth of B2:" +b2.d + "Volume of b2:" + b2.volume());
		b1.printVolume("b1");
		b2.printVolume("b2");				
	}
}
