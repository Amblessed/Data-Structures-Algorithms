package udemy.dsguy.structures.linkedlist;


public class DoubleNode<T> {
	private T value;
	private DoubleNode next;
	private DoubleNode prev;

	public DoubleNode(T value) {
		this.value = value;
	}

	public T getValue() {
		return value;
	}

	/*public void setValue(T value) {
		this.value = value;
	}*/

	public DoubleNode getNext() {
		return next;
	}

	public void setNext(DoubleNode next) {
		this.next = next;
	}

	public DoubleNode getPrev() {
		return prev;
	}

	public void setPrev(DoubleNode prev) {
		this.prev = prev;
	}

	@Override
	public String toString() {
		return  value + "";
	}

}
