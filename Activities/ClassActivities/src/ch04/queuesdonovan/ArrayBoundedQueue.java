package ch04.queuesdonovan;

public class ArrayBoundedQueue<T> implements QueueInterface<T>{
	
	protected final int CAP = 100;
	protected T[] elements;
	protected int size = 0;
	protected int front = 0;
	protected int rear;
	
	public ArrayBoundedQueue() {
		this.elements = (T[]) new Object[CAP];
		this.rear = CAP - 1;
	};

	@Override
	public void enqueue(T data) throws QueueOverflowException {
		if (isFull()) {
			throw new QueueOverflowException("The queue is full");
		}
		if (rear == elements.length - 1) {
			rear = 0;
		} else {
			rear++;
		}
		elements[rear] = data;
		size = size + 1;
	}

	@Override
	public T dequeue() throws QueueUnderflowException {
		if (isEmpty()) {
			throw new QueueUnderflowException("The queue is empty");
		} else {
			T returnElem = elements[front];
			elements[front] = null;
			front = (front + 1) % elements.length;
			size--;
			return returnElem;
		}
	}

	@Override
	public boolean isFull() {
		return rear == (elements.length - 1);
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public int size() {
		return size;
	}
	
}
