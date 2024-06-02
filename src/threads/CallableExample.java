package threads;

import java.util.List;
import java.util.concurrent.*;

public class CallableExample {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        List<Integer> listOfNum = List.of(1, 2, 3, 4, 5 ,6, 7, 8, 9, 10);
        for (Integer i: listOfNum) {
            executorService.submit(()->{
                for (int j = 1; j <= 10; j++) {
                    System.out.println(i + "* " + j + " = " + i*j);
                }
            });
        }
        executorService.shutdown();
    }
}
