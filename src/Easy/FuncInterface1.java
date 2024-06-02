package Easy;

@FunctionalInterface
public interface FuncInterface1 {
    void print(String message);
}

class ImplementAboveClass {
    public static void main(String[] args) {
        FuncInterface1 f = (v)->System.out.println(v);
        f.print("Hello");
    }
}