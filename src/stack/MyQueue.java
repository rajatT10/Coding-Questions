package stack;

import java.util.Stack;

public class MyQueue {

    Stack<Integer> s1,s2;

    MyQueue(){
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    public void enqueue(int item){
        transfer();
        s1.push(item);
    }

    public int dequeue(){
        transfer();
        if(!s2.isEmpty()){
            return s2.pop();
        }
        return -1;
    }

    public void transfer(){
        if(s2.isEmpty()){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
        }
    }

    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(60);
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }

}
