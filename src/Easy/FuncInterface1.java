package Easy;

@FunctionalInterface
public interface FuncInterface1 {
    void print();
}

class ImplementAboveClass {
    public static void main(String[] args) {
        FuncInterface1 f = ()->System.out.println("Hello");
        f.print();
    }
}