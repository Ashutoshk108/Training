package com.bhavna.task2;

public class DQueuMain {

	/* Driver of the program */
	public static void main(String args[])
	{
		DQueue q = new DQueue();
		q.front= q.rear=null;

		DQueue.insert(q,14);
		DQueue.insert(q, 22);
		DQueue.insert(q, 6);

		DQueue.display(q);

		System.out.println("\nDeleted value: "+DQueue.delete(q));
		
		DQueue.display(q);

		DQueue.insert(q, 9);
		DQueue.insert(q, 20);
		DQueue.display(q);
	}

}
