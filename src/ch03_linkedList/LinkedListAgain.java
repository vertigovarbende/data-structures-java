package ch03_linkedList;

public class LinkedListAgain {

	// The private instance variables
	private Node head;
	private Node tail;
	private int length;

	// Inner Class
	class Node {
		int value;
		Node next;

		public Node(int value) {
			this.value = value;
		}
	}

	// Constructor
	public LinkedListAgain(int value) {
		Node newNode = new Node(value);
		head = newNode;
		tail = newNode;
		length = 1;
	}

	// printList()
	public void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.value);
			temp = temp.next;
		}
	}

	// Getter methods for private instance variables
	public int getHead() {
		return head.value;
	}

	public int getTail() {
		return tail.value;
	}

	public int getLength() {
		return length;
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
			tail = newNode;
		}
		++length;
	}

	// removeLast()
	public Node removeLast() {
		// head.equals(null) or tail.equals(null)
		if (length == 0)
			return null;
		Node temp = head;
		Node prev = head;
		while (temp.next != null) {
			prev = temp;
			temp = temp.next;
		}
		tail = prev;
		tail.next = null;
		--length;
		if (length == 0) {
			head = null;
			tail = null;
		}
		return temp;
	}

	// prepend()
	public void prepend(int value) {
		Node newNode = new Node(value);
		// head.equals(null) or tail.equals(null)
		if (length == 0) {
			head = newNode;
			tail = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}
		++length;
	}

	// removeFirst()
	public Node removeFirst() {
		// head.equals(null) or tail.equals(null)
		if (length == 0)
			return null;
		Node temp = head;
		head = temp.next;
		temp.next = null;
		--length;
		if (length == 0) {
//			head = null;	it's already null
			tail = null;
		}
		return temp;
	}

	// get(index)
	public Node get(int index) {
		if (index < 0 || index >= length)
			return null;
		Node temp = head;
		for (int i = 0; i < index; ++i)
			temp = temp.next;
		return temp;
	}

	// set(index, value)
	public boolean set(int index, int value) {
		Node temp = get(index);
		if (temp != null) {
			temp.value = value;
			return true;
		}
		return false;
	}

	// insert(index, value)
	public boolean insert(int index, int value) {
		Node newNode = new Node(value);
		// head.equals(null) or tail.equals(null)
		if (index < 0 || index > length)
			return false;
		else if (index == 0) {
			prepend(value);
			return true;
		} else if (index == length) {
			append(value);
			return true;
		}
		Node temp = get(index - 1);
		newNode.next = temp.next;
		temp.next = newNode;
		++length;
		return true;
	}

	// remove(index)
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
	
	// reverse()
	public void reverse() {
		Node temp = head;
		head = tail;
		tail = temp;
		Node a = temp.next;
		Node b = null;
		for (int i = 0; i < length; ++i) {
			a = temp.next;
			temp.next = b;
			b = temp;
			temp = a;
		}
	}
}
