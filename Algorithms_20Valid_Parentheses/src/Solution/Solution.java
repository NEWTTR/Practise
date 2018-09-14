package Solution;

import java.util.Stack;

public class Solution {
	public boolean isValid(String s) {
		Stack<Character> st = new Stack<Character>();
		for(char c : s.toCharArray() ){
			if(c == '{'){
				st.push('}');
			}
			else if(c == '['){
				st.push(']');
			}
			else if(c == '('){
				st.push(')');
			}
			else if(st.isEmpty() || st.pop() != c){
				return false;
			}
		}
		return st.isEmpty();
		/*if(s.length() < 1){
			return true;
		}
		Stack<Character> st = new Stack<Character>();
		for(int i = 0; i < s.length(); i++){
			if((s.charAt(i) == '{') || (s.charAt(i) == '[') || (s.charAt(i) == '(')){
				st.push(s.charAt(i));
			}
			else if(s.charAt(i) == '}'){
				if(st.isEmpty() || (st.peek() != '{')){
					return false;
				}
				st.pop();
			}
			else if(s.charAt(i) == ']'){
				if(st.isEmpty() || (st.peek() != '[')){
					return false;
				}
				st.pop();
			}
			else if(s.charAt(i) == ')'){
				if(st.isEmpty() || (st.peek() != '(')){
					return false;
				}
				st.pop();
			}
		}
		return true;*/
    }
	public static void main(String[] args) {
		Solution so = new Solution();
		String s = "()[]{}";
		System.out.println(so.isValid(s));
	}
}
