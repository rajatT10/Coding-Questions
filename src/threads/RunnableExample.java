package threads;

public class RunnableExample implements Runnable{

    int number;

    RunnableExample(int number){
        this.number = number;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(this.number + "* " + i + " = " + this.number*i);
        }
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            RunnableExample example = new RunnableExample(i);
            Thread thread = new Thread(example);
            thread.start();
        }
    }
}
