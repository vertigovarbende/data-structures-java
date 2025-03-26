package ch05_stacks_queues;

public class Stack {

	// The private instance variables
	// Fields
	private Node top; // instead of 'head'
	// private Node bottom; // instead of 'tail' but we don't need it
	private int height;

	// Inner class - Node
	class Node {
		int value;
		Node next;

		Node(int value) {
			this.value = value;
		}
	}

	// Constructor
	public Stack(int value) {
		Node newNode = new Node(value);
		top = newNode;
		height = 1;
	}

	// printStack()
	public void printStack() {
		Node temp = top;
		while (temp != null) {
			System.out.print(temp.value);
			temp = temp.next;
			if (temp != null)
				System.out.print(" -> ");
		}
		System.out.println();
	}

	// Getter methods

	// Getter method for private instance variable 'top'
	public void getTop() {
		System.out.println("Top: " + top.value);
	}

	// Getter method for private instance variable 'height'
	public void getHeight() {
		System.out.println("Height: " + height);
	}

	// push()
	// instead of 'append' method

	public void push(int value) {
		Node newNode = new Node(value);
		if (height == 0)
			top = newNode;
		else {
			newNode.next = top;
			top = newNode;
		}
		++height;
	}

	// pop()
	// instead of 'removeFirst' method
	public Node pop() {
		Node temp = top;
		// or top.equals(null)
		if (height == 0)
			return null;
		top = top.next;
		temp.next = null;
		--height;
		return temp;
	}

}