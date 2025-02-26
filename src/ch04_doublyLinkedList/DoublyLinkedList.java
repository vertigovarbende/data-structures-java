package ch04_doublyLinkedList;

public class DoublyLinkedList {

	// The private instance variables
	// Fields
	private Node head;
	private Node tail;
	private int length;

	// Inner class - Node
	class Node {
		int value;
		Node next;
		Node prev;

		public Node(int value) {
			this.value = value;
		}
	}

	// Constructor of Doubly Linked List
	public DoublyLinkedList(int value) {
		Node newNode = new Node(value);
		head = newNode;
		tail = newNode;
		length = 1;
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

	// Getter method for private instance variable 'length'
	public int getLength() {
		return length;
	}

	// printList()
	public void printList() {
		Node temp = head;
		// or head.equals(null) or tail.equals(null)
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
	
	// append() 
	public void append(int value) {
		Node newNode = new Node(value);
		// head.equals(null) or tail.equals(null)
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

	
	// removeLast()
	/*
	public Node removeLast() {
		Node temp = tail;
		// head.equals(null) or tail.equals(null)
		if (length == 0)
			return null;
		else {
			tail = tail.prev;
			tail.next = null;
			temp.prev = null;
		}
		--length;
		if (length == 0) {
			head = null;
			tail = null;
		}
		return temp;
	}
	*/
	
	// (2) removeLast() 
	// - if linkedList has 1 node, that node's 'next' will be 'null'!
	// be careful!
	
	public Node removeLast() {
		if (length == 0) 
			return null;
		Node temp = tail;
		if (length == 1) {
			head = null;
			tail = null;
		} else {
			tail = tail.prev;
			tail.next = null;
			temp.prev = null;
		}
		--length;
		return temp;
	}
	
	
	
}
