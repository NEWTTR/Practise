package chapter1.section2;

public class Circularrotation {
     public static void main(String[] args) {
    	 String s = "ASDFASAAAD";
 		String t = "ASAAADASDF";
 		
 		boolean isCircularRotation = isCircularRotation(s, t);
 		s.equals(t);
 		System.out.println("isCircularRotation:"+ (isCircularRotation ? "YES":"NO"));
	}
     public static boolean isCircularRotation(String s, String t) {
         return s.length() == t.length() && (t + t).contains(s);
     }
}
