package ch03_linkedList.exercises;

public class Test01 {

	public static void main(String[] args) {
		
		// (1)
		/*
		LL_01_v1 myLinkedList = new LL_01_v1(1);
		myLinkedList.append(2);
		myLinkedList.append(3);
		myLinkedList.append(4);
		myLinkedList.append(5);
		
		int middleValue = myLinkedList.findMiddleNode().value;
		System.out.println("Middle value is: " + middleValue);
		
		System.out.println();
		
		myLinkedList.append(6);
		middleValue = myLinkedList.findMiddleNode().value;
		System.out.println("Middle value is: " + middleValue);
		*/
		
		// (2) 
		
		// if linked list is empty
		LL_01_v1 myLinkedList = new LL_01_v1(1);
		myLinkedList.clear();
		System.out.println("Middle vaiue is: " + myLinkedList.findMiddleNode()); // 'null' because linked list is empty!
		
		System.out.println();
		
		// if linked list has 1 node
		myLinkedList.append(1);
		System.out.println("Middle value is: " + myLinkedList.findMiddleNode().value);
		
		System.out.println();
		
		// if there is more than 1 value in the linked list and the length is an odd number
		myLinkedList.append(2);
		myLinkedList.append(3);
		myLinkedList.append(4);
		myLinkedList.append(5);
		System.out.println("Middle value is: " + myLinkedList.findMiddleNode().value);
		
		System.out.println();
		
		// if there is more than 1 value in the linked list and the length is an even number
		myLinkedList.append(6);
		System.out.println("Middle value is: " + myLinkedList.findMiddleNode().value);
		
	}
}
