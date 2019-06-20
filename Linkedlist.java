import java.io.*;
import java.io.*;

class LinkedList{

	//inner class
	static class Node{
	
		int data;
		Node next;

		//Constructor
		Node(int d){
			data =d;
			next =null;
		}
	
	}

	//head node of list
	Node head;


	public static LinkedList insert(LinkedList list, int data){
	
		Node new_node = new Node(data);
		new_node.next = null;
	
		if(list.head==null){
			list.head = new_node;
		}

		else{
			Node last = list.head;

			while(last.next!= null){

				last =last.next;
			}
			last.next = new_node;
		}

		//Return the list by head
		return list;
	}

	public static void print(LinkedList list)
	{
		Node node = list.head;


		while(node != null){
		
		System.out.print(node.data + " ");

		node = node.next;
		}
	}

	public static void search(LinkedList list, int key){
		
		Node node = list.head;


		while(node != null){
		
		if(node.data == key)
		System.out.print("key is present in the list");

		node = node.next;
		}
	}

	


	public static void main(String[] args){

	LinkedList list = new LinkedList();

		list = insert(list, 7);
		list = insert(list, 5);
		list = insert(list, 4);
		list = insert(list, 3);
		list = insert(list, 2);

		
		print(list); 
		search(list , 3);

	}
}