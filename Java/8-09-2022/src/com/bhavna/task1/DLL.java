package com.bhavna.task1;

public class DLL {
	
	class Node{
		String data;
		Node prev;
		Node next;
		
		Node(String data){
			this.data=data;
		}
		
	}
	
	Node head,tail;

	public DLL(){
		this.head=null;
		this.tail=null;
	}
	
	public void getNode(String data) {
		Node nd=new Node(data);
		
		if(head==null) {
			head=tail=nd;
			head.prev=null;
			tail.next=null;
		}else {   
            tail.next = nd;  
            nd.prev = tail;  
            tail = nd;  
            tail.next = null;  
        }
	}
	
	public void display() {  
        Node crnt=head;  
        if(head==null) {  
            System.out.println("empty list");  
            return;  
        }  
        System.out.print("Output: ");  
        while(crnt!=null) {  
            System.out.print(crnt.data + " ");  
            crnt = crnt.next;  
        }  
    }


}
