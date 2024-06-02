package Easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {

    public static void main(String[] args) {
        String s = "abcabcbb";
        if (s == null || s.length() == 0)
            System.out.println(0);

        HashMap<Character, Integer> charIndexMap = new HashMap<>();
        int maxLength = 0;
        int start = 0;

        for (int end = 0; end < s.length(); end++) {
            char currentChar = s.charAt(end);
            if (charIndexMap.containsKey(currentChar)) {
                // If the current character is already in the hashmap,
                // move the start pointer to the next position after the last occurrence of the character.
                start = Math.max(start, charIndexMap.get(currentChar) + 1);
            }
            charIndexMap.put(currentChar, end);
            maxLength = Math.max(maxLength, end - start + 1);
        }
        System.out.println(maxLength);
    }
}
