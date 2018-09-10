package Solution;

public class Solution {
	public boolean isPalindrome(int x) {
        if(x < 0 || (x != 0 && x%10 == 0)){
            return false;
        }
        String s = String.valueOf(x);
        for(int i = 0; i < s.length()/2; i++ ){
        	if(s.charAt(i) == s.charAt(s.length()-i-1)){
        		continue;
        	}
        	return false;
        }
        return true;
    }
	/*public boolean isPalindrome(int x) {
        if(x < 0 || (x != 0 && x%10 == 0)){
            return false;
        }
        int origin = x;
        int res = 0;
        while(x != 0){
            res = res*10 + x%10;
            x = x/10;
        }
        if(res == origin){
            return true;
        }
        return false;
    }*/
	public static void main(String[] args) {
		Solution so = new Solution();
		System.out.println(so.isPalindrome(123321));
	}
}
