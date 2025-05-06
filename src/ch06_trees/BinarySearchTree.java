package ch06_trees;

public class BinarySearchTree {

	// The private instance variable
//	private Node root;
	Node root;

	// Inner class
	class Node {
		int value;
		Node left;
		Node right;

		Node(int value) {
			this.value = value;
		}
	}

	// Constructor

//	public BinarySearchTree(int value) {
//		Node newNode = new Node(value);
//		root = newNode;
//	}

	// insert
	/*
	 * create newNode
	 * if rot == null then root = newNode
	 * temp = root
	 * while loop
	 * 	  if newNode.value == temp.value return false
	 * 	  if < left else > right
	 *    if null insert newNode else move to next
	 * */
	
	public boolean insert(int value) {
		Node newNode = new Node(value);
		if (root == null) {
			root = newNode;
			return true;
		}
		Node temp = root;
		while (true) {
			if (newNode.value == temp.value)
				return false;
			if (newNode.value < temp.value) {
				if (temp.left == null) {
					temp.left = newNode;
					return true;
				}
				temp = temp.left;
			} else {
				if (temp.right == null) {
					temp.right = newNode;
					return true;
				}
				temp = temp.right;
			}

		}
	}
	
	// contains
	/*
	 * if root == null return false
	 * temp = root
	 * 
	 * while (temp != null)
	 * 	  if < left
	 * 	  else if > right
	 *    else == return true
	 * return false
	 * 
	 * */
	public boolean contains(int value) {
//		if (root == null)
//			return false;
		Node temp = root;
		while (temp != null) {
			if (value < temp.value)
				temp = temp.left;
			else if (value > temp.value)
				temp = temp.right;
			else 
				return true;
		}
		return false;
	}
}