package Mypackage;
import java.util.*; 
//线性表的抽象数据类型定义 
interface QueueIntf{ 
public boolean isEmpty();      //若为空表返回true,否则返回false 
public void enter(int obj);   //入队   
public int leave();           //出队
public void printAll();  //输出队列中的所有元素
public int peek();   //返回队列中的队头元素的值
}  

class SequenceQueue implements QueueIntf {  
final int MAXSIZE=20;       //线性表最大长度 
private int[]  elem;        //存放线性表元素的数组 
private int front,rear;     //对头和队尾指针 
public SequenceQueue(){
  elem= new int[MAXSIZE];
  front=0;
  rear=0; }

public SequenceQueue(int n){
 elem= new int[MAXSIZE];
 if(n<MAXSIZE)  n=MAXSIZE;
 front=0;
 rear=0;
}
/* 实现接口中的方法    */ 

public void clear() { 
	front=0;
	rear=0;
}


//@Override 入队
public void enter(int obj) {
 if(((rear+1)% MAXSIZE)!=front){         //入队操作，判队列是否满，是否能入队
   rear=rear+1;
   elem[rear]=obj;
 }   
else 
  System.out.println("--队列满不能入队!--");  
}   


//@Override若为空表,则返回true,否则返回false

public boolean isEmpty() {  
if(rear==front)      return true;   //表空,返回true   
return false;                  //表非空,返回false
}

//出队 
public int leave() { 
int obj;  
if(rear==front ){   
System.out.println("--队列空不能删除元素--");   
return -1;    } 
obj=elem[(front+1)%MAXSIZE];
front=(front+1)%MAXSIZE;
return obj;
}


//打印表中元素  
public void printAll(){  
int i=front;
	 if(front==rear){   
  System.out.println("--队列空--");
 return;    } 
	 
 System.out.println(">>队列中元素>>");  
for(i=(front+1)% MAXSIZE;i<=rear;i=(i+1)%MAXSIZE)   
System.out.println(elem[i]);  
}  
public int peek(){
	 return(elem.length);
}

}


public class QueueTest { 

public static void main(String[] args) {  
System.out.println("----构造队列----");  
int obj;  
Scanner input=new  Scanner(System.in); 
SequenceQueue sl= new SequenceQueue(); 
for(int i=0;i<5;i++){          //构造5个元素的队列  
System.out.print("输入元素:");        
obj=input.nextInt(); 
  sl.enter(obj);  
}   
sl.printAll();   
System.out.println("----删除元素----");  
obj=sl.leave(); 
if(obj!=-1)     System.out.println("...删除后队列中的元素为："); 
sl.printAll();   
obj=sl.leave(); 
if(obj!=-1)     System.out.println("...再次删除后的队列中的元素为："); 
  
sl.printAll();   

}
}