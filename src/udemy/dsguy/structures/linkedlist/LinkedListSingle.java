package udemy.dsguy.structures.linkedlist;

public class LinkedListSingle<T> {

    public SingleNode head;
    public SingleNode tail;
    public int size;// denotes size of list


    public SingleNode getHead() {
        return head;
    }

    public int getSize()
    {
        return size;
    }

    public SingleNode getTail() {
        return tail;
    }

    public boolean existsLinkedList()
    {
        // if head is not null retrun true otherwise return false
        return head != null;
    }


    //Searches a node with given value
    public boolean searchNode(T nodeValue) {
        if (existsLinkedList()) {
            SingleNode tempNode = head;
            for (int i = 0; i < getSize(); i++) {
                if (tempNode.getValue() == nodeValue) {
                    System.out.print("Found the node at location: "+i+"\n");
                    return true;
                }
                tempNode = tempNode.getNext();
            }
        }
        System.out.print("Node not found!! \n");
        return false;
    }

    //Traverses Linked List
    public void traverseLinkedList() {
        if (existsLinkedList()) {
            SingleNode tempNode = head;
            for (int i = 0; i < getSize(); i++) {
                System.out.print(tempNode.getValue());
                if (i != getSize() - 1) {
                    System.out.print(" -> ");
                }
                tempNode = tempNode.getNext();
            }
        }else {
            System.out.println("Linked List does not exists !");
        }
        System.out.println("\n");
    }
}
