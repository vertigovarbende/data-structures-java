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
					System.out.print(" <-> ");
			}
		}
		System.out.println();
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
	
	// prepend()
	public void prepend(int value) {
		Node newNode = new Node(value);
		if (length == 0) {
			head = newNode;
			tail = newNode;
		} else {
			newNode.next = head;
			head.prev = newNode;
			head = newNode;
		}
		++length;
	}
	
	// removeFirst()
	/*
	public Node removeFirst() {
		Node temp = head;
		if (length == 0)
			return null;
		else {
			head = head.next;
			head.prev = null;
			temp.next = null;
		}
		--length;
		if (length == 0) {
			head = null;
			tail = null;
		}
		return temp;
	}
	*/
	
	// (2) removeFirst()
	public Node removeFirst() {
		if (length == 0)
			return null;
		Node temp = head;
		if (length == 1) {
			head = null;
			tail = null;
		} else {
			head = head.next;
			head.prev = null;
			tail.next = null;
		}
		--length;
		return temp;
	}
	
	// get()
	/*
	public Node get(int index) {
		if (index < 0 || index >= length)
			return null;
		Node temp = index <= length / 2 ? head : tail; 
		if (temp.equals(tail)) {
			for (int i = 0; i < (length - 1) % index; ++i)
				temp = temp.prev;
		} else if (temp.equals(head)) {
			for (int i = 0; i < index; ++i)
				temp = temp.next;
		}
		return temp;
	}
	*/
	
	// (2) get()
	public Node get(int index) {
		if (index < 0 || index >= length)
			return null;
		Node temp = head;
		if (index < length / 2) {
			for (int i = 0; i < index; ++i)
				temp = temp.next;
		} else {
			temp = tail;
			for (int i = length - 1; i > index; --i)
				temp = temp.prev;
		}
		return temp;
	}
	
	
	// set()
	public boolean set(int index, int value) {
		Node temp = get(index);
		if (temp != null) {
			temp.value = value;
			return true;
		}
		return false;
	}
	
	// insert()
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
		Node prevNode = get(index - 1);
		newNode.prev = prevNode;
		newNode.next = prevNode.next;
		prevNode.next = newNode;
		newNode.next.prev = newNode;
		++length;
		return true;
	}
	*/
	
	// (2) insert()
	public boolean insert(int index, int value) {
		if (index < 0 || index > length)
			return false;
		if (index == 0) {
			prepend(value);
			return true;
		}
		if (index == length) {
			append(value);
			return true;
		}
		Node newNode = new Node(value);
		Node b = get(index - 1);
		Node a = b.next;
		
		newNode.prev = b;
		newNode.next = a;
		b.next = newNode;
		a.prev = newNode;
		++length;
		return true;
	}
	
	// remove()
	/*
	public Node remove(int index) {
		if (index < 0 || index >= length)
			return null;
		if (index  == 0)
			return removeFirst();
		if (index  == length - 1)
			return removeLast();
		
		Node temp = get(index);
		Node tempA = get(index + 1);
		Node tempB = temp.prev;
		
		tempB.next = tempA;
		temp.prev = null;
		temp.next = null;
		tempA.prev = tempB;
		--length;
		if (length == 0) {
			head = null;
			tail = null;
		}
		return temp;
	}
	*/
	
	// (2) remove()
	public Node remove(int index) {
		if (index < 0 || index >= length)
			return null;
		if (index  == 0)
			return removeFirst();
		if (index  == length - 1)
			return removeLast();
		
		Node temp = get(index);
		
		temp.next.prev = temp.prev;
		temp.prev.next = temp.next;
		temp.next = null;
		temp.prev = null;
		--length;
		if (length == 0) {
			head = null;
			tail = null;
		}
		
		return temp;
	}
	
	// reverse()
	public void reverse() {
		Node cNode = head;
		Node tempNode = null;
		while (cNode != null) {
			tempNode = cNode.prev;
			cNode.prev = cNode.next;
			cNode.next = tempNode;
			cNode = cNode.prev;
		}
		tempNode = head;
		head = tail;
		tail = tempNode;
	}	
}