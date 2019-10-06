package pair;

public class ArrayPair<T> implements PairInterface<T> {
	
	private T[] arr;
	
	public ArrayPair(T[] arr) {
		this.arr = (T[]) new Object[2];
		this.arr[0] = arr[0];
		this.arr[1] = arr[1];
	}

	@Override
	public T getFirst() {
		return this.arr[0];
	}

	@Override
	public T getSecond() {
		return this.arr[1];
	}

	@Override
	public void setFirst(T first) {
		this.arr[0] = first;
	}

	@Override
	public void setSecond(T second) {
		this.arr[1] = second;
	}

}
