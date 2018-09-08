package Mypackage;
import java.util.Scanner;
public class Test1 { 
 public static void main(String[] args) {    
   System.out.println("----构造顺序表----");  
   int  obj;   int  n, k;  
   Scanner input=new  Scanner(System.in); 
   Sqlist sl=new Sqlist();   
   System.out.print("请输入线性表中的元素:"); 
   for(int i=0;i<5;i++){                     //构造5个元素的顺序表           
     obj=input.nextInt(); 
     sl.insertElementAt(obj, sl.size()+1);  
   }  
   System.out.println("表长:"+sl.size()); 
   sl.printAll();   
   sl.heapsort();
   System.out.print("堆排序后的结果为：");   
   sl.printAll();
   sl.insertsort();
   System.out.print("直接插入排序后的结果为：");  
   sl.printAll();
   sl.qsort(0, sl.size()-1);
   System.out.print("快速排序后的结果为：");  
   sl.printAll();     
 }
}
