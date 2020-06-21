package udemy.deepdiveusingjava.lists;

import udemy.deepdiveusingjava.Employee;

public class EmployeeLinkedList {

    private EmployeeNode head;
    private int size;

    public void addFirst(Employee employee)
    {
        EmployeeNode node = new EmployeeNode(employee);
        node.setNext(head);
        head = node;
        size++;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty()
    {
        //return head == null;
        return size == 0;
    }

    public EmployeeNode removeFirst()
    {
        if(isEmpty())
        {
            return null;
        }
        else
        {
            EmployeeNode removedNode = head;
            head = head.getNext();
            size--;
            removedNode.setNext(null);
            return removedNode;
        }
    }

    public void printList()
    {
        EmployeeNode current = head;
        System.out.print("HEAD -> ");
        while(current != null)
        {
            System.out.print(current + " -> ");
            current = current.getNext();
        }
        System.out.println("null");

    }
}

