package chapter2LinkedList;

import java.util.HashSet;
import java.util.Stack;

public class PalindromeLinkedList {

    public static void main(String[] args) {
        Node n = new Node().initiateLinkedList_3();
        boolean result = checkPalindrome_approach2(n);
        System.out.println(result);
    }

    private static boolean checkPalindrome(Node head) {
        Node start = head;
        Node next = null;
        while (start != null) {
            Node newNode = new Node(start.data);
            newNode.next = next;
            next = newNode;
            start = start.next;
        }
        while (next != null && head != null) {
            if (next.data != head.data) {
                return false;
            }
            next = next.next;
            head = head.next;
        }
        return true;
    }

    private static boolean checkPalindrome_approach2(Node head) {
        Node p1 = head;
        Node fast = head;
        Stack<Integer> firstHalf = new Stack<>();
        while (fast!=null && fast.next != null) {
            firstHalf.push(p1.data);
            p1 = p1.next;
            fast = fast.next.next;
        }
        //If linked list has odd number of elements
        if(fast!=null){
            p1 = p1.next;
        }
        while (p1!= null) {
            if (firstHalf.pop()!=p1.data) {
                return false;
            }
            p1 = p1.next;
        }
        return true;
    }


}
