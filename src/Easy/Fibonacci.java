package Easy;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the range=");
        int range = scanner.nextInt();
        int i = 0;
        int sum = 0;
        System.out.print(a+", ");
        System.out.print(b+", ");
        while(i < range){
            sum = a+b;
            System.out.print(sum+", ");
            a = b;
            b = sum;
            i++;
        }

    }
}
