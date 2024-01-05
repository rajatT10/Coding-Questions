package useLambda;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		String result = longestCommonPrefix(new String[] { "cir", "car"});
		System.out.println(result);
	}

	private static String longestCommonPrefix(String[] strs) {
		String compareStr = findLargestString(strs);
		for(int i=0;i<strs.length;i++) {
			compareStr = checkCommon(strs[i],compareStr);
		}
		return compareStr;
	}
	
	private static String checkCommon(String string, String compareStr) {
		String common = "";
		int length = (string.length() > compareStr.length()) ? compareStr.length() : string.length();
		for(int j =0;j<length;j++) {
			if(compareStr.charAt(j)==string.charAt(j)) {
				common+=string.charAt(j);
			} else return common;
		}
		return common;
	}

	private static String findLargestString(String[] strs) {
		int size = -1;
		String str = "";
		for(int i=0;i<strs.length;i++) {
			if(strs[i].length()>size) {
				size = strs[i].length();
				str = strs[i];
			}
		}
		return str;
	}

}
