package Easy;

import java.util.Arrays;

public class PalindromePermutation {
    public static void main(String[] args) {
        String str = "tact coa";
        boolean result = palindromPermutation(str);
        System.out.println(result);
    }

    private static boolean palindromPermutation(String str) {
        if (str.isEmpty()) return false;
        String inputString = str.replaceAll("\\s", "");
        char[] charArr = inputString.toCharArray();
        Arrays.sort(charArr);
        int i = 0;
        int flag = 0;
        while (i < charArr.length) {
            if (flag > 1) {
                break;
            } else if (charArr[i] == charArr[i + 1]) {
                i += 2;
            } else {
                flag++;
                i += 1;
            }
        }
        if (flag > 1) {
            return false;
        }
        return true;
    }
}
