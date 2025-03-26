package ch04_doublyLinkedList.exercises;

public class DLL_02_v1 {

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

	public DLL_02_v1(int value) {
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

	public Node get(int index) {
		if (index < 0 || index >= length)
			return null;
		Node temp = head;
		if (index < length / 2)
			for (int i = 0; i < index; ++i)
				temp = temp.next;
		else {
			for (int j = length - 1; j > index; --j)
				temp = temp.prev;
		}
		return temp;
	}

	// method called reverse() that reverses the order of the nodes in the list.
	// This method should reverse the order of the nodes in the list by manipulating
	// the pointers of each node, not by swapping the values within the nodes.
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
