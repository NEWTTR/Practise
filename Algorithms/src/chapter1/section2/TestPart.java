package chapter1.section2;

import edu.princeton.cs.algs4.Counter;

public class TestPart {
   
	public static void main(String[] args) {
		//习题1.2.7
		System.out.println(mystery("abcabc"));
		
		//习题1.2.9
		Counter c = new Counter("");
	    int[] a = {1,2,3,4,5}; 
    	System.out.println(BinarySearch(3,a,c));
    	System.out.println(c);
		
	}
	
	/*此方法是1.2.7的示例*/
	public static String mystery(String s){
		int N = s.length();
		if(N <= 1)
			return s;
		String a = s.substring(0, N/2);
		String b = s.substring(N/2, N);
		return mystery(b) + mystery(a);
	}
	
	 /*此方法是1.2.9的解法*/
	/*Counter c = new Counter("");
    int[] a = {1,2,3,4,5}; 
	System.out.println(BinarySearch(3,a,c));
	System.out.println(c);*/
	public static int BinarySearch(int key, int[] a, Counter c){
    	int lo = 0;
    	int hi = a.length-1;
    	while(lo <= hi){
    		c.increment();
    		int mid = lo + (hi - lo) / 2;
    		if(key < a[mid]){
    			hi = mid - 1;
    		}
    		else if(key > a[mid]){
    			lo = mid + 1;
    		}
    		else
    			return mid;
    	}
    	return -1;
    }
}


