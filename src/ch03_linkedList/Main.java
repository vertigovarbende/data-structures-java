package ch03_linkedList;

public class Main {

	public static void main(String[] args) {
		// constructor and get methods
		/* 
		LinkedList myLinkedList = new LinkedList(4);
		
		myLinkedList.getHead();
		myLinkedList.getTail();
		myLinkedList.getLength();
		
		myLinkedList.printList();
		*/
		
		// append()
		/*
		LinkedList myLinkedList = new LinkedList(1);
		myLinkedList.append(2);
		myLinkedList.append(3);
		myLinkedList.append(4);
		myLinkedList.printList();
		*/
		
		// removeLast()
		/*
		LinkedList myLinkedList = new LinkedList(1);
		myLinkedList.append(2);
		
		// (2) Items - Returns 2 Node
		System.out.println(myLinkedList.removeLast().value); 
		System.out.println("After");
		myLinkedList.printList();
		
		// (1) Item - Return 1 Node
		System.out.println(myLinkedList.removeLast().value); 
		System.out.println("After");
		myLinkedList.printList(); // empty
		
		// (0) Items - Returns null
		System.out.println(myLinkedList.removeLast()); // null
		*/
		
		// prepend()
		/*
		LinkedList myLinkedList = new LinkesdList(2);
		myLinkedList.append(3);
		myLinkedList.printList();
		System.out.println();
		myLinkedList.prepend(1);
		myLinkedList.printList();
		*/
		
		// removeFirst()
		/*
		LinkedList myLinkedList = new LinkedList(2);
		myLinkedList.append(1);
		myLinkedList.printList();
		System.out.println();
		
		// (2) Items - Returns 2 Node
		System.out.println(myLinkedList.removeFirst().value);
		// (1) Item - Returns 1 Node
		System.out.println(myLinkedList.removeFirst().value);
		// (0) Items - Returns null
		System.out.println(myLinkedList.removeFirst());
		*/
		
		// get()
		/*
		LinkedList myLinkedList = new LinkedList(0);
		myLinkedList.append(1);
		myLinkedList.append(2);
		myLinkedList.append(3);
		
		myLinkedList.printList();
		System.out.println();
		
		System.out.println(myLinkedList.get(2).value);
		*/
		
		// set()
		/*
		LinkedList myLinkedList = new LinkedList(11);
		myLinkedList.append(3);
		myLinkedList.append(23);
		myLinkedList.append(7);
		
		myLinkedList.printList();
		System.out.println();
		
		myLinkedList.set(1, 4);
		myLinkedList.printList();
		*/
		
		// insert()
		/*
		LinkedList myLinkedList = new LinkedList(0);
		myLinkedList.append(2);
		myLinkedList.printList();
		System.out.println();
		myLinkedList.insert(1, 1);
		myLinkedList.printList();
		*/
		
		// remove()
		/*
		LinkedList myLinkedList = new LinkedList(11);
		myLinkedList.append(3);
		myLinkedList.append(23);
		myLinkedList.append(7);
		
		myLinkedList.printList();
		System.out.println();
		
		myLinkedList.remove(2);
		myLinkedList.printList();
		*/
		
		// reverse()
		LinkedList myLinkedList = new LinkedList(3);
		myLinkedList.append(4);
		myLinkedList.append(5);
		myLinkedList.append(6);
		
		myLinkedList.printList();
		System.out.println();
		
		myLinkedList.reverse();
		myLinkedList.printList();
		
	}
}
