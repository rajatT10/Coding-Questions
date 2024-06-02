package Easy;

import java.util.HashMap;

public class IsomorphicStrings {

    public boolean isIsomorphic(String s, String t){
        HashMap<Character,Character> map = new HashMap<>();
        HashMap<Character,Character> reverseMap = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(!map.containsKey(s.charAt(i)) && !reverseMap.containsKey(t.charAt(i))){
                map.put(s.charAt(i),t.charAt(i));
                reverseMap.put(t.charAt(i),s.charAt(i));
            } else if(!(map.containsKey(s.charAt(i)) && reverseMap.containsKey(t.charAt(i)))){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        IsomorphicStrings is = new IsomorphicStrings();
        System.out.println(is.isIsomorphic("foo","bar"));
    }
}
