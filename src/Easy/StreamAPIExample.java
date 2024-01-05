package Easy;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamAPIExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(5);
        list.add(61);

        List<Integer> result = list.stream().filter(i->i>3).collect(Collectors.toList());


        Consumer<Integer> action = (n)->{
            System.out.println("Result = "+ n);
        };


        List<Integer> resultDistinct = list.stream().distinct().collect(Collectors.toList());
        resultDistinct.stream().forEach(action);

        //list.parallelStream().map(n->n*2).forEach(System.out::println);
        //Optional<Integer> result = list.stream().reduce((x, y)->x+y);
        //Optional<Integer> result2 = list.parallelStream().filter((i)-> i > 2).reduce((x,y)->x+y);
        //result2.ifPresent(action);
        //result.ifPresent(action);

        Predicate<Integer> predicate = (i)->{
          return i > 10;
        };

        List<Integer> resultList = list.stream().filter(predicate).collect(Collectors.toList());

        resultList.forEach(action);

        Queue<Integer> enq = new PriorityQueue<>();
        enq.add(1);
        enq.add(17000);
        enq.add(112);
        enq.add(1011);


        System.out.println("enq = " + enq);


    }
}
