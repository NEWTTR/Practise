package Mypackage;
import java.util.Scanner;
public class Test1 { 
 public static void main(String[] args) {    
   System.out.println("----����˳���----");  
   int  obj;   int  n, k;  
   Scanner input=new  Scanner(System.in); 
   Sqlist sl=new Sqlist();   
   System.out.print("���������Ա��е�Ԫ��:"); 
   for(int i=0;i<5;i++){                     //����5��Ԫ�ص�˳���           
     obj=input.nextInt(); 
     sl.insertElementAt(obj, sl.size()+1);  
   }  
   System.out.println("��:"+sl.size()); 
   sl.printAll();   
   sl.heapsort();
   System.out.print("�������Ľ��Ϊ��");   
   sl.printAll();
   sl.insertsort();
   System.out.print("ֱ�Ӳ��������Ľ��Ϊ��");  
   sl.printAll();
   sl.qsort(0, sl.size()-1);
   System.out.print("���������Ľ��Ϊ��");  
   sl.printAll();     
 }
}
