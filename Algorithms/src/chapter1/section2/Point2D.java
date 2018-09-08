package chapter1.section2;

import java.util.ArrayList;

public class Point2D {
	public double x;
	public double y;
	
	public Point2D(){
		
	}
    public Point2D(double x, double y){
	  this.x = x;
	  this.y = y;  
    }
  
  public  double distTo(Point2D that){
	  double xDistance = this.x - that.x;
	  double yDistance = this.y - that.y;
	  return Math.sqrt(xDistance * xDistance + yDistance * yDistance); 
  }
  
  public static void main(String[] args) {
	int N = 10;
	ArrayList<Point2D> point = new ArrayList<Point2D>();
	for(int i = 0; i < N; i++){
		Point2D point2d = new Point2D(Math.random(),Math.random());
		point.add(point2d);
	}
	double resultDistance = point.get(0).distTo(point.get(1));
	for(int i = 0; i< N; i++){
		Point2D point2d = point.get(i);
		for(int j = i+1; j < N; j++ ){
			double distance = point2d.distTo(point.get(j));
			if(distance < resultDistance){
				resultDistance = distance;
			}
		}
	}
	System.out.println(resultDistance);
}
}
