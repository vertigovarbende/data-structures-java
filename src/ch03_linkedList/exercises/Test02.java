package ch03_linkedList.exercises;

public class Test02 {
	public static void main(String[] args) {
		
		// (1) if there is no node in linked list
		LL_02_v1 myLinkedList = new LL_02_v1(1);
		myLinkedList.clear();
		System.out.println(myLinkedList.hasLoop());
		
		// (2) if there is one node in linked list
		System.out.println();
		myLinkedList.append(1);
		myLinkedList.printList();
		System.out.println(myLinkedList.hasLoop());
		
		// (3) if there is no loop in linked list
		System.out.println();
		myLinkedList.append(2);
		myLinkedList.append(3);
		myLinkedList.append(4);
		myLinkedList.append(5);
		System.out.println(myLinkedList.hasLoop());
		
		// (4) if there is a loop in linked list
		
	}
}
