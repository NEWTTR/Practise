package chapter1.section2;

import java.util.ArrayList;

public class Interval1D {
    double lo;
     double hi;
    public Interval1D(){
    	
    }
    public Interval1D(double lo, double hi){
    	if(lo > hi){
    		double m = lo;
    		lo = hi;
    		hi = m;
    	}
    	this.lo = lo;
    	this.hi = hi;
    }
    public boolean contains(double x){
    	return (x < hi)&&(x >lo);
    }
    public boolean intersect(Interval1D that){
    	if(this.hi < that.lo){
    		return false;
    	}
    	else if((this.lo < that.hi)&&(this.hi > that.lo)){
    		return true;
    	}
    	else
    		return false;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "( "+lo+", " + hi + " )";
    }
    
    public static void main(String[] args) {
		ArrayList<Interval1D> interval1ds = new ArrayList<>();
		Interval1D interval1d1 = new Interval1D(3, 5);
        Interval1D interval1d2 = new Interval1D(4, 5);
        Interval1D interval1d3 = new Interval1D(1, 5);
        Interval1D interval1d4 = new Interval1D(7, 9);
        Interval1D interval1d5 = new Interval1D(1, 2);
		
		interval1ds.add(interval1d1);
		interval1ds.add(interval1d2);
		interval1ds.add(interval1d3);
		interval1ds.add(interval1d4);
		interval1ds.add(interval1d5);
		
		for(int i = 0; i < interval1ds.size(); i++){
			
			for(int j = i+1; j< interval1ds.size(); j++){
				Interval1D tempinterval1d1 = interval1ds.get(i);
				Interval1D tempinterval1d2 = interval1ds.get(j);
				if(tempinterval1d1.intersect(tempinterval1d2)){
					System.out.println("intersect:"+tempinterval1d1+" " + tempinterval1d2);
				}
			}
		}
	}
    public double length(){
        return Math.abs(lo - hi);
    }
}
