package Easy;

import java.util.List;

public class BinarySearch {
	
	public static void main(String[] args) {
		List<Integer> numbers = List.of(10,21,32,43,54,65,76,87,98,109);
		int search = 54;
		int index = search(search,numbers);
		System.out.println("Number is at index=" + index);
	}
	
	public static int search(int search, List<Integer> numbers) {
		int start = 0;
		int last = numbers.size();
		while(last>=start) {
			int mid = (start+last)/2;
			if(search == numbers.get(mid)) {
				return mid;
			}
			else if(search>numbers.get(mid)) {
				start = mid+1;
			}
			else if(search<numbers.get(mid)) {
				last = mid-1;
			}
		}
		return -1;
	}

}
