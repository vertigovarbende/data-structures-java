package ch04_doublyLinkedList;

public class Main {

	public static void main(String[] args) {
		
		// Constructor and getter methods
		/*
		DoublyLinkedList myDLL = new DoublyLinkedList(7);
		
		System.out.println(myDLL.getHead().value);
		System.out.println(myDLL.getTail().value);
		System.out.println(myDLL.getLength());
		
		myDLL.printList();
		*/
		
		// append()
		/*
		DoublyLinkedList myDLL = new DoublyLinkedList(1);
		myDLL.append(2);
		myDLL.append(3);
		myDLL.printList();
		*/
		
		// removeLast()
		/*
		DoublyLinkedList myDLL = new DoublyLinkedList(1);
		myDLL.append(2);
		myDLL.append(3);
		myDLL.printList();
		System.out.println();
		System.out.println(myDLL.removeLast().value);
		System.out.println(myDLL.removeLast().value);
		System.out.println(myDLL.removeLast().value);
		System.out.println(myDLL.removeLast());
		*/
		
		// prepend()
		/*
		DoublyLinkedList myDLL = new DoublyLinkedList(1);
		myDLL.append(2);
		myDLL.append(3);
		myDLL.prepend(0);
		myDLL.printList();
		*/
		
		// removeFirst()
		/*
		DoublyLinkedList myDLL = new DoublyLinkedList(1);
		myDLL.append(2);
		myDLL.append(3);
		myDLL.prepend(0);
		myDLL.printList();
		
		System.out.println(myDLL.removeFirst().value);
		System.out.println(myDLL.removeFirst().value);
		System.out.println(myDLL.removeFirst().value);
		System.out.println(myDLL.removeFirst().value);
		System.out.println(myDLL.removeFirst()); // null
		myDLL.printList();
		*/
		
		// Get()
		/*
		DoublyLinkedList myDLL = new DoublyLinkedList(1);
		myDLL.append(2);
		myDLL.append(3);
		myDLL.prepend(0);
		myDLL.append(4);
		myDLL.append(5);
		myDLL.append(6);
		myDLL.append(7);
		myDLL.printList();
		
		for (int i = 0; i < myDLL.getLength(); ++i) {
			System.out.println(myDLL.get(i).value);
		}
		*/
		
		// set()
		/*
		DoublyLinkedList myDLL = new DoublyLinkedList(11);
		myDLL.append(3);
		myDLL.append(23);
		myDLL.append(7);
		
		myDLL.printList();
		myDLL.set(1, 34);
		myDLL.printList();
		*/
		
		// insert()
		/*
		DoublyLinkedList myDLL = new DoublyLinkedList(1);
		myDLL.append(2);
		myDLL.append(4);
		myDLL.prepend(0);
		myDLL.printList();
		
		myDLL.insert(3, 3);
		myDLL.printList();
		*/
		
		// remove()
		DoublyLinkedList myDLL = new DoublyLinkedList(1);
		myDLL.append(2);
		myDLL.append(3);
		myDLL.prepend(0);
		myDLL.printList();
		
		System.out.println(myDLL.remove(3).value);
		myDLL.printList();
		System.out.println(myDLL.remove(2).value);
		myDLL.printList();
		System.out.println(myDLL.remove(1).value);
		myDLL.printList();
		System.out.println(myDLL.remove(0).value);
		myDLL.printList();
	}
}
