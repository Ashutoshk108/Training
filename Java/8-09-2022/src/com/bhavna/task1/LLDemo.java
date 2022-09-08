package com.bhavna.task1;

class Node{
	public int data;
	public Node next;
	
	Node(int data){
		this.data=data;
		next=null;
	}
}

public class LLDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node nd=new Node(1);
		System.out.println(nd.data);
		

	}

}
