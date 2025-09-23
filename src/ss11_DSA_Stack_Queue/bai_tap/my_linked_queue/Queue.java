package ss11_DSA_Stack_Queue.bai_tap.my_linked_queue;

public class Queue {
    private Node front;
    private Node rear;

    public Queue() {
        rear = null;
        front = null;
    }

    public void enQueue(int data) {
        Node temp = new Node(data);
        if (rear == null) {
            front = rear = temp;
            rear.link = front;
            return;
        }
        rear.link = temp;
        rear = temp;
        rear.link = front;

    }

    public Node deQueue() {
        Node temp = null;
        if (front == null) {
            return temp;
        }
        if (front.equals(rear)) {
            temp = front;
            front = rear = null;
        } else {
            temp = front;
            front = front.link;
            rear.link = front;
        }
        return temp;
    }

    public void displayQueue() {
        if (front == null) {
            System.out.println("Queue is empty");
            return;
        }
        Node temp = front;
        do {
            System.out.print(temp.data + " ");
            temp = temp.link;
        } while (temp != front);
        System.out.println();
    }
}
