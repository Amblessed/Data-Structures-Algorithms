package udemy.dsguy.structures.queues;


import udemy.dsguy.structures.linkedlist.SingleLinkedList;

public class QueueLinkedList<T> {
	
	SingleLinkedList list;
	private int sizeOfQueue;

	//constructor
	public QueueLinkedList() {
		list = new SingleLinkedList();
	}//end of method

	public int size()
	{
		return sizeOfQueue;
	}
	
	public void enQueue(int value)
	{
		if (list.tail == null)
		{
			list.add(value);
		}
		else
		{
			// push a value on last of queue, update list tail too
			list.insertInLinkedList(value, list.getSize());
		}
		sizeOfQueue++;
	}//end of method

	
	public T deQueue() {
		//int value = -1;
		T value = null;
		if (isQueueEmpty())
		{
			System.out.println("Queue underflow error!!");
		}
		else
		{
			System.out.println("Dequeuing....");
			value = (T) list.getHead().getValue();
			list.deletionOfNode(0);
			sizeOfQueue--;
		}
		return value;
	}//end of method

	public T peek()
	{
		if (!isQueueEmpty())
		{
			System.out.println("\nPeeking value");
			return (T) list.getHead().getValue();
		}
		else
		{
			System.out.println("The queue is empty!!");
			return null;
		}
	}//end of method

	
	public boolean isQueueEmpty() {
		if (list.getHead() == null)
			return true;
		else
			return false;
	}//end of method
	
	
	public void deleteQueue() {
		list.setHead(null);
	}//end of method

}//end of class
