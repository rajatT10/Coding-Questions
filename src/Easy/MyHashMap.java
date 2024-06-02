package Easy;

import java.util.LinkedList;

public class MyHashMap {

    LinkedList<KeyValue>[] hashMap;
    private static final int INITIAL_CAPACITY = 100;

    MyHashMap(){
        this.hashMap = new LinkedList[INITIAL_CAPACITY];
    }

    public synchronized int hashKey(int key){
        return (key%INITIAL_CAPACITY);
    }

    public void put(int key,int value){
        int index = hashKey(key);
        if(this.hashMap[index]!=null && !this.hashMap[index].isEmpty()){
            if(get(key)==-1){
                this.hashMap[index].add(new KeyValue(key,value));
            } else {
                this.hashMap[index].forEach(i->{
                    if(i.getKey() == key){
                        i.setValue(value);
                    }
                });
            }
        } else {
            KeyValue kv = new KeyValue(key,value);
            LinkedList<KeyValue> newList = new LinkedList<>();
            newList.add(kv);
            this.hashMap[index] = newList;
        }
    }

    public int get(int key){
        int index = hashKey(key);
        if(this.hashMap[index]!=null && !this.hashMap[index].isEmpty()){
            for(KeyValue k: this.hashMap[index]){
                if(k.getKey()==key)
                    return k.getValue();
            }
        }
        return -1;
    }

    public void remove(int key){
        int index = hashKey(key);
        if(this.hashMap[index]!=null && !this.hashMap[index].isEmpty()){
            this.hashMap[index].forEach(k->{
                if(k.getKey() == key){
                    this.hashMap[index].remove(k);
                }
            });
        }
    }

    public static void main(String[] args) {
        MyHashMap hashMap = new MyHashMap();
        hashMap.put(5,5);
        System.out.println(hashMap.get(5));
        hashMap.remove(94);
        System.out.println(hashMap.get(5));
        hashMap.put(5,75);
        System.out.println(hashMap.get(5));
        hashMap.put(5,115);
        System.out.println(hashMap.get(5));
        hashMap.put(105,101);
        hashMap.remove(205);
        hashMap.put(305,101);
        hashMap.remove(105);
        hashMap.put(505,101);

        System.out.println(hashMap.get(105));
    }
}

class KeyValue {
    private int key;
    private int value;

    KeyValue(int key,int value){
        this.key = key;
        this.value = value;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}


