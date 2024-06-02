package chapter2LinkedList;

import java.util.HashSet;
import java.util.Hashtable;

public class RemoveDuplicates {

    public static void main(String[] args) {
        Node head = removeDuplicate(new Node().initiateLinked());
        Node head2 = removeDuplicate_approach2(new Node().initiateLinked());
        head.displayLinkedList();
        //head2.displayLinkedList();
    }


    private static Node removeDuplicate(Node start) {
        Node head = start;
        HashSet<Integer> occ = new HashSet<>();
        occ.add(head.data);
        while (head.next != null) {
            if (occ.contains(head.next.data)) {
                head.next = head.next.next;
            } else {
                occ.add(head.next.data);
                head = head.next;
            }
        }
        return start;
    }

    private static Node removeDuplicate_approach2(Node start) {
        Node p1 = start;

        while (p1.next != null) {
            Node p2 = p1;
            while (p2 != null && p2.next != null) {
                if (p1.data == p2.next.data) {
                    p2.next = p2.next.next;
                }
                p2 = p2.next;
            }
            p1 = p1.next;
        }
        return start;
    }
}
