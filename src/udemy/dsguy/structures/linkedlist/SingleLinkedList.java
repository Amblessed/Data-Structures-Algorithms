package udemy.dsguy.structures.linkedlist;

public class SingleLinkedList<T> extends LinkedListSingle {


	public SingleLinkedList()
	{
		head = new SingleNode(null);
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

	public void deleteFirst()
	{
		deletionOfNode(0);
	}

	public void deleteLast()
	{
		deletionOfNode(getSize());
	}

	public void setHead(SingleNode head) {
		this.head = head;
	}

	public void setTail(SingleNode tail) {
		this.tail = tail;
	}

	
	public void insertInLinkedList(T nodeValue, int location) {

		SingleNode node = new SingleNode(nodeValue);

		if (!existsLinkedList())
		{ // Linked List does not exists
			System.out.println("The linked list does not exist!!");
			return; 
		}
		else if (location == 0)
		{
			// insert at first position
			if(tail == null)
			{
				node.setNext(null);
				head = node;
				tail = node;
			}
			else
			{
				node.setNext(head);
				head = node;
			}
		}
		else if (location >= size)
		{// insert at last position
			node.setNext(null);
			tail.setNext(node);
			tail = node; 
		}
		else
		{// insert at specified location
			SingleNode tempNode = head;
			int index = 0;
			while (index < location - 1) {// loop till we reach specified node
				tempNode = tempNode.getNext();
				index++;
			}//tempNode currently references to node after which we should insert new node
			SingleNode nextNode = tempNode.getNext(); //this is the immediate next node after new node
			tempNode.setNext(node);//update reference of tempNode to reference to new node
			node.setNext(nextNode);//update newly added nodes' next.
		}
		size++;
	}

	//Deletes entire Linked List
	void deleteLinkedList() {
		System.out.println("\n\nDeleting Linked List...");
		head = null;
		tail = null;
		System.out.println("Linked List deleted successfully !");
	}

	//Deletes a node having a given value
	public void deletionOfNode(int location) {
		if (!existsLinkedList()) {
			System.out.println("The linked list does not exist!!");// Linked List does not exists
			return;
		}
		else if (location == 0)
		{ // we want to delete first element
			head = head.getNext();
			size--;
			if(getSize() == 0) { // if there are no more nodes in this list
				tail = null;
			}	
		}else if (location >= getSize()){ //If location is not in range or equal, then delete last node
			SingleNode tempNode = head;
			for (int i = 0; i < size - 1; i++) {
				tempNode = tempNode.getNext(); //temp node points to 2nd last node
			}
			if (tempNode == head) { //if this is the only element in the list
				tail = head = null;
				size--;
				return;
			}
			tempNode.setNext(null); 
			tail= tempNode;
			size--;
			
		}else { //if any inside node is to be deleted
			SingleNode tempNode = head;
			for (int i = 0; i < location - 1; i++) {
				tempNode = tempNode.getNext(); // we need to traverse till we find the location
			}	
			tempNode.setNext(tempNode.getNext().getNext()); // delete the required node
			size--;
		}//end of else	
		
	}//end of method
	
}// end of class


