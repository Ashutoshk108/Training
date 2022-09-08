package com.bhavna.task2;

public class QueueMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q=new Queue(5);
		q.insert(5);
		q.insert(4);
		q.insert(3);
		q.insert(2);
		q.insert(1);
		System.out.println();
		q.delete();
		System.out.println();
		q.display();
	}

}
