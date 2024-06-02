package Easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MinimumIndexSumOfTwoStrings {

    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String,Integer> indexMap = new HashMap<>();
        HashMap<String,Integer> finder = new HashMap<>();
        for(int i=0;i<list1.length;i++){
            indexMap.put(list1[i],i);
        }
        int MIN = Integer.MAX_VALUE;
        for(int j=0;j<list2.length;j++){
            if(indexMap.containsKey(list2[j])){
                int sum = indexMap.get(list2[j])+j;
                finder.put(list2[j],sum);
                if(sum<=MIN)
                    MIN = sum;
            }
        }
        int finalMIN = MIN;
        List<String> result = finder.entrySet().stream()
                .filter(i->i.getValue()== finalMIN).map(Map.Entry::getKey).collect(Collectors.toList());
        String[] res = new String[result.size()];
        return result.toArray(res);
    }

    public static void main(String[] args) {

    }
}
