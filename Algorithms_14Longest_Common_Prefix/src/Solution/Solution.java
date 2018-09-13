package Solution;

import java.util.Arrays;

public class Solution {
	public String longestCommonPrefix(String[] strs) {
		if(strs == null || strs.length == 0) return "";
        String str = strs[0];
        for(int i = 1; i < strs.length; i++){
        	while(strs[i].indexOf(str) != 0){
        		str = str.substring(0,str.length() -1);
        		if(str.isEmpty())
        			return "";
        	}
        }
		return str;
		
		/*if(strs.length == 0 || strs == null) return "";
		for(int i = 0; i < strs.length; i++){
			char c = strs[0].charAt(i);
			for(int j = 1; j < strs.length; j++){
				if(i == strs[j].length() || strs[j].charAt(i) != c) 
					return strs[0].substring(0,i);
			}
		}
		return strs[0];*/
		
		/*if(strs == null || strs.length == 0) return "";
		int n = strs.length;
		Arrays.sort(strs);
		StringBuffer sb = new StringBuffer();
		String first = strs[0];
		String end = strs[n-1];
		int min = Math.min(first.length(),end.length());
		for(int i = 0; i < min; i++){
			if(first.charAt(i) == end.charAt(i)){
				sb.append(first.charAt(i));
			}
			else
				break;
		}
		return sb.toString();*/
    }
	public static void main(String[] args) {
		Solution so = new Solution();
		String[] str = {"leet","lett","lett"};
		System.out.println(so.longestCommonPrefix(str));
	}
}
