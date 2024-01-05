package Easy;

import java.util.Scanner;
import java.util.Stack;

public class MaximumAtAnyPointStack {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int max = Integer.MIN_VALUE;
        Stack<Integer> stack = new Stack<>();
        int query, number;
        for (int i = 0; i < N; i++) {
            query = sc.nextInt();
            if (query == 1) {
                number = sc.nextInt();
                if (number > max) {
                    max = number;
                }
                stack.push(number);
            } else if (query == 2 && !stack.empty()) {
                stack.pop();
                max = stack.stream().max((Integer x, Integer y) -> {
                    return x - y;
                }).get();
            } else if (query == 3 && !stack.empty()) {
                System.out.println(max);
            }
        }
    }
}
