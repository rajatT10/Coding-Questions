package Easy;

public class Urlify {

    public static void main(String[] args) {
        String str = "Mr John Smith    ";
        str = str.strip();
        String result = urlify(str);
        System.out.println(result);
    }

    private static String urlify(String str){
        str = str.replaceAll(" ","%20");
        return str;
    }
}
