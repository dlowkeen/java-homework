package ch04.queuesdonovan;

import support.LLNode;

public class LinkedQueue<T> implements QueueInterface<T> {

	protected LLNode<T> front;
	protected LLNode<T> rear;
	protected int size;
	
	public LinkedQueue() {
		front = null;
		rear = null;
		size = 0;
	}
	
	@Override
	public void enqueue(T data) {
		LLNode<T> newNode = new LLNode<T>(data);
		if (rear == null) {
			front = newNode;
		} else {
			rear.setLink(newNode);			
		}
		size++;
		rear = newNode;			
	}

	@Override
	public T dequeue() throws QueueUnderflowException {
		if (isEmpty()) {
			throw new QueueUnderflowException("Queue is empty");
		}
		T element = front.getInfo();
		front = front.getLink();
		if (front == null) {
			rear = null;
		}
		size--;
		return element;
	}

	@Override
	public boolean isFull() {
		return false;
	}

	@Override
	public boolean isEmpty() {
		return front == null;
	}

	@Override
	public int size() {
		return size;
	}

}
