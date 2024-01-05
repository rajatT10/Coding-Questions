package useLambda;

import java.util.HashMap;

public class RomanToInteger {

	public static void main(String[] args) {
		System.out.println(RomanToInteger.romanToInt("III"));
	}

	public static int romanToInt(String s) {
		HashMap<Character, Integer> symbolVal = new HashMap<>();
		symbolVal.put('I', 1);
		symbolVal.put('V', 5);
		symbolVal.put('X', 10);
		symbolVal.put('L', 50);
		symbolVal.put('C', 100);
		symbolVal.put('D', 500);
		symbolVal.put('M', 1000);
		int result=symbolVal.get(s.charAt(s.length()-1));
	    for(int i=s.length()-1;i>0;i--)
	    {
	        if(symbolVal.get(s.charAt(i))<=symbolVal.get(s.charAt(i-1)))
	        {
	            result+=symbolVal.get(s.charAt(i-1));
	        }
	        else
	        {
	            result-=symbolVal.get(s.charAt(i-1));
	        }
	    }
		return result;
	}

}
