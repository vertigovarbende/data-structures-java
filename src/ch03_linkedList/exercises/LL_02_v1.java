package ch03_linkedList.exercises;

public class LL_02_v1 {

	// The private instance variables

	private Node head;
	private Node tail;
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
	public LL_02_v1(int value) {
		Node newNode = new Node(value);
		head = newNode;
		tail = newNode;
		length = 1;
	}

	// Getters method

	// Getter method for private instance variable 'head'
	public Node getHead() {
		return head;
	}

	// Getter method for private instance variable 'tail'
	public Node getTail() {
		return tail;
	}

	// Getter method for private instance variable 'length'
	public int getLength() {
		return length;
	}

	// printList(): void
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
		length = 0;
	}

	// append(value: int): void
	public void append(int value) {
		Node newNode = new Node(value);
		// head.equals(null) or tail.equals(null)
		if (length == 0) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
	}

	// hasLoop(): boolean
	// hasLoop() method checks whether linked list is loop or not!
	// returns 'true' if there is a loop in the linked list otherwise it returns
	// 'false'
	public boolean hasLoop() {
		Node b = head;
		Node a = head;

		if (length == 0)
			return false;
		else if (length == 1)
			return false;
		else {
			while (a != null && a.next != null) {
				b = b.next;
				a = a.next.next;
				if (a == b)
					return true;
			}
		}
		return false;
	}

}
