package udemy.dsguy.structures.queues;

public class TestQueueLinkedList {

    public static void main(String[] args) {
        System.out.println("Creating a queue");
        QueueLinkedList<Integer> queue = new QueueLinkedList<>();

        System.out.println("Enqueuing 6 values into queue");
        for(int i=1 ; i<=6; i++)
        {
            queue.enQueue(i*10);
        }

        System.out.println(queue.peek());
        System.out.println("\nThe size of the queue is: " + queue.size() + "\n");
        System.out.println(queue.deQueue());
        System.out.println("\nThe size of the queue is: " + queue.size() + "\n");

        /*System.out.println("\nDequeueing 6 values into queue");
        for(int i=0; i<6; i++)
        {
            System.out.println(queue.deQueue());
        }*/
    }
}
