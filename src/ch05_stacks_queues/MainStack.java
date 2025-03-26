package ch05_stacks_queues;

public class MainStack {

	public static void main(String[] args) {
		
		
		// Constructor and Getter methods
		/*
		Stack myStack = new Stack(4);
		myStack.getTop();
		myStack.getHeight();
		
		myStack.printStack();
		*/
		
		// push() 
		/*
		Stack myStack = new Stack(4);
		myStack.push(3);
		myStack.push(2);
		myStack.push(1);
		
		myStack.getTop();
		myStack.getHeight();
		myStack.printStack();
		*/
		
		// pop()
		Stack myStack = new Stack(4);
		myStack.push(3);
		myStack.push(2);
		myStack.push(1);
		
		// before pop
		myStack.getTop();
		myStack.getHeight();
		myStack.printStack();
		
		System.out.println();
		// after pop
		myStack.pop();
		myStack.getTop(); // 2
		myStack.getHeight(); // 3
		myStack.printStack(); // 2 -> 3 -> 4
		
	}
}