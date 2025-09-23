package ss11_DSA_Stack_Queue.bai_tap.my_linked_queue;

public class Node {
    int data;
    Node link;

    public Node(int data) {
        this.data = data;
        this.link = null;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                '}';
    }
}
