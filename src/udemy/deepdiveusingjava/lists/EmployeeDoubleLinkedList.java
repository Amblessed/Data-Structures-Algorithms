package udemy.deepdiveusingjava.lists;

import udemy.deepdiveusingjava.Employee;

public class EmployeeDoubleLinkedList {

    private EmployeeDoubleNode head;
    private EmployeeDoubleNode tail;
    private int size;

    public EmployeeDoubleLinkedList() {
        head = new EmployeeDoubleNode(null);
        tail = null;
    }

    public void addFirst(Employee employee)
    {
        EmployeeDoubleNode node = new EmployeeDoubleNode(employee);
        node.setNext(head);
        if(isEmpty())
        {
            tail = node;
        }
        else
        {
            head.setPrevious(node);
        }
        size++;
    }

    public void addLast(Employee employee)
    {
        EmployeeDoubleNode node = new EmployeeDoubleNode(employee);
        if(isEmpty())
        {
            head = node;
        }
        else
        {
            tail.setPrevious(node);
            head.setPrevious(node);
        }
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty()
    {
        //return head == null;
        return size == 0;
    }

    public EmployeeDoubleNode removeFirst()
    {
        if(isEmpty())
        {
            return null;
        }
        else
        {
            EmployeeDoubleNode removedNode = head;
            head = head.getNext();
            size--;
            removedNode.setNext(null);
            return removedNode;
        }
    }

    public void printList()
    {
        EmployeeDoubleNode current = head;
        System.out.print("HEAD -> ");
        while(current != null)
        {
            System.out.print(current + " <==> ");
            current = current.getNext();
        }
        System.out.println("null");

    }
}
