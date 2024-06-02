package stack;

import java.util.ArrayList;
import java.util.Stack;

public class SetOfStacks{
    ArrayList<Stack<Integer>> setOfStack = new ArrayList<>();
    int capacity = 3;
    int currectIndex = 0;

    public void push(int item) {
        if(setOfStack.isEmpty()){
            Stack<Integer> newStack = new Stack<>();
            newStack.push(item);
            setOfStack.add(currectIndex,newStack);
        } else if(setOfStack.get(currectIndex).size() < capacity) {
            setOfStack.get(currectIndex).push(item);
        } else {
            currectIndex++;
            Stack<Integer> newStack = new Stack<>();
            newStack.push(item);
            setOfStack.add(currectIndex,newStack);
        }
    }

    public int pop(){
        if(setOfStack.get(currectIndex).isEmpty()){
            return -1;
        }
        int result = setOfStack.get(currectIndex).pop();
        if(setOfStack.get(currectIndex).isEmpty())
            currectIndex--;
        return result;
    }

    public int popAt(int index){
        if(!setOfStack.isEmpty() && !setOfStack.get(index).isEmpty()){
            return setOfStack.get(index).pop();
        }
        return -1;
    }

    public static void main(String[] args) {
        SetOfStacks setOfStacks = new SetOfStacks();
        setOfStacks.push(10);
        setOfStacks.push(20);
        setOfStacks.push(30);
        setOfStacks.push(40);
        setOfStacks.push(50);
        setOfStacks.push(60);
        setOfStacks.push(70);
        setOfStacks.push(80);
        setOfStacks.push(90);

        System.out.println(setOfStacks.popAt(1));
    }
}
