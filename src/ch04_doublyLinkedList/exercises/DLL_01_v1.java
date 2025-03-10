package ch04_doublyLinkedList.exercises;

public class DLL_01_v1 {

	// The private instance variable
	private Node head;
	private Node tail;
	private int length;

	// Inner Class - Node
	class Node {
		int value;
		Node next;
		Node prev;

		public Node(int value) {
			this.value = value;
		}
	}

	// Constructor
	public DLL_01_v1(int value) {
		Node newNode = new Node(value);
		head = newNode;
		tail = newNode;
		length = 1;
	}

	// Getter Methods

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

	// +printList(): void
	public void printList() {
		Node temp = head;
		if (length == 0)
			System.out.println("Empty");
		else {
			while (temp != null) {
				System.out.print(temp.value);
				temp = temp.next;
				if (temp != null)
					System.out.print(" -> ");
			}
		}
	}

	// clear(): void
	public void clear() {
		head = null;
		tail = null;
		length = 0;
	}

	// append()
	public void append(int value) {
		Node newNode = new Node(value);
		if (length == 0) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
		}
		++length;
	}

	// +swapFirstLast(): void
	// this method swaps the values of the first and last node in the list
	// if the length of the list is less than 2,, the method should not perform any
	// operation
	public void swapFirstLast() {
		int tempValue = 0;
		if (length >= 2) {
			tempValue = head.value;
			head.value = tail.value;
			tail.value = tempValue;
		}

		// or
//		if (length < 2)
//			return;
//		int temp = head.value;
//		head.value = tail.value;
//		tail.value = temp;
	}

}
