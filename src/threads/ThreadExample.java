package threads;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadExample {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        List<Integer> listOfNum = List.of(1, 2, 3, 4, 5 ,6, 7, 8, 9, 10);
        for(Integer num : listOfNum) {
            executorService.submit(()-> {
                displayTable(num);
            });
        }
    }

    public static void displayTable(Integer num){
        System.out.println("Table of "+ num);
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + "* " + i + " = " + num*i);
        }
    }
}
