import java.util.*;

public class Hello {
    /**
     * key, value
     *
     * @param args
     */

    public static void main(String[] args) {
        Hello obj = new Hello();
        obj.insert(2);
        obj.insert(3);
        obj.insert(4);
        obj.traverse();
    }

    Node head;

    void insert(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
    }

    void traverse() {
        Node node = head;
        while (node.next != null) {
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }
}

class Node {
    int data;
    Node next;

    public Node(int val) {
        this.data = val;
    }
}
