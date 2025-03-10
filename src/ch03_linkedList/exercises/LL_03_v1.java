package ch03_linkedList.exercises;

public class LL_03_v1 {

	// The private instance variables
	private Node head;
	private Node tail;

	// Inner class - Node
	class Node {
		int value;
		Node next;

		Node(int value) {
			this.value = value;
		}
	}

	// Constructor
	public LL_03_v1(int value) {
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

	// printList():void
	public void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.value);
			temp = temp.next;
		}
	}

	// clear(): void
	public void clear() {
		head = null;
		tail = null;
	}

	// append(value: int): void
	public void append(int value) {
		Node newNode = new Node(value);
		// or tail == null
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
	}

	// findKthFromEnd(k: int): Node
	// findKthFromEnd method returns the k-th node from the end of the list
	// if the list has fewer than k nodes, the method returns 'null'
	public Node findKthFromEnd(int k) {
		Node a = head;
		Node b = head;

		for (int i = 0; i < k; ++i) {
			if (a == null)
				return null;
			a = a.next;
		}
		while (a != null) {
			b = b.next;
			a = a.next;
		}
		return b;
	}
}