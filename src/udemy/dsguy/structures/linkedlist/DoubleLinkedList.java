package udemy.dsguy.structures.linkedlist;


public class DoubleLinkedList<T> extends LinkedListDouble{

	public DoubleLinkedList()
	{
		head = new DoubleNode(null);
		tail = null;
	}

	public void add(T nodeValue)
	{
		insertInLinkedList(nodeValue, getSize());
	}

	public void addFirst(T nodeValue)
	{
		insertInLinkedList(nodeValue, 0);
	}

	public void addLast(T nodeValue)
	{
		insertInLinkedList(nodeValue, getSize());
	}

	public void insertInLinkedList(T nodeValue, int location)
	{
		DoubleNode node = new DoubleNode(nodeValue);
		//node.setValue(nodeValue);
		if (!existsLinkedList())
		{
			System.out.println("The linked list does not exist!!");
			return; // Linked List does not exists
		}
		else if (location == 0)
		{// insert at first position
			if(tail == null)
			{
				node.setNext(null);
				node.setPrev(null);
				head = node;
				tail = node;
			}
			else
			{
				node.setNext(head);
				node.setPrev(null);
				head.setPrev(node);
				head = node;
			}
		}
		else if (location >= size)
		{// insert at last position
			node.setNext(null);
			tail.setNext(node);
			node.setPrev(tail);
			tail = node; // to keep track of last node
		}
		else
		{// insert at specified location
			DoubleNode tempNode = head;
			int index = 0;
			while (index < location - 1) {// loop till we reach specified node
				tempNode = tempNode.getNext();
				index++;
			}
			node.setPrev(tempNode);
			node.setNext(tempNode.getNext());
			tempNode.setNext(node);
			node.getNext().setPrev(node);
		}
		size++;
	}

	
	// Traverse the linked list from head to last
	void traverseLinkedListInReverseOrder() {
		if (existsLinkedList()) {
			DoubleNode tempNode = tail;
			for (int i = 0; i < size; i++) {
				System.out.print(tempNode.getValue());
				if (i != size-1) {
					System.out.print(" <- ");
				}
				tempNode = tempNode.getPrev();
			}
		} else {
			System.out.println("Linked List does not exists");
		}
		System.out.println("\n");
	}
	
	//delete whole linked list
	void deleteLinkedList() {
		System.out.println("\n\nDeleting Linked List...");
		DoubleNode tempNode = head;
		for (int i = 0; i < size; i++) {
			tempNode.setPrev(null);
			tempNode = tempNode.getNext();
		}
		
		head = null;
		tail = null;
		System.out.println("Linked List deleted successfully !");
	 }

	
	// Deletes a node having a given value
	public void deletionOfNode(int location)
	{
		if (!existsLinkedList())
		{
			System.out.println("The linked list does not exist!!");// Linked List does not exists
			return;
		}
		else if (location == 0)
		{ // we want to delete first element
			if (getSize() == 1)
			{ // if this is the only node in this list
				head = tail = null;
				size--;
				return;
			}
			else
			{
				head = head.getNext();
				head.setPrev(null);
				size--;
			}
		}
		else if (location >= getSize()-1)
		{ // If location is not in range or equal, then delete last node
			DoubleNode tempNode = tail.getPrev(); // temp node points to 2nd last node
			if (tempNode == head)
			{ // if this is the only element in the list
				tail = head = null;
				size--;;
				return;
			}
			tempNode.setNext(null);
			tail = tempNode;
			size--;
		}
		else
		{ // if any inside node is to be deleted
			DoubleNode tempNode = head;
			for (int i = 0; i < location - 1; i++)
			{
				tempNode = tempNode.getNext(); // we need to traverse till we find the location
				System.out.println("The value of tempNode is: " + tempNode.getValue());
			}
			tempNode.setNext(tempNode.getNext().getNext()); // delete the required node
			tempNode.getNext().setPrev(tempNode);
			size--;
		} // end of else

	}// end of method

}//end of class
