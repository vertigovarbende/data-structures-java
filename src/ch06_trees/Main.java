package ch06_trees;

public class Main {

	public static void main(String[] args) {
		// constructor - default constructor
		/*
		BinarySearchTree myBST = new BinarySearchTree();
		System.out.println(myBST.root);
		*/
		
		// insert()
		/*
		BinarySearchTree myBST = new BinarySearchTree();
		
		myBST.insert(47);
		myBST.insert(21);
		myBST.insert(76);
		myBST.insert(18);
		myBST.insert(52);
		myBST.insert(82);
		
		myBST.insert(27);
		
		System.out.println(myBST.root.left.right.value);
		*/
		
		// contains()
		
		BinarySearchTree myBST = new BinarySearchTree();
		
		myBST.insert(47);
		myBST.insert(21);
		myBST.insert(76);
		myBST.insert(18);
		myBST.insert(27);
		myBST.insert(52);
		myBST.insert(82);
		
		
		
		System.out.println(myBST.contains(27)); // true
		System.out.println(myBST.contains(17)); // false

	}
}