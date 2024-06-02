package chapter2LinkedList;

public class Node {
    int data;
    Node next;

    public Node(int d) {
        this.data = d;
    }

    public Node(){}

    public void displayLinkedList() {
        Node n = this;
        while (n != null) {
            System.out.print(n.data + "->");
            n = n.next;
        }
    }

    public Node initiateLinked(){
        Node n = new Node(1);
        n.next = new Node(5);
        n.next.next = new Node(3);
        n.next.next.next = new Node(2);
        n.next.next.next.next = new Node(9);
        n.next.next.next.next.next = new Node(2);
        n.next.next.next.next.next.next = new Node(1);
        return n;
    }

    public Node initiateLinkedList_2(){
        Node n = new Node(1);
        n.next = new Node(2);
        n.next.next = new Node(3);
        n.next.next.next = new Node(4);
        n.next.next.next.next = new Node(5);
        n.next.next.next.next.next = new Node(6);
        n.next.next.next.next.next.next = new Node(7);
        n.next.next.next.next.next.next.next = new Node(8);
        n.next.next.next.next.next.next.next.next = new Node(9);
        n.next.next.next.next.next.next.next.next.next = new Node(10);
        return n;
    }

    public Node initiateLinkedList_3() {
        Node n = new Node(1);
        n.next = new Node(2);
        n.next.next = new Node(3);
        n.next.next.next = new Node(4);
        n.next.next.next.next = new Node(3);
        n.next.next.next.next.next = new Node(2);
        n.next.next.next.next.next.next = new Node(1);
        return n;
    }
}
