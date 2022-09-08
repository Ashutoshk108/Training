package com.bhavna.task1;
public class StackMain {
	public static void main(String[] args)
    {
		//Scanner sc=new Scanner(System.in);
        Stack st=new Stack();
        st.pop();
        System.out.println();
        st.push(4);
        st.push(6);
        st.push(1);
        st.push(7);
        
        System.out.println("\npopped: "+st.pop());
        
        System.out.print("\nStack elements: ");
        if(st.isEmpty()) {
            System.out.println("Empty stack");
        }
        else {
            while(!st.isEmpty()) {
            	int d=st.pop();
            	System.out.print(d+" ");
            }
        }
    }
}
