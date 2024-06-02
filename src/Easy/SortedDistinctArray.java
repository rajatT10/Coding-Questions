package Easy;

import java.util.*;

public class SortedDistinctArray {
    public static void main(String[] args) {
        List<Integer> result = new SortedDistinctArray().sortedDistinctArray(new int[]{400,300,200,700,8,200,3,1});
        result.forEach(System.out::print);
    }

    private List<Integer> res;
    public List<Integer> sortedDistinctArray(int[] nums){
        List<Integer> result=new ArrayList<Integer>();
        int count[]=new int[nums.length+1];
        for(int i:nums)
            count[i]++;
        for(int i=1;i<=nums.length;i++)
        {
            if(Objects.nonNull(i))
                result.add(i);
        }
        return result;
    }
}
