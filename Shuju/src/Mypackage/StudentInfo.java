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
				   
				   System.out.println("�������"+(i+1)+"��ѧ����ѧ��");
				   number[i]=s.nextInt();
				   
				   System.out.println("�������"+(i+1)+"��ѧ��������");
		           name[i]=s.next();

				   
				   System.out.println("�������"+(i+1)+"��ѧ�������ĳɼ�");
		           ChinScore[i]=s.nextInt();


				   System.out.println("�������"+(i+1)+"��ѧ������ѧ�ɼ�");
				   MathScore[i]=s.nextInt();


				   System.out.println("�������"+(i+1)+"��ѧ����Ӣ��ɼ�");
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
			System.out.println("��"+j+"��ѧ�����ܳɼ�Ϊ"+student[j].getNum());
			
			
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
		
	    System.out.println("ƽ������ߵ�ѧ����Ϣ��������"+student[4].getName()+
	    		"ѧ�ţ�"+student[4].getNumber()+"���ĳɼ���"+student[4].getChinScore()+"��ѧ�ɼ���"+student[4].getMathScore()+"Ӣ��ɼ���"+student[4].getEngScore());
	    			}
}
