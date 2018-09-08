package chapter1.section1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Test {
  public static void main(String[] args) {
	    int[] a={1,2,3,4};
	  System.out.println(Arrays.toString(histogram(a,5)));
}
  public static int[] histogram(int[] a, int n) {
      // TODO Auto-generated method stub
      int[] b = new int [n];
      for(int i = 0;i<b.length;i++)
          b[i] = 0;
      for(int i = 0;i<a.length;i++){
          b[a[i]]++;
      }
      return b;
  }
}
