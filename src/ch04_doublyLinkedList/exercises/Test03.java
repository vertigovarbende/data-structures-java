package ch04_doublyLinkedList.exercises;

public class Test03 {

	public static void main(String[] args) {

		System.out.println("DLL_03_v1");

		DLL_03_v1 myDLL1 = new DLL_03_v1(1);
		myDLL1.append(2);
		myDLL1.append(3);
		myDLL1.append(2);
		myDLL1.append(1);

		System.out.println("myDLL1 isPalindrome:");
		System.out.println(myDLL1.isPalindrome());

		DLL_03_v1 myDLL2 = new DLL_03_v1(1);
		myDLL2.append(2);
		myDLL2.append(3);

		System.out.println("\nmyDLL2 isPalindrome:");
		System.out.println(myDLL2.isPalindrome());

		System.out.println();
		System.out.println("DLL_03_v2");

		DLL_03_v2 myDLL3 = new DLL_03_v2(1);
		myDLL3.append(2);
		myDLL3.append(3);
		myDLL3.append(2);
		myDLL3.append(1);

		System.out.println("myDLL3 isPalindrome:");
		System.out.println(myDLL3.isPalindrome());

		DLL_03_v2 myDLL4 = new DLL_03_v2(1);
		myDLL4.append(2);
		myDLL4.append(3);

		System.out.println("\nmyDLL4 isPalindrome:");
		System.out.println(myDLL4.isPalindrome());

	}
}
