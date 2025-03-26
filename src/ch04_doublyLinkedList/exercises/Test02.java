package ch04_doublyLinkedList.exercises;

public class Test02 {

	public static void main(String[] args) {
		
		DLL_02_v1 myDLL = new DLL_02_v1(1);
		myDLL.append(2);
		myDLL.append(3);
		myDLL.append(4);
		myDLL.append(5);

		System.out.println("DLL before reverse:");
		myDLL.printList();

		myDLL.reverse();

		System.out.println("\nDLL after reverse:");
		myDLL.printList();
	}
}
