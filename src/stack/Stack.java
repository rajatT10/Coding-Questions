package stack;


/***
 * Stack as Linked List
 * */
public class Stack {

    Node head;
    Stack(){
        this.head = null;
    }

    public void push(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            newNode.next = null;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public int pop(){
        if(head==null){
            return 0;
        }
        Node deleted = head;
        head = head.next;
        return deleted.data;
    }

    public int min(){
        int MIN = Integer.MAX_VALUE;
        Node start = head;
        while(start!=null){
            if (start.data<MIN){
                MIN = start.data;
            }
            start = start.next;
        }
        return MIN;
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(50);
        stack.push(30);
        stack.push(20);
        stack.push(80);
        stack.push(60);
        System.out.println(stack.min());
    }
}
