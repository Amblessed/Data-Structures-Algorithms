package udemy.dsguy.structures.linkedlist;

public class LinkedListDouble<T> {

    protected DoubleNode head;
    protected DoubleNode tail;
    protected int size;//denotes size of list

    public int getSize() {
        return size;
    }

    public boolean existsLinkedList()
    {
        //if head is not null return true otherwise return false
        return head!=null;
    }

    //Search for a node in linked list
    public boolean searchNode(T nodeValue)
    {
        if(existsLinkedList())
        {
            DoubleNode tempNode=head;
            for(int i =0; i<size;i++)
            {
                if(tempNode.getValue()==nodeValue)
                {
                    System.out.print("Found the node at locaiton: " + i);
                    return true;
                }
                tempNode=tempNode.getNext();
            }
        }
        System.out.print("Node not found!! ");
        return false;
    }

    //Traverse the linked list from head to last
    public void traverseLinkedList()
    {
        if(existsLinkedList()) {
            //System.out.println("Linked List now: ");
            DoubleNode tempNode=head;
            for(int i =0; i<size;i++) {

                System.out.print(tempNode.getValue());
                if(i!=size-1) {
                    System.out.print(" -> ");
                }
                tempNode=tempNode.getNext();
            }
        }else {
            System.out.println("Linked List does not exists");
        }
        System.out.println("\n");
    }


}
