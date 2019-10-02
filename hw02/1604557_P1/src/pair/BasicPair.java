package pair;

public class BasicPair<T> implements PairInterface<T> {
	
	private T first;
	private T second;
	
	public BasicPair(T first, T second) {
		this.first = first;
		this.second = second;
	}

	@Override
	public T getFirst() {
		return this.first;
	}

	@Override
	public T getSecond() {
		return this.second;
	}

	@Override
	public void setFirst(T first) {
		this.first = first;
	}

	@Override
	public void setSecond(T second) {
		this.second = second;
	}

}
