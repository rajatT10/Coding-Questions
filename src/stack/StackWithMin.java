package stack;

import java.util.Stack;
public class StackWithMin extends Stack<NodeWithMin> {

    public void push(int item) {
        if(this.isEmpty()){
            super.push(new NodeWithMin(item,item));
        }
        else{
            super.push(new NodeWithMin(item,Math.min(item,this.peek().min
            )));
        }
    }

    public int min(){
        return this.peek().min;
    }

    public static void main(String[] args) {
        StackWithMin stack = new StackWithMin();
        stack.push(10);
        stack.push(50);
        stack.push(30);
        stack.push(5);
        stack.pop();
        System.out.println(stack.min());
    }
}
