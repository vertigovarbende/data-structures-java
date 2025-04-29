package ch05_stacks_queues.exercises;

public class Test03 {

	public static void main(String[] args) {

		System.out.println(isBalancedParentheses("()()") == true);
		System.out.println(isBalancedParentheses("(())") == true);
		System.out.println(isBalancedParentheses("(()())") == true);
		System.out.println(isBalancedParentheses("(") == false);
		System.out.println(isBalancedParentheses("))") == false);
		System.out.println(isBalancedParentheses("(()") == false);
		System.out.println(isBalancedParentheses(")()(") == false);
	}

	public static boolean isBalancedParentheses(String myString) {
		Stack_03_v1<Character> myStack = new Stack_03_v1<>();
		for (char c : myString.toCharArray()) {
			if (c == '(')
				myStack.push(c);
			else if (c == ')' && !myStack.isEmpty() && myStack.peek() == '(')
				myStack.pop();
			else if (c == ')' && (myStack.isEmpty() || myStack.peek() != '('))
				return false;
		}
		if (myStack.isEmpty())
			return true;
		else
			return false;
	}
}
