package ch05_stacks_queues;

public class StackAgain {

	// The private instance variables
	private Node top;
	private int height;

	// Inner class - Node
	class Node {
		int value;
		Node next;

		public Node(int value) {
			this.value = value;
		}
	}

	// Constructor
	public StackAgain(int value) {
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
	public void push(int value) {
		Node newNode = new Node(value);
		// or top.equals(null)
		if (height == 0)
			top = newNode;
		else {
			newNode.next = top;
			top = newNode;
		}
		++height;
	}

	// pop()
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