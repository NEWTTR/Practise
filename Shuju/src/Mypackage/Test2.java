package Mypackage;
import java.util.*; 
//�������ĳ����������Ͷ��� 
interface Graph { 
public boolean  CreateGraph(EdgeElement [] d);      //����ͼ�Ĵ洢�ṹ   
public int graphType();     //����ͼ������
public int vertices();       //����ͼ�еĶ�����
public int edges();         //����ͼ�еı���
public boolean find(int i, int j);  //��ͼ�в���һ����(i,j)�Ƿ���ڣ��������򷵻�����򷵻ؼ�
public int degree(int i);   //���ض���i�Ķ�
public int inDegree(int i); //���ض���i�����
public int outDegree(int i);//���ض���i�ĳ���
public void output();//�Զ��㼯�ͱ߼�����ʽ���һ��ͼ 
public void depthFirstSearch(int v);      //�Ӷ���v��ʼ���������������ͼ
public void breadthFirstSearch(int v);    //�Ӷ���v��ʼ���������������ͼ
void clearGraph();                 //���ͼ�е���������
}  

  interface Queue {
	 public boolean isEmpty();      //��Ϊ�ձ���true,���򷵻�false 
	 public void enter(int obj);   //���(�Ա�ű�ʾ)���   
	 public int leave();           //���(�Ա�ű�ʾ)����
  }  
 
    class EdgeElement {          //����߼������е�Ԫ������
     int fromvex;               //�ߵ������
     int endvex;                //�ߵ��յ���
     int weight;                //�ߵ�Ȩֵ�򣬼ٶ�Ϊ���ͣ�������Ȩͼ��Ȩֵ��Ϊ1
     public EdgeElement(int v1, int v2) 
     {     //����Ȩͼ�еı߽��г�ʼ��
      fromvex=v1; endvex=v2; weight=1;
     }
     public EdgeElement(int v1, int v2, int wgt) 
     {     //����Ȩͼ�еı߽��г�ʼ��
      fromvex=v1; endvex=v2; weight=wgt;
     }
   }

    class AdjacencyGraph implements Graph,Queue
    {  
       final static int MaxValue=1000;//һ�������ڵı���ʹ�õ�Ȩֵ
       final static int MAXSIZE=18;
       private int n;                 //ͼ�Ķ�����
       private int e;                 //ͼ�ı���
       private int type;              //ͼ�����ͣ��ֱ���0-3��ֵ��ʾͼ����������
       private int [][]a;             //ͼ���ڽӾ��󣬼ٶ�Ԫ������Ϊint
       public int[][] getArray() {return a;}     //�����ڽӾ��������
       private int[]  elem;    //��ѭ�������е�Ԫ�ص����� 
       private int front,rear;       //��ͷ�Ͷ�βָ��     
       public void initqueue()   //��ʼ���ն���
       { elem= new int[MAXSIZE];
           front=0;
           rear=0; 
       }
  
    public boolean isEmpty()
    {
 	    if(rear==front)  return true;   //���,����true   
    	return false;
    }
  
    public int leave() 
    { 
 	     int obj;  
 	     if(rear==front ){   
 	     System.out.println("--���пղ���ɾ��Ԫ��--");   
 	     return -1;    } 
 	     obj=elem[(front+1)%MAXSIZE];
 	     front=(front+1)%MAXSIZE;
 	     return obj;
    }

    public void enter(int  obj) 
    {
 	    if(((rear+1)% MAXSIZE)!=front)           
 	    {  //��Ӳ������ж����Ƿ������Ƿ������
 	     rear=(rear+1)% MAXSIZE;
 	     elem[rear]=obj;
 	    }   
 	    else
 	    System.out.println("--�������������!--");  
 	 }   
 	 
  public AdjacencyGraph(int n,  int t)       //���캯������
  {                               //����n��t�ֱ��ʾͼ�Ķ�����������
      if(n<1 || t<0 || t>3) {
          System.out.println("��ʼ��ͼ�Ĳ���ֵ���˳�����!");
          System.exit(1);
      }
      this.n=n;  e=0;                 //��ʼ��ͼ�Ķ������ͱ����ı���n��e
      type=t;                        //��ʼ����ʾͼ���͵����ݳ�Աtype
      a=new int[n][n];               //����ʾ�ڽӾ��������a����洢�ռ�
      for(int i=0; i<n; i++)         //��ʼ������a�е�ÿ��Ԫ��ֵ
          for(int j=0; j<n; j++) {
              if(i==j) a[i][j]=0;    //�Խ���Ԫ�ر���ʼ��Ϊ0
              else if (type==0 || type==2) 
                  a[i][j]=0;         //����Ȩͼ��Ԫ�س�ʼ��Ϊ0
              else a[i][j]=MaxValue; //�Դ�Ȩͼ��Ԫ�س�ʼ��ΪMaxValue
          }
  }
  
  public boolean CreateGraph(EdgeElement[] d)
  { for(int i=0;i<d.length;i++)  {
 	 if(d[i]==null) {System.out.println("�߼��գ�ֹͣ��ͼ�����ؼ٣�");
 	 return false;}
     int v1,v2;
     v1=d[i].fromvex;        v2=d[i].endvex;
     if(v1<0 || v1>n-1 ||v2<0 || v2>n-1 || v1==v2) 
     {System.out.println("�߼��գ�ֹͣ��ͼ�����ؼ٣�");
 	 return false;}
     if(a[v1][v2]!=0 && a[v1][v2]!=MaxValue){System.out.println("�߼��գ�ֹͣ��ͼ�����ؼ٣�");
 	 return false;}
      if(type==0 )   a[v1][v2] = a[v2][v1] =1;     //����ͼ��û��Ȩֵ
      if(type==1 )   a[v1][v2] = a[v2][v1] =d[i].weight;     //����ͼ��Ȩֵ
      if(type==2 )   a[v1][v2]  =1;     //����ͼ��û��Ȩֵ
      if(type==3 )   a[v1][v2] = d[i].weight;     //����ͼ����Ȩֵ
    }
 	e=d.length;
 	return true;
  }  //���ݱ߼��������d����һ�������ڽӾ����ʾ��ͼ
  public int graphType() {return type;}    //����ͼ������
  public int vertices() {return n;}        //����ͼ�еĶ�����
  public int edges() {return e;}           //����ͼ�еı���
 public boolean find(int i, int j)  //��ͼ�в���һ����(i,j)�Ƿ���ڣ��������򷵻�����򷵻ؼ�
  { if(i<0 || i>n-1 || j<0 ||j>n-1 || i==j)
      { System.out.println("�ߵĶ��������Ч���˳����У�"); System.exit(1);}
    if(a[i][j]!=0 && a[i][j]!=MaxValue) return true ;else return false;      
  }  
 
 public int inDegree(int i)  //����i�����
 { int k=0;
	 if(i<0 || i>n-1)
     { System.out.println("�����Ķ��������Ч���˳����У�"); System.exit(1);}
  if(type==0 ||type==1) return degree(i); 
  for(int j=0;j<n;j++)
    	 if(a[j][i]!=0 && a[j][i]!=MaxValue) k++;
     return k;
 } 
 
 public int outDegree(int i) //���ض���i�ĳ���
 { int k=0;
	 if(i<0 || i>n-1)
  { System.out.println("�����Ķ��������Ч���˳����У�"); System.exit(1);}
    if(type==0 ||type==1) return degree(i); 
    for(int j=0;j<n;j++)
	 if(a[i][j]!=0 && a[i][j]!=MaxValue) k++;
     return k;
	 
 } 

 
 public int degree(int i)//���ض���i�Ķ�
  {  if(i<0 || i>n-1)
      { System.out.println("�����Ķ��������Ч���˳����У�"); System.exit(1);}
      int k=0;
      if(type==0 || type==1)
      {for(int j=0;j<n;j++)
     	 if(a[i][j]!= 0 && a[i][j]!=MaxValue) k++;
      return k;}
      else  return (inDegree(i)+outDegree(i));
      
  }

  public void clearGraph() {n=e=type=0; a=null; }  //���ͼ�е���������
  public void breadthFirstSearch(int v)
 {     //�Ӷ���v��ʼ��ͼ���й��������������
  boolean []visited= new boolean[n];       //���岼���͸�������
  for(int i=0; i<n; i++) visited[i]=false; //ÿ��Ԫ�ر���ʼ��Ϊ��
  bfs(v, visited);      //���ý��й�����������������ڲ��ǵݹ鷽��
  System.out.println(); //���һ������
 }

 public  void bfs(int i, boolean[] visited) //���й�����������������ڲ��ǵݹ鷽���Ķ���
  { int k;
  initqueue();
  System.out.print(i+" ");
  visited[i]=true;
  enter(i);
  while( !isEmpty() ){
 	  k=leave();
 	  for(int j=0; j<n; j++){
 	  if(a[k][j]!=0 && a[k][j]!=MaxValue && !visited[j])  
 	  { System.out.print(j+" "); 
 	  visited[j]=true;
 	  enter(j);}  //if
 	  }//for
     } //while
   }  

  
  

  
  public void depthFirstSearch(int v)
  {     //�Ӷ���v��ʼ��ͼ�������������������
      boolean []visited= new boolean[n];       //���岼���͸�������
      for(int i=0; i<n; i++) visited[i]=false; //ÿ��Ԫ�ر���ʼ��Ϊ��
      dfs(v, visited);      //���ý���������������������ڲ��ݹ鷽��
      System.out.println(); //���һ������
  } 
  
public void dfs(int i, boolean[] visited)  //����������������������ڲ��ݹ鷽���Ķ���
  {System.out.print(i+" ");
  visited[i]=true;     //���vi�ѱ����ʹ�
   for(int j=0; j<n; j++)
 	  if(a[i][j]!=0 && a[i][j]!=MaxValue && !visited[j])  
 	  { dfs(j, visited); }     
 	 
   } 
public void output()           //������ڽӾ����ʾ��ͼ����Ӧ�Ķ��㼯�ͱ߼�
{ int i,j;
 System.out.print("V={")  ;    //������㼯
 for(i=0;i<n-1;i++) System.out.print(i+",");
 System.out.println(n-1+"}");
 System.out.print("E={")  ; 
 if(type==0 || type==2) {
 	for(i=0;i<n;i++)
 		for(j=0;j<n;j++)
 			if(a[i][j]!=0 && a[i][j]!=MaxValue ) 
 				if(type==0) {if(i<j) System.out.print("("+i+","+j+"),");}
 				else System.out.print("<"+i+","+j+">,");
 }
 else
 {for(i=0;i<n;i++)
 		for(j=0;j<n;j++)
 			if(a[i][j]!=0 && a[i][j]!=MaxValue ) 
 				if(type==1) {if(i<j) System.out.print("("+i+","+j+")"+a[i][j]+",");}
 				else System.out.print("<"+i+","+j+">"+a[i][j]+",");
 	
 }
 System.out.println("}");
}   //����ü��ϱ�ʾ��һ��ͼ�Ķ��㼯�ͱ߼�

}


public class Test2 { 
public static void main(String[] args) {  
System.out.println("---�������ͼ�ı����㷨ʵ�����----"); 
int t;
Graph ga=new AdjacencyGraph(5,1);
int [][]a={{0,1,5},{0,2,7},{1,2,12},{1,3,3},{2,3,6},{1,4,8},{3,4,15},{2,4,20}};
EdgeElement []dd=new EdgeElement[a.length];
for(int i=0;i<a.length;i++){
	  dd[i]=new EdgeElement(a[i][0],a[i][1],a[i][2]);
	    }
if(ga.CreateGraph(dd)) System.out.println("ͼ���ڽӾ���洢�ɹ���");
else {
	System.out.println("ͼ���ڽӾ���洢���ɹ����Ƴ��������У�");
    System.exit(1);
    }
    for(int n=1;n<=4;n++) {
       System.out.println(n+"����ȣ�"+ ga.inDegree(n)); 
    }
    for(int x=1;x<=4;x++) {
    	 System.out.println(x+"�ĳ��ȣ�"+ ga.outDegree(x));  
    }
 }
}  