package app;

import queues.*;

public class LinkedQueueDriver {
	public static void main (String[] args) {
		QueueInterface<String> queue = new LinkedQueue<String>();
		queue.enqueue("alpha");
		queue.enqueue("beta");
		queue.enqueue("gamma");
		System.out.println(queue.toString());
		
		queue.enqueue("delta");
		System.out.println(queue.toString());
		queue.remove(2);
		System.out.println(queue.toString());
		queue.remove(2);

		System.out.println(queue.toString()); // I printed "Queue is empty" instead of an empty string just for debugging
	}
}
