package Easy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(5);
		list.add(9);
		list.add(2);
		list.add(7);
		list.add(3);

		list.sort(new AscOrder());

		System.out.println("list2 = " + list);

		list.sort((a, b) -> {
			return a - b;
		});

	}
}

class AscOrder implements Comparator<Integer> {
	@Override
	public int compare(Integer o1, Integer o2) {
		return o1 - o2;
	}
}
