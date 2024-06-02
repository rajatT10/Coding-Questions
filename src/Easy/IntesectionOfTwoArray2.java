package Easy;

import java.util.ArrayList;
import java.util.Arrays;

public class IntesectionOfTwoArray2 {

    public static void main(String[] args) {
        IntesectionOfTwoArray2 ar = new IntesectionOfTwoArray2();
        int[] result = ar.intersect(new int[]{4,9,5},new int[]{9,4,9,8,4});
        Arrays.stream(result).forEach(System.out::print);
    }

    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> result = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i =0;
        int j =0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]){
                i++;
            } else if(nums1[i]>nums2[j]){
                j++;
            } else if(nums1[i]==nums2[j]){
                result.add(nums1[i]);
                i++;j++;
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
