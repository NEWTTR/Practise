package test;

import java.util.Scanner;
import java.util.TreeSet;

public class Test {
	
	static int searchTO(int a){
		int sum = 0;
	    int b[] = new int[a];
	    Scanner sc = new Scanner(System.in);
	    for(int i = 0; i < b.length; i++){
	    	 b[i] = sc.nextInt();
	    	 if(b[i] >= 10000){
	    		 break;
	    	 }
	    }
	    for(int i = 0; i < b.length; i++){
	    	for(int j = 1; j<b.length; j++){
	    		if(i == j){
	    			continue;
	    		}
	    		if(b[i] == b[j]){
	    			break;
	    		}
	    	}
	    }
	    
	    TreeSet ts =new TreeSet();
	    TreeSet td =new TreeSet();
	    int c = 0;
	    int d = 0;
	    for (int z = 0;z < b.length - 1;z++) {
	    c = b[z + 1] - b[z];
	    d = b[z + 1] / b[z];
	    ts.add(c);
	    td.add(d);
	    }
	    if (ts.size() == 1 || ts.size() == 2) {
	    return sum+1;
	    } 
	    if(td.size() == 1 || td.size() == 2){
	    	return sum+1;
	    }
	    else {
	    	return 0;
	    }  	
	    }

	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  int a = sc.nextInt();
      System.out.println(Test.searchTO(a));
	}
}
