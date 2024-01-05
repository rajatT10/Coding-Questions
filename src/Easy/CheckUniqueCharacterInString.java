package Easy;

public class CheckUniqueCharacterInString {

    // Driver method
    public static void main(String args[])
    {
        String str = "ishan!&#W(*";
        boolean result = checkIfUnique(str);
        System.out.println(result);
    }

    private static boolean checkIfUnique(String str){
        if(str.length() > 128) return false;
        boolean flag[]= new boolean[128];
        for (int i = 0; i < str.length(); i++) {
            int value = str.charAt(i);
            if(flag[value]){
                return false;
            }
            flag[value] = true;
        }
        return true;
    }
}
