package test;

import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestDouble {
	public static boolean IsPtInPoly(Point2D.Double point, List<Point2D.Double> pts){
	    
	    int N = pts.size();
	    boolean boundOrVertex = true; 
	    int intersectCount = 0;
	    double precision = 2e-10; 
	    Point2D.Double p1, p2;
	    Point2D.Double p = point;  
	    p1 = pts.get(0);
	    for(int i = 1; i <= N; ++i){      
	        if(p.equals(p1)){
	            return boundOrVertex;
	        }      
	        p2 = pts.get(i % N);    
	        if(p.x < Math.min(p1.x, p2.x) || p.x > Math.max(p1.x, p2.x)){         
	            p1 = p2; 
	            continue;
	        }
	        if(p.x > Math.min(p1.x, p2.x) && p.x < Math.max(p1.x, p2.x)){
	            if(p.y <= Math.max(p1.y, p2.y)){     
	                if(p1.x == p2.x && p.y >= Math.min(p1.y, p2.y)){
	                    return boundOrVertex;
	                }
	                if(p1.y == p2.y){            
	                    if(p1.y == p.y){
	                        return boundOrVertex;
	                    }else{
	                        ++intersectCount;
	                    } 
	                }else{              
	                    double xinters = (p.x - p1.x) * (p2.y - p1.y) / (p2.x - p1.x) + p1.y;                   
	                    if(Math.abs(p.y - xinters) < precision){
	                        return boundOrVertex;
	                    }
	                    
	                    if(p.y < xinters){
	                        ++intersectCount;
	                    } 
	                }
	            }
	        }else{            
	            if(p.x == p2.x && p.y <= p2.y){             
	                Point2D.Double p3 = pts.get((i+1) % N);                   
	                if(p.x >= Math.min(p1.x, p3.x) && p.x <= Math.max(p1.x, p3.x)){
	                    ++intersectCount;
	                }else{
	                    intersectCount += 2;
	                }
	            }
	        }            
	        p1 = p2;
	    }
	    if(intersectCount % 2 == 0){
	        return false;
	    } else {
	        return true;
	    }   
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    Point2D.Double point = new Point2D.Double(sc.nextInt(), sc.nextInt());    
	    List<Point2D.Double> pts = new ArrayList<Point2D.Double>();
	    boolean bool = true ;
	    while(bool){
	    	pts.add(new Point2D.Double(sc.nextInt(), sc.nextInt()));
	       if(sc.nextLine() == "."){
	    	   bool = false;
	       }
		   if(bool == false){
			   break;
		   }
	    }
	    if(IsPtInPoly(point, pts)){
	        System.out.println("yes,0");
	    }else{
	       
	    }
	}

}
