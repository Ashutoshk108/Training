package com.bhavna.task;

public class BST_Main {
	public static void main(String[] args)
	{
		BST tree = new BST();
		tree.insert(50);
		tree.insert(30);
		tree.insert(20);
		tree.insert(40);
		tree.insert(70);
		tree.insert(60);
		tree.insert(80);
		
		System.out.print("Elements of BST: ");
		tree.inorder();
	}
 
}
