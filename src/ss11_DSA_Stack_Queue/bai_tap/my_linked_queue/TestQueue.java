package ss11_DSA_Stack_Queue.bai_tap.my_linked_queue;

public class TestQueue {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enQueue(10);
        queue.enQueue(20);
        queue.enQueue(30);
        queue.displayQueue();
        System.out.println(queue.deQueue());
        queue.displayQueue();
    }
}
