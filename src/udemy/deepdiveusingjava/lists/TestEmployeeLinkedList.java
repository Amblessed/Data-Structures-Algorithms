package udemy.deepdiveusingjava.lists;

import udemy.deepdiveusingjava.Employee;

public class TestEmployeeLinkedList {

    public static void main(String[] args) {

        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 2345);
        Employee mikeWilson = new Employee("Mike", "Wilson", 7865);

        EmployeeLinkedList linkedList = new EmployeeLinkedList();

        System.out.println(linkedList.isEmpty());

        linkedList.addFirst(janeJones);
        linkedList.addFirst(johnDoe);
        linkedList.addFirst(marySmith);
        linkedList.addFirst(mikeWilson);

        linkedList.printList();
        System.out.println(linkedList.getSize());

        linkedList.removeFirst();
        linkedList.printList();
        System.out.println(linkedList.getSize());
    }
}
