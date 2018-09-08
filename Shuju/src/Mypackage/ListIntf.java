package Mypackage;
//线性表的抽象数据类型定义 
interface ListIntf{ 
public int size();       //返回表长度 
public void clear();      //重置为空表
public boolean isEmpty();  //若为空表返回true,否则返回false 
public int get(int i);     //返回第i个数据元素(返回类型可不同)
public int indexOf(int obj);  //第1个与obj满足关系equals()的数据元素位序,这样的数据元素不存在,
public int getPre(int obj);   //若obj是表中的元素,返回它的前驱
public int getNext(int obj);  //若obj是表中的元素,返回它的后继
public void insertElementAt(int obj,int i); //在第i个位置之前插入新的数据元素obj,表长度加1    
public int remove(int i);   //删除第i个数据元素,并返回其值,表长减1
public void printAll();
public void insertsort();  //直接插入排序
public void insertsort1(int x);  //一趟插入排序将x插入线性表仍然有序
public  int binarysearch(int x, int n);  //对有序表进行两分查找在下表0到n之间
}  


