package useLambda;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParanthesis {
	
	public static void main(String[] args) {
		String s = "()";
		System.out.println(isValid(s));
	}
	
	 public static boolean isValid(String s) {
	        if(s.length()%2!=0){
	            return false;
	        } 
	        Map<Character,Character> paraMap = new HashMap<>();
	        paraMap.put('(',')');
	        paraMap.put('{','}');
	        paraMap.put('[',']');
	        Stack<Character> para = new Stack<Character>();
	        for(int i = 0;i<s.length();i++){
	        	if(para.isEmpty() && !paraMap.containsKey(s.charAt(i))) {
	        		return false;
	        	}
	        	else if(paraMap.containsKey(s.charAt(i))){
	                para.push(paraMap.get(s.charAt(i)));
	            } else if(!para.isEmpty() && s.charAt(i)!=para.pop()){
	                return false;
	            }
	        }
	        if(para.isEmpty()) return true;
	        return false;
	    }

}
