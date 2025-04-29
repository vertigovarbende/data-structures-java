package ch05_stacks_queues.exercises;

public class Test05 {

	public static void main(String[] args) {
		// enqueue
        Queue_05_v1 q = new Queue_05_v1();

        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        
        System.out.println("Front of the queue: " + q.peek());
        System.out.println("Is the queue empty? " + q.isEmpty());
        
        // dequeue
        System.out.println("Dequeued value: " + q.dequeue());
        System.out.println("Dequeued value: " + q.dequeue());

        q.enqueue(4);

        System.out.println("Front of the queue: " + q.peek());

        System.out.println("Dequeued value: " + q.dequeue());
        System.out.println("Dequeued value: " + q.dequeue());

        System.out.println("Is the queue empty? " + q.isEmpty());

        System.out.println("Dequeued value from empty queue: " + q.dequeue());
	}
}
