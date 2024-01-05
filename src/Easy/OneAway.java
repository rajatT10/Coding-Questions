package Easy;

public class OneAway {

    /**
     * Check if the two string can be made similar with only one/zero adjustment , be it insert , delete or replace anywhere
     * **/

    public static void main(String[] args) {
        String[] usecase1 = {"pale","ple"};
        String[] usecase2 = {"pale","bala"};
        String[] usecase3 = {"ple","pale"};

        boolean result = oneaway(usecase3);
        System.out.println(result);
    }

    public static boolean oneaway(String[] usecase){
        String str1 = usecase[0];
        String str2 = usecase[1];

        if(str1.length() > str2.length()){
            return oneReduce(str1,str2);
        }
        else if(str1.length() < str2.length()){
            return oneInsert(str1,str2);
        } else {
            return oneReplace(str1,str2);
        }
    }

    private static boolean oneReplace(String str1, String str2) {
        int flag = 0;
        for (int j = 0; j < str1.length(); j++) {
            if(str1.charAt(j)!=str2.charAt(j)){
                flag++;
            }
        }
        return flag < 2;
    }

    private static boolean oneReduce(String str1, String str2) {
        int flag = 0;
        int i = 0;
        for (int j = 0; j < str1.length(); j++) {
            if(str1.charAt(j)!=str2.charAt(i)){
                flag++;
            } else i++;
        }
        return flag < 2;
    }

    private static boolean oneInsert(String str1, String str2){
        int flag = 0;
        int i = 0;
        for (int j = 0; j < str2.length(); j++) {
            if(str1.charAt(i)!=str2.charAt(j)){
                flag++;
            }else i++;
        }
        return flag < 2;
    }

}
