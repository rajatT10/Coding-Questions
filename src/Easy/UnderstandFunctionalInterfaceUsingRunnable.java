package Easy;

public class UnderstandFunctionalInterfaceUsingRunnable {

    public static void main(String[] args) {


        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("This is example of anonymous class");

            }
        };

        Runnable runnable1 = ()-> System.out.println("This is lambda expressions");

        /* Traditional Method */
        Thread thread1 = new Thread(runnable);
        thread1.start();

        //Lambda Expressions
        Thread thread2 = new Thread(runnable1);
        thread2.start();


    }
}