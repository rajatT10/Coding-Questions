package Easy;

import java.util.HashSet;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        HashSet<Integer> uniq = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(!uniq.add(nums[i])){
                uniq.remove(Integer.valueOf(nums[i]));
            }
        }
        return uniq.stream().findFirst().get();
    }

    public static void main(String[] args) {
        SingleNumber single = new SingleNumber();
        int result = single.singleNumber(new int[]{2,2,1});
        System.out.println(result);
    }
}
