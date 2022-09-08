package com.bhavna.task1;


public class Stack {
	class Node {
		int data;
		Node nxt;
	}
	
	Node top;
	int ndCnt;
	
	public Stack() {
		this.top=null;
		this.ndCnt=0;
	}
	
	public void push(int data) {
		Node nd=new Node();
		System.out.println(data+" pushed");
		nd.data=data;
		nd.nxt=top;
		top=nd;
		
		this.ndCnt++;
	}
	
	public boolean isEmpty() {
        return top==null;
    }
	
	public int peek(){
        if (isEmpty()) {
            System.out.println("empty stack");
            return -1;
        }
        return top.data;
    }
	
	public int pop() {
        if(isEmpty()){
            System.out.println("stack Underflow");
            return -1;
        }
 
        int top=peek();
        this.ndCnt-=1;
        this.top=(this.top).nxt;
 
        return top;
    }
	
	public int getSize() {
		return this.ndCnt;
	}

}

