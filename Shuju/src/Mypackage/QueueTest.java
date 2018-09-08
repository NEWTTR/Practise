package Mypackage;
import java.util.*; 
//���Ա�ĳ����������Ͷ��� 
interface QueueIntf{ 
public boolean isEmpty();      //��Ϊ�ձ���true,���򷵻�false 
public void enter(int obj);   //���   
public int leave();           //����
public void printAll();  //��������е�����Ԫ��
public int peek();   //���ض����еĶ�ͷԪ�ص�ֵ
}  

class SequenceQueue implements QueueIntf {  
final int MAXSIZE=20;       //���Ա���󳤶� 
private int[]  elem;        //������Ա�Ԫ�ص����� 
private int front,rear;     //��ͷ�Ͷ�βָ�� 
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
/* ʵ�ֽӿ��еķ���    */ 

public void clear() { 
	front=0;
	rear=0;
}


//@Override ���
public void enter(int obj) {
 if(((rear+1)% MAXSIZE)!=front){         //��Ӳ������ж����Ƿ������Ƿ������
   rear=rear+1;
   elem[rear]=obj;
 }   
else 
  System.out.println("--�������������!--");  
}   


//@Override��Ϊ�ձ�,�򷵻�true,���򷵻�false

public boolean isEmpty() {  
if(rear==front)      return true;   //���,����true   
return false;                  //��ǿ�,����false
}

//���� 
public int leave() { 
int obj;  
if(rear==front ){   
System.out.println("--���пղ���ɾ��Ԫ��--");   
return -1;    } 
obj=elem[(front+1)%MAXSIZE];
front=(front+1)%MAXSIZE;
return obj;
}


//��ӡ����Ԫ��  
public void printAll(){  
int i=front;
	 if(front==rear){   
  System.out.println("--���п�--");
 return;    } 
	 
 System.out.println(">>������Ԫ��>>");  
for(i=(front+1)% MAXSIZE;i<=rear;i=(i+1)%MAXSIZE)   
System.out.println(elem[i]);  
}  
public int peek(){
	 return(elem.length);
}

}


public class QueueTest { 

public static void main(String[] args) {  
System.out.println("----�������----");  
int obj;  
Scanner input=new  Scanner(System.in); 
SequenceQueue sl= new SequenceQueue(); 
for(int i=0;i<5;i++){          //����5��Ԫ�صĶ���  
System.out.print("����Ԫ��:");        
obj=input.nextInt(); 
  sl.enter(obj);  
}   
sl.printAll();   
System.out.println("----ɾ��Ԫ��----");  
obj=sl.leave(); 
if(obj!=-1)     System.out.println("...ɾ��������е�Ԫ��Ϊ��"); 
sl.printAll();   
obj=sl.leave(); 
if(obj!=-1)     System.out.println("...�ٴ�ɾ����Ķ����е�Ԫ��Ϊ��"); 
  
sl.printAll();   

}
}