package chapter1.section2;

import edu.princeton.cs.algs4.Counter;

public class Test {
    public static void main(String[] args) {
    	Counter c = new Counter("");
	    int[] a = {1,2,3,4,5}; 
    	System.out.println(BinarySearch(3,a,c));
    	System.out.println(c);
	}
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
