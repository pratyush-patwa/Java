class Stack{

	int [] arr;
	int tos;
	
	Stack(){
	
		arr = new int[10];
		tos = 0;
	}
	
	void push(int data){
	
		if(tos >= 10){
			System.out.println("OVERFLOW");
		}
		else{
			arr [tos++] = data;
		}
	}

	int pop(){
		if(tos<0){
			System.out.println("UNDERFLOW");
			return -1;
		}
		else{
			int top = arr[--tos];
			arr[tos] = 0;
			return top;
		}
	}

	void display(){
		for( int temp : arr) {
			System.out.println(temp);
		}
	}

}


public class StackDemo{
public static void main(String args[]){	
	Stack stack1 = new Stack();
	System.out.print("PUSH 1, 3 and 5");
	stack1.push(1);
	stack1.push(3);
	stack1.push(5);
	
	System.out.println("After PUSHING:");
	stack1.display();

	System.out.println("POPPED TOP ELEMENT " + stack1.pop());
	stack1.display();	
	System.out.println("POPPED TOP ELEMENT " + stack1.pop());
	stack1.display();
	

	stack1.push(2);
	stack1.push(3);
	
	System.out.println("After PUSHING 2 and 3:");
	stack1.display();
}	
}
 
