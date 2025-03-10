package ch03_linkedList.exercises;

import static java.lang.Math.*;

public class LL_05_v1 {

	// The private instance variables
	private int length;
	private Node head;

	// Inner class - Node
	class Node {
		int value;
		Node next;

		public Node(int value) {
			this.value = value;
		}
	}

	// Constructor
	public LL_05_v1(int value) {
		Node newNode = new Node(value);
		head = newNode;
		length = 1;
	}

	// Getter methods

	// Getter method for private instance variable 'head'
	public Node getHead() {
		return head;
	}

	// Getter method for private instance variable 'length'
	public int getLength() {
		return length;
	}

	// printList()
	public void printList() {
		Node temp = head;
		if (temp == null)
			System.out.println("empty");
		else {
			while (temp != null) {
				System.out.print(temp.value);
				temp = temp.next;
				if (temp != null)
					System.out.print(" -> ");
			}
			System.out.println();
		}
	}

	// clear()
	public void clear() {
		head = null;
		length = 0;
	}

	// append()
	public void append(int value) {
		Node newNode = new Node(value);
		if (length == 0)
			head = newNode;
		else {
			Node temp = head;
			while (temp.next != null)
				temp = temp.next;
			temp.next = newNode;
		}
		++length;
	}

	// binaryToDecimal(): int
	/*
	 * We have a linked list where each node represents a binary digit (0 or 1).
	 * binaryToDecimal() function is to convert this binary number, represented by
	 * the linked list, into its decimal equivalent.
	 */

	public int binaryToDecimal() {
		Node temp = head;
		int decimalValue = 0;
		for (int i = 0; i < length; ++i) {
			if (temp.value == 1)
				decimalValue += pow(2, length - (i + 1));
			temp = temp.next;
		}
		return decimalValue;
	}
}