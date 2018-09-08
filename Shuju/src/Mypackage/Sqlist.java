package Mypackage;
import java.util.Scanner;
class Sqlist implements ListIntf {  
	 final int MAXSIZE=20;         //线性表最大长度 
	 public  int[]  elem;          //存放线性表元素的数组 
	 private int len;               //线性表的长度 
	 
	public Sqlist(){
	  len=0;
	  elem= new int[MAXSIZE];}

	public Sqlist(int n){
	  if(n<MAXSIZE)  n=MAXSIZE;
	  len=0;
	  elem= new int[MAXSIZE];}

	//取得表最大长度 
	public int getMAXSIZE(){
	 return MAXSIZE;  
	 }

	//返回表长度
	 public void insertsort()     //直接插入排序
	 { int j;
	   for(int i=1;i<len;i++)
	   { int x=elem[i];
	    for(j=i-1;j>=0;j--)
	    {if(x<elem[j]) elem[j+1]=elem[j]; else break;}
	    elem[j+1]=x; 
	   }
	  }

	public void insertsort1(int x){   //有序表尾添加元素X使其仍然有序
		int j;
		for( j=len-1;j>=0;j--) {
	     if(x<elem[j]) elem[j+1]=elem[j]; else break;
	    }   //寻找插入的位置，然后将元素插入
	    elem[j+1]=x;
	    len++;
	}

	 public int size()  {
		 return len;
	 } 
	 public  int binarysearch (int x, int n) {   //对有序表进行两分查找
	  int  l=0,h=n-1;
	  while(l<=h) {
	   int mid=(l+h)/2;
	    if(elem[mid]==x) return mid;   //查找成功
	    else 
	    	if (x<elem[mid]) h=mid-1 ; else l=mid+1; 
	   }
	  return -1;   //查找失败
	 }
	 
	 
	 public int partition(int low, int high)  //快速排序的第一次划分
	  { int  pivotkey;
	    pivotkey=elem[low];  //枢轴记录
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


	 void qsort(int s,int t)  //快速排序真正实现
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
	 void heap(int i,int m)         /*  调整成堆   */
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
	  heap(i,len-1);                  /* 将所有元素调整成堆*/
	  printAll();
	  for(v=len-1;v>=0;v--)
	  { w=elem[0];   
	    elem[0]=elem[v];
	    elem[v]=w; 
	    heap(0,v-1);
	  }
	 }

	 

	 public void clear(){
		System.out.println("清除数据了！");
	 }
	 
	 public int get(int i) { 
	if(len==0)     return 0;       //表空,查找失败 
	 if(i<1||i>len) return -1;     //查找位置不合法,查找失败 
	  return elem[i-1];     //查找成功 
	 }  

	public int getNext(int obj) { 
	  int i=indexOf(obj); 
	  if(i==-1)     return -1;            // 指定元素不存在 
	  else if(i==len)      return 1;      // 指定元素位于最后一位,不存在后继元素 
	  return elem[i];      //查找后继成功,返回后继   
	  }

	 public int getPre(int obj) {
	 int i=indexOf(obj); 
	 if(i==-1)     return -1;           //指定元素不存在   
	 else 
		 if(i==1)      return 1;   //指定元素位于第一位,不存在前驱元素
	 return elem[i-1];  //查找前驱成功,返回前驱      
	 } 
 
	public int indexOf(int obj) {  
	 for(int i=0;i<len;i++){ 
	    if( elem[i]==obj) 
	     return i+1;                //查找成功,返回位
	       }   
	 return -1;        //查找失败 
	 } 

	  public void insertElementAt(int obj, int i) {
	   if(len==MAXSIZE){                  
	    return;   
	   }   
	 else if(i<1||i>len+1){ 
	    System.out.println("--插入位置非法--");  
	  return;                        //插入位置非法 
	    }   
	 for(int j=len-1;j>=i-1;j--)   
	   elem[j+1]=elem[j];   
	   elem[i-1]=obj;          //插入元素 
	   len++;                 //表长加1   
	   return;
	}
	  
	 public boolean isEmpty() {  
	 if(len==0)      return true;   //表空,返回true   
	 return false;                  //表非空,返回false
	}

	public int remove(int i) { 
	  int obj;  
	  if(i<1||i>len){   
	  System.out.println("--删除位置非法--");   
	  return -1;    } 
	   obj=elem[i-1];                      //被删除的值   
	  for(int j=i-1;j<len-1;j++){  
	   elem[j]=elem[j+1];    }  
	   len--;   
	  return obj;          //返回被删除的值 
	  }

//打印表中元素  
	 public void printAll(){  
	 if(len==0){   
	    System.out.println("--表空--");
	   return;    } 
	   System.out.println(">>表中元素>>");  
	  for(int i=0;i<len;i++)   
	  System.out.println(elem[i]);  
	  }  
	 }