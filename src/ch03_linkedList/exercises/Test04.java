package ch03_linkedList.exercises;

public class Test04 {

	public static void main(String[] args) {
		
		// empty list
		LL_04_v1 myEmptyList = new LL_04_v1(0);
		myEmptyList.clear();
		myEmptyList.printList();
		System.out.println();
		myEmptyList.removeDuplicates();
		System.out.println(myEmptyList.getLength());
		System.out.println();
		
		// test 1
		
		LL_04_v1 myLinkedList = new LL_04_v1(1);
		myLinkedList.append(2);
		myLinkedList.append(3);
		myLinkedList.append(1);
		myLinkedList.append(4);
		myLinkedList.append(2);
		myLinkedList.append(5);
		
		myLinkedList.printList();
		System.out.println();
		myLinkedList.removeDuplicates();
		myLinkedList.printList();
		System.out.println();
		System.out.println(myLinkedList.getLength());
		
		// test 2
		System.out.println();
		LL_04_v1 myLinkedList2 = new LL_04_v1(1);
		myLinkedList2.append(3);
		myLinkedList2.append(4);
		myLinkedList2.append(3);
		myLinkedList2.append(5);
		myLinkedList2.append(6);
		myLinkedList2.append(5);
		
		myLinkedList2.printList();
		System.out.println();
		myLinkedList2.removeDuplicates();
		myLinkedList2.printList();
		System.out.println();
		System.out.println(myLinkedList2.getLength());
		
		// test 3 
		// if all nodes are duplicates
		System.out.println();
		LL_04_v1 myLinkedList3 = new LL_04_v1(1);
		myLinkedList3.append(1);
		myLinkedList3.append(1);
		myLinkedList3.append(1);
		myLinkedList3.append(1);
		
		myLinkedList3.printList();
		System.out.println();
		myLinkedList3.removeDuplicates();
		myLinkedList3.printList();
		
	}
	
}
