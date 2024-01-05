package Easy;

import java.util.List;

public class PairingExample {
    public static void main(String[] args) {
        List<Integer> list1 = List.of(5, 2, 3, 1, 4);
        List<Integer> list2 = List.of(2, 1, 3, 4, 3);

        int sumShouldBe = 8;
        int noOfPairs = 0;

        for (Integer i : list1) {
            int diff = sumShouldBe - i;
            for (int j = 0; j < list2.size(); j++) {
                if (diff == list2.get(j)) {
                    noOfPairs++;
                    System.out.println("[" + i + "," + list2.get(j) + "]");
                }
            }
        }
        System.out.println("noOfPairs = " + noOfPairs);
    }
}
