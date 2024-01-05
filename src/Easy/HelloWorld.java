package Easy;

public class HelloWorld {
    public static void main(String[] args) {
        int n = 10;
        for (int i = 1; i < n; i++) {
            for (int k = 1; k < n+1-i; k++) {
                System.out.print(" ");
            }
            for (int j = i; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }


        String str = "helloworld";
        for (int i = 0; i < str.length(); i++) {
            System.out.println("i = "+ str.charAt(i));
        }
    }
}
