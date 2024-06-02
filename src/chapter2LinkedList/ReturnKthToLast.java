package chapter2LinkedList;

/**
 * Return the Kth to last element from the linked list
 **/

public class ReturnKthToLast {
    public static void main(String[] args) {
        int k = 2;
        int result = returnKthToLast_approach2(new Node().initiateLinked(), k);
        System.out.println(result);
    }

    private static int returnKthToLast_approach1(Node start, int k) {
        int count = 1;
        Node head = start;
        while (head.next != null) {
            count++;
            head = head.next;
        }
        for (int i = 1; i < count - k; i++) {
            if (start.next != null)
                start = start.next;
        }
        return start.data;
    }

    private static int returnKthToLast_approach2(Node start, int k) {
        Node p1 = start;
        Node p2 = start;
        for (int i = 0; i <= k; i++) {
            p2 = p2.next;
        }
        while (p2 != null) {
            p1 = p1.next;
            p2 = p2.next;
        }
        return p1.data;
    }

}
