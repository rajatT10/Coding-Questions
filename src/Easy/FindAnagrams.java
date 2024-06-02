package Easy;

import java.util.*;
import java.util.stream.Collectors;

public class FindAnagrams {

    public static void main(String[] args) {
        FindAnagrams fa = new FindAnagrams();
        //String[] input = new String[]{"eat","tea","tan","ate","nat","bat"};
        String[] input = new String[]{""};
        List<List<String>> result = fa.groupAnagrams(input);
        for(List<String> s : result){
            for (String str: s){
                System.out.print(str+ " ");
            }
        }
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> anagram = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            String sort = sortString(strs[i]);
                List<String> list = anagram.getOrDefault(sort,new LinkedList<>());
                list.add(strs[i]);
                anagram.put(sort,list);
        }
        List<List<String>> result = new LinkedList<>();
        return anagram.entrySet().stream().map(Map.Entry::getValue).collect(Collectors.toList());
    }

    private String sortString(String str) {
        char[] sortedString = str.toCharArray();
        Arrays.sort(sortedString);
        return Arrays.toString(sortedString);
    }
}
