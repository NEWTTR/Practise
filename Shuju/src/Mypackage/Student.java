package Mypackage;
import java.io.Serializable;
public class Student implements Serializable{
	
   private int number;
   private String name;
   private int ChinScore;
   private int MathScore;
   private int EngScore;
   private int num;
   
   public Student(int number,String name,int ChinScore,int MathScore,int EngScore,int num){
	   this.setNumber(number);
	   this.setName(name);
	   this.setChinScore(ChinScore);
	   this.setMathScore(MathScore);
	   this.setEngScore(EngScore);
	   this.setNum(num);
   }
   
   public Student(){
	   
   }
   
   
   public void setNumber(int number2) {
   	this.number = number2;
	}
   public int getNumber() {
	return number;
   }


   public void setName(String name) {
 	this.name = name;
   }
   public String getName() {
	return name;
   } 


   public void setChinScore(int chinScore) {
	ChinScore = chinScore;
   }
   public int getChinScore() {
	return ChinScore;
   }


   public void setMathScore(int mathScore) {
	MathScore = mathScore;
   }
   public int getMathScore() {
	return MathScore;
   }


   public void setEngScore(int engScore) {
	EngScore = engScore;
   }
   public int getEngScore() {
	return EngScore;
   }


   public void setNum(int num) {
	this.num = num;
   }
   public int getNum() {
	return num;
   }
   }
