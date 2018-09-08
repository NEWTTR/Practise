package chapter1.section1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

import edu.princeton.cs.algs4.StdOut;

public class TestPart {
   public static void main(String[] args) {
	 //习题1.1.7
	 //a
	double t=9.0;
	while(Math.abs(t-9.0/t)> .001){
	      t=(9.0/t+t)/2.0;
	}
	StdOut.printf("%.5f\n", t);
	
	//b
	int sum=0;
	for(int i=1;i<1000;i++)
		for(int j=0;j<1;j++)
			sum++;
	StdOut.println(sum);
	
	//c
	int sum1 =0;
	for(int i =1;i<1000;i*=2)
		for(int j=0;j<1000;j++)
			sum1++;
	StdOut.println(sum1);
	
	
	//习题1.1.9 
	/*转换二进制最简单的办法是用JAVA的内质方法Interger.toBinaryString(数字)*/
	/*String s="";
	System.out.println("请输入一个正整数");    
	Scanner sc=new Scanner(System.in);
	int N=sc.nextInt();
	for(int n=N;n>0;n /=2)
		s=(n%2)+s;
	System.out.println(s);*/
	
	//习题1.1.11
	boolean[][] a1={{true,false},{false,false},{true,false},{false,true}};
	printout(a1);
	
	//习题1.1.13
	Printout();
	
	//习题1.1.14
	int N=4;
	System.out.println(lg(N));
	
	//习题1.1.15
	int[] M={1,2,3,3,4};
	System.out.println(Arrays.toString(histogram(M,5)));
	
	//习题1.1.20
	long result = logarithmic(100);
    double a = Math.log(result) / Math.log(Math.E);  
    System.out.println(a);	
    
    
    //习题1.1.24
    int a11 =gcd(1111111 ,  1234567);
    System.out.println(a11 + "");
    
    
    //习题1.1.28
    int[] whitelist = {1,2,3,4,5,5,5};
   	Set set=new HashSet();
   	for(int i=0;i<whitelist.length;i++){
   		set.add(whitelist[i]);	
   	}
   	System.out.println(set);
   	
    //习题1.1.29
   	int [] searchitem={1,2,3,4,5,6,6,6,7,8,9,10};
   	System.out.println(rank(6,searchitem));
   	System.out.println(count(6,searchitem));
   	
   	//习题1.1.30
   	System.out.println(isCompareTo(1,3));
} 
   
   
   /*此方法是用于1.1.11的解法*/
   private static void printout(boolean[][] a1){
	    for (int i = 0; i < a1.length; i++) {
	        for (int j = 0; j < a1[i].length; j++) {
	            if (a1[i][j]){
	                System.out.println(String.format(Locale.CHINA,"%d  %d *",i+1,j+1));
	            } else {
	                System.out.println(String.format(Locale.CHINA,"%d  %d /",i+1,j+1));
	            }
	        }
	    }
	}
   
   
   /*此方法是用于1.1.13的解法*/
   public static void Printout(){
		  int[ ][ ] a={{1,2,3},{4,5,6}};   
	      int[][] temp = new int[a[0].length][a.length];
	      for (int i = 0; i < a[0].length; i++) {
	          for (int j = 0; j < a.length; j++) {
	              temp[i][j] = a[j][i];
	              System.out.print(temp[i][j] + " ");
	              if(j == a.length - 1) 
	                  System.out.print("\n");
	          }
	      }
	  }
   
   
    /*此方法是用于1.1.14的解法*/
   public static int lg(int N){
	   int product = 1;
	   int x = -1;
	   while(product <= N){
		   product *=2;
		   x++;
	   }
	   return x;
   }
   
   /*此方法是用于1.1.15的解法*/
   public static int[] histogram(int a[],int M){
	   int[] n = new int[M];
	   for(int i = 0;i < a.length; i++){
		   n[i] = 0;
	   }
	   for(int i = 0 ; i<a.length; i++ ){
		   n[a[i]]++;
	   }
	   return n;
   }
   
   /*此方法是用于1.1.20的解法*/
   public static long logarithmic(int N){
	   if(N == 0)
		   return 0;
	   if(N == 0)
		   return 1;
	   return N*logarithmic(N-1);
   }
   
   /*此方法是用于1.1.24的解法*/
   public static int gcd(int M,int N){
	   int m=M;
	   int n=N;
	   if(M<N){
		   m=N;
		   n=M;
	   }
	   int r = m%n;
	   if(r==0){
		   return n;
	   }
	   System.out.println("m:"+ N + ";n:" + r);
       return gcd(N,r);
   }
   
   /*此方法是用于1.1.29的解法*/
   public static int rank(int key,int[] N){
	   int searchresult=BinarySearch.binarySearch(key, N);
	   int resultsum=0;
	   if(searchresult!=-1){
	   for(int i=0;i<N.length;i++){
		   if(N[i]==searchresult){
			   resultsum=i;
			   break;
		   }
	   } 
       } 
	   return resultsum;
   }
   public static int count(int key,int[] N){
	   int searchresult=BinarySearch.binarySearch(key, N);
	   int resultsum=0;
	   if(searchresult!=-1){
		   for(int i=0;i<N.length;i++){
			   if(N[i]==N[searchresult]){
				   resultsum++;
			   }
		   } 
	       } 
		   return resultsum;
   }
   
   /*此方法是用于1.1.30的解法*/
   /*当中的gcd30方法不仅仅是用于求最大公约数，期中如果是有1的情况输出的值是1.*/
   public static int gcd30(int m,int n) {
       if (n == 0) 
           return m;
       while (m % n != 0) {
           int temp = m % n;   
           m = n;
           n = temp;
       }
       return n;
   }
   public static boolean isCompareTo(int m, int n){
	   if(gcd30(m,n) == 1){
		   return true;
	   }
	   return false;
   }
}
