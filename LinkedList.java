import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

public class Main {

  public static void main(String[] args) {
    LinkedList ll = new LinkedList();
    ll.insert(2);
    ll.insert(3);
    ll.insert(4);
    ll.insert(5);
    ll.show();
  }
}

class Node {
  int data;
  Node next;

  Node(int d) {
    data = d;
  }
}

class LinkedList {
  Node head;

  void insert(int data) {
    Node node = new Node(data);

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

  void show() {
    Node node = head;
    while (node.next != null) {
      System.out.println(node.data);
      node = node.next;
    }
    System.out.println(node.data);
  }
}
