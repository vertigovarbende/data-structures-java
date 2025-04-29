package ch05_stacks_queues.exercises;

public class Test04 {

	public static void main(String[] args) {
        Stack_04_v1<Integer> stack = new Stack_04_v1<>();
        stack.push(3);
        stack.push(1);
        stack.push(4);
        stack.push(2);

        System.out.println("Before sorting:");
        stack.printStack();

        sortStack(stack);

        System.out.println("\nAfter sorting:");
        stack.printStack();
	}
	
    public static void sortStack(Stack_04_v1<Integer> stack) {
        Stack_04_v1<Integer> additionalStack = new Stack_04_v1<>();
        while(!stack.isEmpty()) {
            int temp = stack.pop();
            while(!additionalStack.isEmpty() && additionalStack.peek() > temp) {
                stack.push(additionalStack.pop());
            }
            additionalStack.push(temp);
        }
        while (!additionalStack.isEmpty()) {
            stack.push(additionalStack.pop());
        }
    }
}


