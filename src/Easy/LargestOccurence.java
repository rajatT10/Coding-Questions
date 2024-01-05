package Easy;

import java.util.Collections;
import java.util.HashMap;

public class LargestOccurence {

    public static void main(String[] args) {
        String str = "HelloWorld";
        str = str.toLowerCase();
        HashMap<Character,Integer> map = new HashMap<>();

        char largest = 0;
        Integer max = -1;

        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            if(map.containsKey(str.charAt(i))){
                count = map.get(str.charAt(i))+1;
                map.put(str.charAt(i),count);
            } else map.put(str.charAt(i),1);

            if(count>max){
                max = count;
                largest = str.charAt(i);
            }
        }
        System.out.println("max = "+largest + max);
    }
}
