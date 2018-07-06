class TestQueue{

int[] arr;
int top;

	TestQueue(){
	arr =  new int[10];
	top = 0;
	}

	void enqueue(int data){

		if(top >= 10){
			System.out.println("OVERFLOW");
		}
		else{
			arr[top++] = data;
		}
	}
	
	int dequeue(){
	
		if(top < 0){
			System.out.println("Underflow");
			return -1;
		}
		else{
		
			return arr[0];
		}
	}
	
	void display(){
		for(int temp:arr){
			System.out.println(temp);
		}
	}
}

class Queue{
	public static void main(String args[]){
	
		TestQueue queue = new TestQueue();
		queue.enqueue(1);
		queue.enqueue(3);
		queue.enqueue(5);
		
		queue.display();

		System.out.println(queue.dequeue());

		queue.display();
	}
}	
		
		
