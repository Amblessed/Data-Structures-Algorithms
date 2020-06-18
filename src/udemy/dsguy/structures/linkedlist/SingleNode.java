package udemy.dsguy.structures.linkedlist;

public  class SingleNode<T> {
	private T value;
	private SingleNode next;

	public SingleNode(T value) {
		this.value = value;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public SingleNode getNext() {
		return next;
	}

	public void setNext(SingleNode next) {
		this.next = next;
	}

@Override
public String toString() {
	return  value + "";
}

}
