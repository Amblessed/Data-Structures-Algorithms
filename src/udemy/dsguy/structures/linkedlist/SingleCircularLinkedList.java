package udemy.dsguy.structures.linkedlist;

public class SingleCircularLinkedList<T> extends LinkedListSingle{

	public SingleCircularLinkedList()
	{
		head = new SingleNode(null);
		tail = null;
	}


	/*SingleNode createSingleLinkedList(int nodeValue) {
		head = new SingleNode();
		SingleNode node = new SingleNode();
		node.setValue(nodeValue);
		node.setNext(node);
		head = node;
		tail = node;
		size = 1;// size =1
		return head;
	}*/

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

	void insertInLinkedList(T nodeValue, int location)
	{
		SingleNode node = new SingleNode(nodeValue);
		if (!existsLinkedList()) {
			System.out.println("The linked list does not exist!!");
			return; // Linked List does not exists
		}
		else if (location == 0)
		{// insert at first position
			if(tail == null)
			{
				node.setNext(node);
				head = node;
				tail = node;
			}
			else
			{
				node.setNext(head);
				head = node;
				tail.setNext(node); // update tail
			}

		}
		else if (location >= size) {// insert at last position
			tail.setNext(node);
			tail = node; // to keep track of last node
			tail.setNext(head); // update tail to circularly point head
		} else // insert at specified location
		{
			SingleNode tempNode = head;
			int index = 0;
			while (index < location - 1) {// loop till we reach specified node
				tempNode = tempNode.getNext();
				index++;
			}// insert new node after tempNode
			node.setNext(tempNode.getNext());
			tempNode.setNext(node);			
		}
		size++;
	}
	
	// Traverse Linked List
	void printHeadUsingTail() {
		if (existsLinkedList()) {
			System.out.println("Printing Tail...");
			System.out.println(tail.getValue());
			
			System.out.println("Printing Head using Head reference...");
			System.out.println(head.getValue());
			
			System.out.println("Printing Head using Tail reference...");
			System.out.println(tail.getNext().getValue());
			
		}else{
			System.out.println("Linked List does not exists");
		}
	}

	
	//Delete linked list
	void deleteLinkedList() {
		System.out.println("\n\nDeleting Linked List...");
		head = null;
		if(tail == null)
		{
			System.out.println("Linked List is already deleted, nothing to delete !");
			return;
		}
		else
		{
			tail.setNext(null);
			tail = null;
			System.out.println("Linked List deleted successfully !");
		}
	}


	public void deletionOfNode(int location)
	{
		if (!existsLinkedList()) {
			System.out.println("The linked list does not exist!!");// Linked List does not exists
			return;
		} else if (location == 0) { // we want to delete first element
			head = head.getNext();
			tail.setNext(head);
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
			tempNode.setNext(head); 
			tail= tempNode;
			size--;;
			
		}else { //if any inside node is to be deleted
			SingleNode tempNode = head;
			for (int i = 0; i < location - 1; i++) {
				tempNode = tempNode.getNext(); // we need to traverse till we find the location
			}	
			tempNode.setNext(tempNode.getNext().getNext()); // delete the required node
			size--;
		}//end of else	
		
	}//end of method

}//end of class
