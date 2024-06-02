package stack;

import java.util.Stack;

public class SortStack {

    private Stack<Integer> sort(Stack<Integer> stack) {
        if(stack.isEmpty())
            return new Stack<>();
        Stack<Integer> temp = new Stack<>();
        while(!stack.isEmpty()){
            int t = stack.pop();
            while(!temp.isEmpty() && temp.peek() < t){
                stack.push(temp.pop());
            }
            temp.push(t);
        }
        return temp;
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(4);
        stack.push(5);
        stack.push(2);
        stack.push(1);
        stack.push(9);
        stack.push(0);
        SortStack sortStack = new SortStack();
        Stack<Integer> sorted = sortStack.sort(stack);
        System.out.println(sorted.pop());
        System.out.println(sorted.pop());
        System.out.println(sorted.pop());
        System.out.println(sorted.pop());
        System.out.println(sorted.pop());
        System.out.println(sorted.pop());
    }

}
