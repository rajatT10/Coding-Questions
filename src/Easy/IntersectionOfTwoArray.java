package Easy;

import java.util.Arrays;
import java.util.HashSet;

public class IntersectionOfTwoArray {

    public int[] intersection(int[] nums1,int[] nums2){
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();
        Arrays.stream(nums1).forEach(i->set1.add(i));
        Arrays.stream(nums2).forEach(j-> {
            if(set1.contains(Integer.valueOf(j))){
                result.add(j);
            }
        });
        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        IntersectionOfTwoArray single = new IntersectionOfTwoArray();
        int[] result = single.intersection(new int[]{4,7,9,7,6,7}, new int[]{5,0,0,6,1,6,2,2,4});
        Arrays.stream(result).forEach(System.out::println);
    }
}
