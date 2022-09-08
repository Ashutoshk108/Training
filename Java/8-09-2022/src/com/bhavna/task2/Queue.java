package com.bhavna.task2;

public class Queue {
	private int size;
	private int[] arr;
	private int frnt;
	private int rear;
	private int cnt;
	
	public Queue(int size) {
		arr=new int[size];
		this.size=size;
		frnt=0;
		rear=-1;
		cnt=0;
	}
	
	public void insert(int data) {
		if(size==cnt) {
			System.out.println("No more space");
			return;
		}
		rear=(rear+1)%size;
		arr[rear]=data;
		System.out.println(data+" is inserted");
		cnt++;
	}
	
	public void delete() {
		if(cnt==0) {
			System.out.println("No more elements to delete");
			return;
		}
		
		int removed=arr[frnt];
		
		System.out.println(removed+" is deleted");
		
		frnt=(frnt+1)%size;
		cnt--;	 
	}
	
	public void display() {
		System.out.print("Queue elements are: ");
		for(int i=frnt;i<=rear;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	

}
