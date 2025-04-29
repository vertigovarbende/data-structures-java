package ch05_stacks_queues.exercises;

import java.util.Stack;

public class Queue_05_v1 {
	private Stack<Integer> stack1;
	private Stack<Integer> stack2;

	public Queue_05_v1() {
		stack1 = new Stack<>();
		stack2 = new Stack<>();
	}

	public void enqueue(int value) {
		while (!stack1.empty()) {
			stack2.push(stack1.pop());
		}
		stack1.push(value);
		while (!stack2.empty()) {
			stack1.push(stack2.pop());
		}
	}

	public Integer dequeue() {
		if (stack1.empty()) {
			return null;
		} else {
			return stack1.pop();
		}
	}

	public int peek() {
		return stack1.peek();
	}

	public boolean isEmpty() {
		return stack1.isEmpty();
	}
}
