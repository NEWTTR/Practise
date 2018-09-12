package Solution;

import java.util.Scanner;

public class Solution {
	 public int romanToInt(String s) {
		 int sum = 0;
		 int i = 0;
		 while(i < s.length()){
			 char a = s.charAt(i);
			 switch(a){
			 case 'I':
				 if(i < s.length()-1 && s.charAt(i+1) == 'V'){
					 sum += 4;
					 i++;
				 }
				 else if(i < s.length()-1 && s.charAt(i+1) == 'X'){
					 sum += 9;
					 i++;
				 }
				 else
					 sum += 1;
				 break;
			 case 'V':
				 sum += 5;
				 break;
			 case 'X':
				 if(i < s.length()-1 && s.charAt(i+1) == 'L'){
					 sum += 40;
					 i++;
				 }
				 else if(i < s.length()-1 && s.charAt(i+1) == 'C'){
					 sum += 90;
					 i++;
				 }
				 else
					 sum += 10;
				 break;
			 case 'L':
				 sum += 50;
				 break;
			 case 'C':
				 if(i < s.length()-1 && s.charAt(i+1) == 'D'){
					 sum += 400;
					 i++;
				 }
				 else if(i < s.length()-1 && s.charAt(i+1) == 'M'){
					 sum += 900;
					 i++;
				 }
				 else
					 sum += 100;
				 break;
			 case 'D':
				 sum += 500;
				 break;
			 case 'M':
				 sum += 1000;
				 break;
			 }
			 i++;
		 }
		 return sum;
		 /*int sum = 0;
	     if(s.contains("IV")){
	    	 sum -= 2;
	     }
	     if(s.contains("IX")){
	    	 sum -= 2;
	     }
	     if(s.contains("XL")){
	    	 sum -= 20;
	     }
	     if(s.contains("XC")){
	    	 sum -= 20;
	     }
	     if(s.contains("CD")){
	    	 sum -= 200;
	     }
	     if(s.contains("CM")){
	    	 sum -= 200;
	     }
	     char[] c = s.toCharArray();
	     int count = 0;
	     for(; count < s.length(); count++){
	    	 if(c[count]=='M') sum+=1000;
	         if(c[count]=='D') sum+=500;
	         if(c[count]=='C') sum+=100;
	         if(c[count]=='L') sum+=50;
	         if(c[count]=='X') sum+=10;
	         if(c[count]=='V') sum+=5;
	         if(c[count]=='I') sum+=1;
	    	 
	     }
		 return sum;*/
	 }

	 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Solution so = new Solution();
		System.out.println(so.romanToInt(sc.nextLine()));
	}
}
