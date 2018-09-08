package Mypackage;
import java.util.Scanner;
class Sqlist implements ListIntf {  
	 final int MAXSIZE=20;         //���Ա���󳤶� 
	 public  int[]  elem;          //������Ա�Ԫ�ص����� 
	 private int len;               //���Ա�ĳ��� 
	 
	public Sqlist(){
	  len=0;
	  elem= new int[MAXSIZE];}

	public Sqlist(int n){
	  if(n<MAXSIZE)  n=MAXSIZE;
	  len=0;
	  elem= new int[MAXSIZE];}

	//ȡ�ñ���󳤶� 
	public int getMAXSIZE(){
	 return MAXSIZE;  
	 }

	//���ر���
	 public void insertsort()     //ֱ�Ӳ�������
	 { int j;
	   for(int i=1;i<len;i++)
	   { int x=elem[i];
	    for(j=i-1;j>=0;j--)
	    {if(x<elem[j]) elem[j+1]=elem[j]; else break;}
	    elem[j+1]=x; 
	   }
	  }

	public void insertsort1(int x){   //�����β���Ԫ��Xʹ����Ȼ����
		int j;
		for( j=len-1;j>=0;j--) {
	     if(x<elem[j]) elem[j+1]=elem[j]; else break;
	    }   //Ѱ�Ҳ����λ�ã�Ȼ��Ԫ�ز���
	    elem[j+1]=x;
	    len++;
	}

	 public int size()  {
		 return len;
	 } 
	 public  int binarysearch (int x, int n) {   //�������������ֲ���
	  int  l=0,h=n-1;
	  while(l<=h) {
	   int mid=(l+h)/2;
	    if(elem[mid]==x) return mid;   //���ҳɹ�
	    else 
	    	if (x<elem[mid]) h=mid-1 ; else l=mid+1; 
	   }
	  return -1;   //����ʧ��
	 }
	 
	 
	 public int partition(int low, int high)  //��������ĵ�һ�λ���
	  { int  pivotkey;
	    pivotkey=elem[low];  //�����¼
	   while(low<high) {
	   while(low<high && elem[high]>=pivotkey)
	    high--;
	    if (low<high)  {elem[low]=elem[high]; low++;
	    }
	    while(low<high  && elem[low]<=pivotkey)
	    low++;
	    if(low<high) {elem[high]=elem[low]; high--;
	    }
	   }
	    elem[low]= pivotkey;
	    return (low);
	 }


	 void qsort(int s,int t)  //������������ʵ��
	 {int pivotloc;
	  if(s<t) {
	  pivotloc=partition(s,t);
	   qsort(s,pivotloc-1);
	   qsort(pivotloc+1,t);
	  }
	 }
	 
	 void shellsort()        /*  shellsort   */
	 { int i,j,k,x;
	   k=len/2;
	   while(k>=1) {
	   for(i=k;i<=len-1;i++)
	    {x=elem[i]; j=i-k;
	    while(((j>=0) && elem[j]>=x) )
	    {elem[j+k]=elem[j]; j=j-k;}
	     elem[j+k]=x;
	    }
	    k=k/2;
	   }
	 }
	 void heap(int i,int m)         /*  �����ɶ�   */
	 {int x;
	  int j;
	  x=elem[i]; j=2*i+1;
	  while(j<=m)
	  {if (j<m) if (elem[j]>elem[j+1]) j++;
	  if (elem[j]<x){elem[i]=elem[j];i=j;j=2*i+1;}
	  else j=m+1; }
	  elem[i]=x;
	 }        

	 void heapsort()
	 {int i,v,w; 
	  for(i=(len-1)/2; i>=0; i--)
	  heap(i,len-1);                  /* ������Ԫ�ص����ɶ�*/
	  printAll();
	  for(v=len-1;v>=0;v--)
	  { w=elem[0];   
	    elem[0]=elem[v];
	    elem[v]=w; 
	    heap(0,v-1);
	  }
	 }

	 

	 public void clear(){
		System.out.println("��������ˣ�");
	 }
	 
	 public int get(int i) { 
	if(len==0)     return 0;       //���,����ʧ�� 
	 if(i<1||i>len) return -1;     //����λ�ò��Ϸ�,����ʧ�� 
	  return elem[i-1];     //���ҳɹ� 
	 }  

	public int getNext(int obj) { 
	  int i=indexOf(obj); 
	  if(i==-1)     return -1;            // ָ��Ԫ�ز����� 
	  else if(i==len)      return 1;      // ָ��Ԫ��λ�����һλ,�����ں��Ԫ�� 
	  return elem[i];      //���Һ�̳ɹ�,���غ��   
	  }

	 public int getPre(int obj) {
	 int i=indexOf(obj); 
	 if(i==-1)     return -1;           //ָ��Ԫ�ز�����   
	 else 
		 if(i==1)      return 1;   //ָ��Ԫ��λ�ڵ�һλ,������ǰ��Ԫ��
	 return elem[i-1];  //����ǰ���ɹ�,����ǰ��      
	 } 
 
	public int indexOf(int obj) {  
	 for(int i=0;i<len;i++){ 
	    if( elem[i]==obj) 
	     return i+1;                //���ҳɹ�,����λ
	       }   
	 return -1;        //����ʧ�� 
	 } 

	  public void insertElementAt(int obj, int i) {
	   if(len==MAXSIZE){                  
	    return;   
	   }   
	 else if(i<1||i>len+1){ 
	    System.out.println("--����λ�÷Ƿ�--");  
	  return;                        //����λ�÷Ƿ� 
	    }   
	 for(int j=len-1;j>=i-1;j--)   
	   elem[j+1]=elem[j];   
	   elem[i-1]=obj;          //����Ԫ�� 
	   len++;                 //����1   
	   return;
	}
	  
	 public boolean isEmpty() {  
	 if(len==0)      return true;   //���,����true   
	 return false;                  //��ǿ�,����false
	}

	public int remove(int i) { 
	  int obj;  
	  if(i<1||i>len){   
	  System.out.println("--ɾ��λ�÷Ƿ�--");   
	  return -1;    } 
	   obj=elem[i-1];                      //��ɾ����ֵ   
	  for(int j=i-1;j<len-1;j++){  
	   elem[j]=elem[j+1];    }  
	   len--;   
	  return obj;          //���ر�ɾ����ֵ 
	  }

//��ӡ����Ԫ��  
	 public void printAll(){  
	 if(len==0){   
	    System.out.println("--���--");
	   return;    } 
	   System.out.println(">>����Ԫ��>>");  
	  for(int i=0;i<len;i++)   
	  System.out.println(elem[i]);  
	  }  
	 }