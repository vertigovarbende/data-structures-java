package ch03_linkedList.exercises;

public class Test03 {
	
	public static void main(String[] args) {
		LL_03_v1 myLinkedList = new LL_03_v1(1);
		
		// (1) if there is no node in linked list
		myLinkedList.clear();
		myLinkedList.printList();
		System.out.println(myLinkedList.findKthFromEnd(2)); // null
		
		// (2) if linked list has node
		System.out.println();
		myLinkedList.append(1);
		myLinkedList.append(2);
		myLinkedList.append(3);
		myLinkedList.append(4);
		myLinkedList.append(5);
		System.out.println(myLinkedList.findKthFromEnd(1).value == 5);
		System.out.println(myLinkedList.findKthFromEnd(3).value == 3);
		System.out.println(myLinkedList.findKthFromEnd(2).value == 4);
	}

}
