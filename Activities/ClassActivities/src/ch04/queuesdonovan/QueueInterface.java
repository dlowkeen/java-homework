package ch04.queuesdonovan;

public interface QueueInterface<T>  {
	void enqueue(T data) throws QueueOverflowException;
	
	T dequeue() throws QueueUnderflowException;
	
	boolean isFull();
	
	boolean isEmpty();
	
	int size();
}
