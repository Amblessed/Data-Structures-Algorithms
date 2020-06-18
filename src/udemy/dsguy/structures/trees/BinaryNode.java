package udemy.dsguy.structures.trees;

import java.util.Comparator;

public class BinaryNode<T> {
	private T value;
	private int height;
	private BinaryNode<T> left;
	private BinaryNode<T> right;

	public BinaryNode(T value)
	{
		this.value = value;
	}

	public int getHeight() {
		return height;
	}//end of method
	
	public void setHeight(int height) {
		this.height = height;
	}//end of method
	
	public T getValue()
	{
		return value;
	}//end of method

	public void setValue(T value) {
		this.value = value;
	}//end of method

	public BinaryNode<T> getLeft() {
		return left;
	}//end of method

	public void setLeft(BinaryNode<T> left) {
		this.left = left;
	}//end of method

	public BinaryNode<T> getRight() {
		return right;
	}//end of method

	public void setRight(BinaryNode<T> right) {
		this.right = right;
	}//end of method

	@Override
	public String toString() {
		return value + "";
	}//end of method


}
