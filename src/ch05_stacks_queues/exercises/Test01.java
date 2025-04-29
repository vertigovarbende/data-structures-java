package ch05_stacks_queues.exercises;

public class Test01 {

	public static void main(String[] args) {
		Stack_01_v1 myStack = new Stack_01_v1();

		myStack.push(1);
		myStack.push(2);
		myStack.push(3);
		myStack.push("StringType");
		myStack.push(3.14);
		
		myStack.printStack();
	}
}
