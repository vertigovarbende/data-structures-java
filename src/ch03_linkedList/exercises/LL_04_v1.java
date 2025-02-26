package ch03_linkedList.exercises;

import java.util.HashSet;

public class LL_04_v1 {
	// We don't have 'tail' instance for this example!
	// The private instance variables
	private Node head;
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
	public LL_04_v1(int value) {
		Node newNode = new Node(value);
		head = newNode;
		length = 1;
	}

	// Getter method

	// Getter method for private instance variable 'head'
	public Node getHead() {
		return head;
	}

	// Getter method for private instance variable 'length'
	public int getLength() {
		return length;
	}

	// +printList(): void
	public void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.value);
			temp = temp.next;
		}
	}

	// +clear(): void
	public void clear() {
		head = null;
		length = 0;
	}

	// +append(value: int): void
	public void append(int value) {
		Node newNode = new Node(value);
		if (head == null)
			head = newNode;
		else {
			Node current = head;
			while (current.next != null)
				current = current.next;
			current.next = newNode;
		}
		++length;
	}

	// +removeDuplicates(): void
	// it removes all duplicate values from the list
	public void removeDuplicates() {
		for (int i = 0; i < length; ++i) {
			Node prev = head;
			Node temp = head.next;
			Node rem = head;
			for (int k = 0; k < i; ++k) {
				if (prev.next != null) {
					prev = prev.next;
					rem = prev;
					temp = prev.next;
				}
			}
			for (int j = 0; j < length - 1; ++j) {
				if (temp == null)
					break;
				else if (prev.value == temp.value) {
					break;
				} else {
					rem = rem.next;
					temp = temp.next;
				}
			}
			if (temp != null) {
				rem.next = temp.next;
				temp = null;
			}
		}
		if (head != null) {
			Node temp2 = head;
			int newLength = 1;
			while (temp2.next != null) {
				temp2 = temp2.next;
				newLength++;
			}
			length = newLength;
		}
	}

}
