package Easy;

public class IsStringRotated {

    /**
     * Given two Strings s1 and s2 , check if s2 is rotated string of s1
     * **/

    public static void main(String[] args) {
        String original = "RajatTiwari";
        String rotated = "jatTiwariRa";
        boolean result = isRotated(original,rotated);
        System.out.println(result);
    }

    private static boolean isRotated(String original,String rotated){
        StringBuilder input = new StringBuilder();
        input.append(rotated).append(rotated); //atTiwariRajatTiwariRaj
        return input.toString().contains(original);
    }
}
