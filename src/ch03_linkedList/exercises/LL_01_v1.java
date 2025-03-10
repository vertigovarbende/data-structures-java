package ch03_linkedList.exercises;

public class LL_01_v1 {

	// Find the middle node in the linked list!
	// integer linked list

	/*
	 * implement a method called 'findMiddleNode' that returns the middle node of
	 * the linked list
	 */

	/*
	 * if the list has an even number of nodes, the method should return the second
	 * middle node.
	 */

	// The private instance variables
	// Fields
	private Node head;
	private Node tail;

	// Inner Class - Node
	class Node {
		int value;
		Node next;

		public Node(int value) {
			this.value = value;
		}
	}

	public LL_01_v1(int value) {
		Node newNode = new Node(value);
		head = newNode;
		tail = newNode;
	}

	// Getter methods

	// Getter method for private instance variable 'head'
	public Node getHead() {
		return head;
	}

	// Getter method for private instance variable 'tail'
	public Node getTail() {
		return tail;
	}

	// printList(): void
	// it prints the value in the linked list
	public void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.value);
			temp = temp.next;
		}
	}

	public void clear() {
		head = null;
		tail = null;
	}

	// append(value: int): void
	// it adds new node from the right side of the linked list.
	public void append(int value) {
		Node newNode = new Node(value);
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
	}

	// (1)
	// findMiddleNode(): Node
	/*
	 * public Node findMiddleNode() { Node a = head.next.next; Node b = head; while
	 * (a.next != null) { b = b.next; a = a.next; } return b; }
	 */

	// (2)
	// findMiddleNode(): Node

	public Node findMiddleNode() {
		if (head == null)
			return null;
		else if (head.equals(tail))
			return head; // or tail
		Node a = head.next.next;
		Node b = head;
		while (a.next != null) {
			b = b.next;
			a = a.next;
		}
		return b;
	}
}
