package Easy;

public class WhyStringsAreImmutable {
    public static void main(String[] args) {
        String h1 = "String";
        String h2 = new String("String");
        String h3 = "String";
        if(h1 == h2) System.out.println("Both are equal"); else System.out.println("Both are different");
        if(h1 == h3) System.out.println("Both are equal"); else System.out.println("Both are different");
    }
}
