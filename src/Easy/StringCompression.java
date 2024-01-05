package Easy;

import java.util.HashMap;
import java.util.Map;

public class StringCompression {

    /**
     * Check if the input string can be compressed to the number of occurrence of the character with the character. If
     * the compressed string is smaller than the original string then return compressed else original
     *
     * For example input is "aabcccccaaa" then output would be a2b1c5a3;
     * **/
    public static void main(String[] args) {
        String input = "aabcccccaaaaaaaaaaa";
        String result = checkCompression(input);
        System.out.println(result);
    }

    private static String checkCompression(String input) {
        char letter;
        int occ=0;
        StringBuilder compressedString = new StringBuilder();
        if(!input.isEmpty()){
            letter = input.charAt(0);
        } else return null;
        for(char c:input.toCharArray()){
            if(c==letter){
                occ++;
            } else{
                compressedString.append(letter).append(String.valueOf(occ));
                letter = c;
                occ=1;
            }
        }
        compressedString.append(letter).append(String.valueOf(occ));
        return input.length()>compressedString.length()? compressedString.toString() : input;
    }

    private static String checkCompression_approach2(String input){
        return null;
    }

}
