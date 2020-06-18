package udemy.dsguy.structures.linkedlist;

public class TestSingleLinkedList {

    public static void main(String[] args) {
        SingleLinkedList<String> linkedList = new SingleLinkedList<>();

        linkedList.add("C");
        linkedList.add("Python");
        linkedList.add("XML");
        linkedList.add("HTML");
        linkedList.traverseLinkedList();
        linkedList.addFirst("Java");
        linkedList.addLast("Programming");
        linkedList.traverseLinkedList();
        linkedList.insertInLinkedList("PHP", 2);
        linkedList.traverseLinkedList();
        System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::");
        linkedList.deleteFirst();
        linkedList.traverseLinkedList();
        linkedList.deleteLast();
        linkedList.traverseLinkedList();
    }
}
