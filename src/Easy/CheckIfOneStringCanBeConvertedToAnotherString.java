package Easy;

public class CheckIfOneStringCanBeConvertedToAnotherString {
    public static void main(String[] args) {
        String str1 = "pale";
        String str2 = "pkle";
        boolean result = checkEdit(str1,str2);
        System.out.println(result);
    }

    private static boolean checkEdit(String str1,String str2){
        if(str1.isEmpty() && str2.length()==1) return true;
        int diffChar = Math.abs(str2.length()-str1.length());
        if(diffChar>1) return false;
        int size = str1.length() > str2.length() ? str2.length() : str1.length();
        for (int i = 0; i < size; i++) {
            if(diffChar>1) return false;
            if(str1.charAt(i)!=str2.charAt(i)){
                diffChar++;
            }
        }
        return true;
    }
}
