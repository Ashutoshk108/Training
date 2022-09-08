package com.bhavna.task2;

class Node {
	int data;
	Node next;
}

class DQueue {
	Node front, rear;
	
	static void insert(DQueue q, int data)
	{
		Node temp = new Node();
		temp.data = data;
		if(q.front==null)
			q.front=temp;
		else
			q.rear.next = temp;
		
		System.out.println(data+" is inserted");
		q.rear = temp;
		q.rear.next = q.front;
	}

	static int delete(DQueue q){
		if (q.front==null) {
			System.out.printf("empty queue");
			return Integer.MIN_VALUE;
		}

		int value;
		if (q.front == q.rear) {
			value = q.front.data;
			q.front = null;
			q.rear = null;
		}
		else
		{
			Node temp = q.front;
			value = temp.data;
			q.front = q.front.next;
			q.rear.next = q.front;
		}

		return value;
	}

	static void display(DQueue q)
	{
		Node temp = q.front;
		System.out.printf("\nElements in Circular Queue are: ");
		while (temp.next != q.front) {
			System.out.printf("%d ", temp.data);
			temp = temp.next;
		}
		System.out.print(temp.data+" ");
	}
}
