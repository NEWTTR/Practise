package chapter1.section1;

import java.util.Arrays;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class BinarySearch {
     public static int binarySearch(int key, int[] a){
         //数组必须是有序的
    	 int lo = 0;
    	 int hi = a.length-1;
    	 while(lo <= hi){
    		 //被查找的键要么不存在，要么必然存在a[lo..hi]之中
    		 int mid = lo + (hi-lo)/2;
    		 if(key<a[mid])
    		  hi= mid-1;
    		 else if(key>a[mid])
    			 lo=mid+1;
    		 else
    			 return mid;	 
    	 }
    	 return -1;
     }
     public static void main(String[] args) {
    	int[] whitelist = {1,2,3,4,5,5,5};
    	Arrays.sort(whitelist);
    	while(!StdIn.isEmpty()){
    		int key = StdIn.readInt();
    		if(binarySearch(key,whitelist)<0)
    			StdOut.println(key);
    	}
	}
}
