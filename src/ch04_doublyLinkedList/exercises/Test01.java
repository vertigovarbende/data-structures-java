package ch04_doublyLinkedList.exercises;

public class Test01 {

	public static void main(String[] args) {
		DLL_01_v1 myDLL = new DLL_01_v1(1);
		myDLL.append(2);
		myDLL.append(3);
		myDLL.append(4);
		myDLL.append(5);
		
		
		System.out.println("DLL before swap:");
		myDLL.printList();

		myDLL.swapFirstLast();

		System.out.println("\nDLL after swap:");
		myDLL.printList();
	}
}
