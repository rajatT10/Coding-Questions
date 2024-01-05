package Easy;

import java.util.List;

public class DeletingArrayListElementUsingForLoop {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 0);
        for (int i = 0; i < list.size(); i++) {
            list.remove(i);
        }
    }
}
