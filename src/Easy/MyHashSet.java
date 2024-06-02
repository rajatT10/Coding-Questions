package Easy;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Objects;

class MyHashSet {

    LinkedList<Integer>[] hashSet;
    private static final int INITIAL_CAPACITY = 100;

    public MyHashSet() {
        this.hashSet = new LinkedList[INITIAL_CAPACITY];
    }

    public int hashKey(int key){
        return (key%INITIAL_CAPACITY);
    }

    public void add(int key) {
        int index = hashKey(key);
        if(!contains(key)){
            if(this.hashSet[index]!=null){
             this.hashSet[index].add(key);
            } else {
                LinkedList<Integer> newList = new LinkedList<>();
                newList.add(key);
                this.hashSet[index] = newList;
            }
        }
    }

    public void remove(int key) {
        int index = hashKey(key);
        if(contains(key)){
            this.hashSet[index].remove(Integer.valueOf(key));
        }
    }

    public boolean contains(int key) {
        int index = hashKey(key);
        return (this.hashSet[index]!=null && this.hashSet[index].contains(key));
    }

    public void display(){
        Arrays.stream(this.hashSet).filter(Objects::nonNull).forEach(System.out::print);
    }

    public static void main(String[] args) {
        MyHashSet myHashSet = new MyHashSet();
        myHashSet.add(1231);myHashSet.add(2334);myHashSet.add(331);myHashSet.add(2331);myHashSet.add(3331);myHashSet.contains(321);myHashSet.contains(3423);myHashSet.add(3422);myHashSet.contains(4322);myHashSet.remove(3242);myHashSet.contains(1231);
        myHashSet.display();
    }
}