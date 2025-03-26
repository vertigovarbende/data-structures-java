package ch04_doublyLinkedList;

public class DoublyLinkedListAgain {

	// The private instance variables
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

	// Constructor
	public DoublyLinkedListAgain(int value) {
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

	// +printList(): void
	public void printList() {
		if (length == 0)
			System.out.println("Empty");
		else {
			Node temp = head;
			while (temp != null) {
				System.out.print(temp.value);
				temp = temp.next;
				if (temp != null)
					System.out.print(" <-> ");
			}
			System.out.println();
		}
	}

	// append()
	public void append(int value) {
		Node newNode = new Node(value);
		// head.eqauls(null) or tail.equals(null)
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
	public Node removeLast() {
		Node temp = tail;
		// head.equals(null) or tail.equals(null)
		if (length == 0)
			return null;
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
			++length;
		}
	}

	// removeFirst()
	public Node removeFirst() {
		Node temp = head;
		// head.equals(null) or tail.equals(null)
		if (length == 0)
			return null;
		if (length == 1) {
			head = null;
			tail = null;
		} else {
			head = temp.next;
			temp.next = null;
			head.prev = null;
		}
		--length;
		return temp;
	}

	// get()
	public Node get(int index) {
		if (index < 0 || index >= length)
			return null;
		Node temp = head;
		if (index < length / 2)
			for (int i = 0; i < index; ++i)
				temp = temp.next;
		else {
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
	public Node remove(int index) {
		if (index < 0 || index >= length)
			return null;
		if (index == 0)
			return removeFirst();
		if (index == length - 1)
			return removeLast();

		Node temp = get(index);
		Node b = temp.prev;
		Node a = temp.next;

		b.next = a;
		a.prev = b;
		temp.prev = null;
		temp.next = null;
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