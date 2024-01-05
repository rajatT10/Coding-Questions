package BinaryTree;

import java.util.List;
import java.util.Stack;

public class QueueUsingTwoStacks {

    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        List<Integer> insertData = List.of(2,45,6,71,12,21,100);

        insertData.forEach(i->{
            insertIntoQueue(i,stack1,stack2);
        });

        while(!stack1.isEmpty()){
            System.out.println("stack1.pop() = " + stack1.pop());
        }
    }

    private static void insertIntoQueue(int data,Stack<Integer> stack1,Stack<Integer> stack2){
        int stack1Size  = stack1.size();
        for (int i = 0; i < stack1Size; i++) {
            stack2.push(stack1.pop());
        }
        stack1.push(data);
        int stack2Size = stack2.size();
        for(int j = 0; j < stack2Size; j++){
            stack1.push(stack2.pop());
        }

    }
}
