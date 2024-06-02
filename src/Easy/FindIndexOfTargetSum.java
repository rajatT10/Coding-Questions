package Easy;

import java.util.Arrays;
import java.util.HashMap;

public class FindIndexOfTargetSum {

    public int[] twoSum(int[] nums, int target) {
        int[] index = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            int search = Math.abs(target - nums[i]);
            if(map.containsKey(search)){
                if(i!=map.get(Integer.valueOf(search)).intValue()){
                    index[0] = i;
                    index[1] = map.get(Integer.valueOf(search)).intValue();
                    break;
                }
            }
        }
        return index;
    }

    public static void main(String[] args) {
        FindIndexOfTargetSum fn = new FindIndexOfTargetSum();
        int[] result = fn.twoSum(new int[]{3,2,4},6);
        Arrays.stream(result).forEach(System.out::println);
    }
}
