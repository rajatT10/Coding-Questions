package chapter2LinkedList;


/**
 * Write an algorithm to delete middle node from a linked list given head.
 * **/
public class DeleteMiddleNode {
    public static void main(String[] args) {
        Node n = new Node().initiateLinkedList_2();
        removeMiddleNode(n);
        n.displayLinkedList();
    }

    //O(n) time complexity where n is the number of element
    private static void removeMiddleNode(Node start){
        Node p1 = start;
        int count = 0;
        while(p1!=null){
            count++;
            p1 = p1.next;
        }
        for (int i = 0; i < (count/2)-2; i++) {
            start = start.next;
        }
        start.next = start.next.next;
    }
}
