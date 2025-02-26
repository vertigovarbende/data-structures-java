package ch03_linkedList.exercises;

public class Test05 {

	public static void main(String[] args) {
		LL_05_v1 myLinkedList = new LL_05_v1(1);
		myLinkedList.append(0);
		myLinkedList.append(1);
		myLinkedList.printList();
		System.out.println("decimal: " + myLinkedList.binaryToDecimal()); // 5
		
		LL_05_v1 myLinkedList2 = new LL_05_v1(1);
		myLinkedList2.append(1);
		myLinkedList2.append(0);
		myLinkedList2.append(1);
		myLinkedList2.append(0);
		myLinkedList2.printList();
		System.out.println("decimal: " + myLinkedList2.binaryToDecimal()); // 26
	}
	
}
