/*public class Box{  /* If any class declared public but the file name is different from the class then compile time error*/


public class BoxDemo{	/*Save the file name with the name of class that contain the main function otherwise it will give a run time error*/
public static void main(String args[]){

	Box box1 = new Box();
	box1.l=100;
	box1.w=20.00;
	box1.d=5.0;
	double volume1= box1.l*box1.w*box1.d;

	System.out.println("The volume is "+ volume1);

	
	Box box2 = new Box();
	box2.l=7;
	box2.w=2.00;
	box2.d=5.0;
	double volume2= box2.l*box2.w*box2.d;

	System.out.println("The volume is "+ volume2);

	for(int i=0;i<10;i++){
	Box box = new Box();
	box.l=100;
	box.w=20.00;
	box.d=5.0*i;
	double volume= box.l*box.w*box.d;

	System.out.println("The volume is "+ volume);
	System.out.println("# of box is " + box.hashCode());
}
}
}
class Box{  /* If any class declared public but the file name is different from the class then compile time error*/
double w, l, d;
}


