package ch05_stacks_queues;

public class MainQueue {

	public static void main(String[] args) {

		// Constructor and Getter methods

		/*
		Queue myQueue = new Queue(7);

		myQueue.getFirst();
		myQueue.getLast();
		myQueue.getLength();
		*/
		
		// enqueue()
		/*
		Queue myQueue = new Queue(1);
		myQueue.enqueue(2);
		
		myQueue.printQueue();
		*/
		
		// dequeue()
		Queue myQueue = new Queue(1);
		myQueue.enqueue(2);
		System.out.println("before dequeue");
		myQueue.printQueue();
		System.out.println("\nafter dequeue");
		System.out.println(myQueue.dequeue().value);
		System.out.println(myQueue.dequeue().value);
		System.out.println(myQueue.dequeue()); // null
		
	}
}