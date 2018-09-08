package Mypackage;
import java.io.*;
import java.util.Scanner;


public class StudentInfo {

	public static void main(String[] args) throws IOException {
		StudentInfo si=new StudentInfo();
		int[] number=new int[5];
		Student[] stu=new Student[5];
		String[] name=new String[5];
		int[] ChinScore=new int[5];
		int[] MathScore=new int[5];
		int[] EngScore=new int[5];
		FileInputStream fis = null;
		FileOutputStream  fos=null;
		ObjectInputStream ois;
		File file=new File("STUDENT.DAT");
		if(!file.exists()){
			try{
				file=new File("STUDENT.DAT");
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		fis=new FileInputStream(file);
		ois=new ObjectInputStream(fis);
		fos=new FileOutputStream(file);
		ObjectOutputStream o=new ObjectOutputStream(fos);
		Student[] student=new Student[5];
	
		try {
			
			for(int i=0;i<5;i++){
				   Scanner s=new Scanner(System.in);
				   
				   System.out.println("请输入第"+(i+1)+"个学生的学号");
				   number[i]=s.nextInt();
				   
				   System.out.println("请输入第"+(i+1)+"个学生的姓名");
		           name[i]=s.next();

				   
				   System.out.println("请输入第"+(i+1)+"个学生的语文成绩");
		           ChinScore[i]=s.nextInt();


				   System.out.println("请输入第"+(i+1)+"个学生的数学成绩");
				   MathScore[i]=s.nextInt();


				   System.out.println("请输入第"+(i+1)+"个学生的英语成绩");
				   EngScore[i]=s.nextInt();

				   
				   int num=ChinScore[i]+MathScore[i]+EngScore[i];
				   
				   stu[i]=new Student(number[i],name[i],ChinScore[i],MathScore[i],EngScore[i],num);
				   o.writeObject(stu[i]);
				}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	    
		Student st=new Student();
		for(int j=0;j<5;j++){
		  try {
			student[j]=(Student)ois.readObject();
			System.out.println("第"+j+"个学生的总成绩为"+student[j].getNum());
			
			
		} catch (Exception e) {
			e.printStackTrace(); 
		  }
		}
	    for(int m=0;m<5;m++){
	    	while(m<4){
				if(student[m].getNum()>student[m+1].getNum()){
					st=student[m];
					student[m]=student[m+1];
					student[m+1]=st;
					m++;
				}
				else m++;
	    	}
	    }
		
	    System.out.println("平均分最高的学生信息：姓名："+student[4].getName()+
	    		"学号："+student[4].getNumber()+"语文成绩："+student[4].getChinScore()+"数学成绩："+student[4].getMathScore()+"英语成绩："+student[4].getEngScore());
	    			}
}
