package ch04_doublyLinkedList.exercises;

public class DLL_03_v1 {

	private Node head;
	private Node tail;
	private int length;

	class Node {
		int value;
		Node next;
		Node prev;

		public Node(int value) {
			this.value = value;
		}
	}

	public DLL_03_v1(int value) {
		Node newNode = new Node(value);
		head = newNode;
		tail = newNode;
		length = 1;
	}

	public Node getHead() {
		return head;
	}

	public Node getTail() {
		return tail;
	}

	public int getLength() {
		return length;
	}

	public void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.value);
			temp = temp.next;
			if (temp != null)
				System.out.print(" <-> ");
		}
		System.out.println();
	}

	public void clear() {
		head = null;
		tail = null;
		length = 0;
	}

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

	// isPalindrome(): boolean
	// this method checks whether a given doubly linked list is palindrome or not
	public boolean isPalindrome() {
		Node a = head;
		Node b = tail;
		if (length == 0)
			return true;
		if (length == 1)
			return true;
		for (int i = 0; i < length / 2; ++i) {
			if (a.value == b.value) {
				a = a.next;
				b = b.prev;
			} else
				return false;
		}
		return true;
	}
}
