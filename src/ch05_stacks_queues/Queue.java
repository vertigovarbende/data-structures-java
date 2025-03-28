package ch05_stacks_queues;

public class Queue {

	// The private instance variables
	private Node first; // instead of 'head'
	private Node last; // instead of 'tail'
	private int length;

	// Inner class - Node
	class Node {
		int value;
		Node next;

		public Node(int value) {
			this.value = value;
		}
	}

	// Constructor
	public Queue(int value) {
		Node newNode = new Node(value);
		first = newNode;
		last = newNode;
		length = 1;
	}

	// Getter methods

	// Getter method for private instance variable 'first'
	public void getFirst() {
		System.out.println("First: " + first.value);
	}

	// Getter method for private instance variable 'last'
	public void getLast() {
		System.out.println("Last: " + last.value);
	}

	// Getter method for private instance variable 'length'
	public void getLength() {
		System.out.println("Length: " + length);
	}

	// printQueue()
	public void printQueue() {
		Node temp = first;
		while (temp != null) {
			System.out.print(temp.value + " ");
			temp = temp.next;
		}
	}

	// enqueue()
	public void enqueue(int value) {
		Node newNode = new Node(value);
		if (length == 0) {
			first = newNode;
			last = newNode;
		} else {
			last.next = newNode;
			last = newNode;
		}
		++length;
	}
	
	// dequeue()
	
	public Node dequeue() {
		Node temp = first;
		// or first.equals(null) or last.equals(null)
		if (length == 0)
			return null;
		if (length == 1) {
			first = null;
			last = null;
		} else {
			first = first.next;
			temp.next = null;
		}
		--length;
		return temp;
	}
}