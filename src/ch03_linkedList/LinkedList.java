package ch03_linkedList;

public class LinkedList {

	// The private instance variables
	// Fields
	private Node head;
	private Node tail;
	private int length;

	// Nested Class
	// Node
	class Node {
		int value;
		Node next;

		Node(int value) {
			this.value = value;
		}
	}

	// Constructor of LinkedList
	public LinkedList(int value) {
		Node newNode = new Node(value);
		head = newNode;
		tail = newNode;
		length = 1;
	}

	// print() function
	public void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.value);
			temp = temp.next;
		}
	}

	// function to get head's value, tail's value and length
	// head's value
	public void getHead() {
		System.out.println("Head: " + head.value);
	}

	// tail's value
	public void getTail() {
		System.out.println("Tail: " + tail.value);
	}

	// length's value
	public void getLength() {
		System.out.println("Length: " + length);
	}

	// append function that will create new node and add the node end of the list
	public void append(int value) {
		Node newNode = new Node(value);
		// if the linked list is empty
		if (length == 0) { // or head.equals(null) or tail.equals(null)
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
		++length;
	}

	// removeLast function will remove the last node from the linked list
	
	/*
	public void removeLast() {
		// if linked list is empty
		if (length == 0) { // or head.equals(null) or tail.equals(null)

		} else if (length == 1) { // or head.equals(tail) ??
			// if linked list contains 1 node
			head = null;
			tail = null;
			--length;
		} else {
			// if linked list contains more than 1 node
			Node temp = head;
			int i = 1;
			while (i <= length - 1) {
				head = head.next;
				++i;
			}
			tail = head;
			head = temp;
			tail.next = null;
			--length;
		}
	}
	*/
	
	// (2) removeLast -> the correct one!
	public Node removeLast() {
		// if linked list is empty
		if (length == 0) // or head.equals(null) or tail.equals(null)
			return null;
		// if linked list is not empty
		// (1) if linked list have more than one node
		Node temp = head;
		Node pre = head;
		while (temp.next != null) {
			pre = temp;
			temp = temp.next;
		}
		tail = pre;
		tail.next = null;
		--length;
		// (2) if linked list length is 0 after the removing
		if (length == 0) {
			head = null;
			tail = null;
		}
		return temp;
	}
	
	// prepend function will add new node from left to the linked list
	public void prepend(int value) {
		Node newNode = new Node(value);
		// if linked list is empty
		if (length == 0) { // or head.equals(null) or tail.equals(null)
			head = newNode;
			tail = newNode;
		} else {
			/* i wrote this
			Node temp = head;
			head = newNode;
			head.next = temp;
			*/
			newNode.next = head;
			head = newNode;
		}
		++length;
	}
	
	// removeFirst function will remove the node from left to the linked list
	
	// (1)
	public Node removeFirst() {
		// if linked list is empty
		if (length == 0) // or head.equals(null) or tail.equals(null)
			return null;
		Node temp = head;
		head = head.next;
		temp.next = null;
		--length;
		if (length == 0) {
//			head = null; you don't have to do that because it is already null!
			tail = null;
		}
		return temp;
	}
	
	// get function will return the specified index node's value
	
	// (1) i wrote this method
	// you have to bound index value between 0 and length - 1
	// otherwise if user enter negative index or greater index than linked list length
	// you will get an exception
	
	// also you don't have to check whether the linked list is empty or not
	// check (2) for better explanation
	/*
	public Node get(int index) {
		// (1) if linked list is empty
		if (length == 0) 
			return null;
		int i = 0;
		Node temp = head;
		while (i < index) {
			temp = temp.next;
			++i;
		}
		return temp;
	}
	*/
	
	// (2) the correct one!
	public Node get(int index) {
		if (index < 0 || index >= length)
			return null;
		Node temp = head;
		for (int i = 0; i < index; ++i)
			temp = temp.next;
		return temp;
	}
	
	// set function will set the node's value by specified index 
	
	// (1) 
	/*
	public boolean set(int index, int value) {
		if (index < 0 || index >= length)
			return false;
		Node temp = head;
		for (int i = 0; i < index; ++i)
			temp = temp.next;
		temp.value = value;
		return true;		
	}
	*/
	
	// (2) the correct one!
	public boolean set(int index, int value) {
		Node temp = get(index);
		if (temp != null) {
			temp.value = value;
			return true;
		}
		return false;
	}
	
	// insert() function will insert new node to the linked list
	
	// (1)
	/*
	public boolean insert(int index, int value) {
		if (index < 0 || index > length)
			return false;
		if (index == 0) {
			prepend(value);
			return true;
		} else if (index == length) {
			append(value);
			return true;
		}
		Node newNode = new Node(value);
		Node temp = head;
		Node pre = head;
		for (int i = 0; i < index; ++i) {
			if (i != index - 1) {
				temp = temp.next;
				pre = pre.next;
			} else 
				temp = temp.next;
		}
		pre.next = newNode;
		newNode.next = temp;
		++length;
		return true;
	}
	*/
	
	// (2) correct one!
	public boolean insert(int index, int value) {
		if (index < 0 || index > length)
			return false;
		else if (index == 0) {
			prepend(value);
			return true;
		} else if (index == length) {
			append(value);
			return true;
		}
		Node newNode = new Node(value);
		Node temp = get(index - 1);
		newNode.next = temp.next;
		temp.next = newNode;
		++length;
		return true;
	}
	
	// remove() function will remove the node from the linked list
	
	// (1)
	// look at (2) because you have many mistakes!
	/*
	public Node remove(int index) {
		if (length == 0)
			return null;
		Node newNode = get(index);
		if (index == 0) {
			removeFirst();
			return newNode;
		} else if (index == length - 1) {
			removeLast();
			return newNode;
		}
		Node temp = get(index - 1);
		temp.next = newNode.next;
		newNode.next = null;
		--length;
		if (length == 0) {
			head = null;
			tail = null;
		}
		return newNode;		
	}
	*/
	
	// (2) correct one!
	public Node remove(int index) {
		if (index < 0 || index >= length)
			return null;
		else if (index == 0)
			return removeFirst();
		else if (index == length - 1)
			return removeLast();
		
		Node prev = get(index - 1);
		Node temp = prev.next;
		
		prev.next = temp.next;
		temp.next = null;
		--length;
		return temp;
	}
	
}
