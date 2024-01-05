package Easy;

import java.util.HashMap;
import java.util.List;
import java.util.function.Consumer;

public class ExampleForEachLoop {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9,0);

        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(1,1);
        map.put(2,2);

        map.forEach((key,value)->{
            System.out.println("key = " + key);
        });

        list.forEach((i)->{
            System.out.println(i);
        });

        MyConsumer action = new MyConsumer();
        list.forEach(action);
    }
}

class MyConsumer implements Consumer<Integer> {
    @Override
    public void accept(Integer integer) {
        System.out.println(integer);
    }
};
