package Solution;

public class Solution {
	public String countAndSay(int n) {
	       if(n == 1)
	             return "1";
	        String temp = countAndSay(n - 1) + "*";
	        char[]c = temp.toCharArray();
	        int count = 1;
	        String res = "";
	        for(int i = 0; i < c.length - 1; i++){
	            if(c[i] == c[i+1]){
	                count++;
	            }else{
	                res = res + count + c[i];
	                count = 1;
	            }
	        }
	        return res; 
	    }
}
