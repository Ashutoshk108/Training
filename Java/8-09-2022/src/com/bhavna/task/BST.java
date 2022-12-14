package com.bhavna.task;

class BST {

	class Node {
		int key;
		Node left, right;

		public Node(int item)
		{
			key = item;
			left = right = null;
		}
	}

	Node root;

	BST() { 
		root = null; 
	}

	BST(int value) { 
		root = new Node(value); 
	}

	void insert(int key) { 
		root = insertRec(root, key); 
	}

	Node insertRec(Node root, int key){
		if (root == null) {
			root = new Node(key);
			return root;
		}

		else if (key < root.key)
			root.left = insertRec(root.left, key);
		else if (key > root.key)
			root.right = insertRec(root.right, key);

		return root;
	}

	void inorder(){ 
		inorderRec(root); 
	}

	void inorderRec(Node root)
	{
		if (root != null) {
			inorderRec(root.left);
			System.out.print(root.key+" ");
			inorderRec(root.right);
		}
	}

}
