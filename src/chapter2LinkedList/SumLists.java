package chapter2LinkedList;

/**
 * Given two list 7->1->6 (617) and 5->9->2(295). The output should be the sum of data of two digits as a list in reverse
 *
 * 617+295 = 912. Output = 2->1->9
 * **/

public class SumLists {

    public static void main(String[] args) {
        Node n1 = new Node(7);
        n1.next = new Node(1);
        n1.next.next = new Node(6);

        Node n2 = new Node(5);
        n2.next = new Node(9);
        n2.next.next = new Node(2);

        Node result = sumLists(n1,n2);
        result.displayLinkedList();
    }

    private static Node sumLists(Node n1, Node n2){
        int sum1 = generateNumberFromList(n1);
        int sum2 = generateNumberFromList(n2);
        return generateListFromNumber(sum1+sum2);
    }

    private static Node generateListFromNumber(int sum) {
        Node node = null;
        Node head = null;
        while(sum>=1){
            int digit = sum%10;
            if(head==null){
                Node n1 = new Node(digit);
                node = n1;
                head = node;
            }
            else {
                head.next = new Node(digit);
                head = head.next;
            }
            sum = sum/10;
        }
        return node;
    }

    private static int generateNumberFromList(Node n1) {
        int sum = 0;
        int i =0;
        while(n1!=null){
            sum= (int) (sum+(n1.data)*(Math.pow(10,i)));
            n1 = n1.next;
            i++;
        }
        return sum;
    }
}

//7->1->6
