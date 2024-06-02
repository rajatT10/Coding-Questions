package Easy;

import java.util.HashMap;

public class FirstUniqueCharacter {

    public int firstUniqChar(String s) {
        HashMap<Character,Integer> charOcc = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            Character chara = Character.valueOf(c);
            if(charOcc.containsKey(chara)){
                int occ = charOcc.get(chara).intValue();
                charOcc.put(chara,occ);
            } else {
                charOcc.put(s.charAt(i),1);
            }
        }
        int index = -1;
        for(int i=0;i<s.length();i++){
            if(charOcc.get(Character.valueOf(s.charAt(i))).intValue()==1){
                index = i;
                break;
            }
        }
        return index;
    }
}
