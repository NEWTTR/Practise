package Mypackage;
//���Ա�ĳ����������Ͷ��� 
interface ListIntf{ 
public int size();       //���ر��� 
public void clear();      //����Ϊ�ձ�
public boolean isEmpty();  //��Ϊ�ձ���true,���򷵻�false 
public int get(int i);     //���ص�i������Ԫ��(�������Ϳɲ�ͬ)
public int indexOf(int obj);  //��1����obj�����ϵequals()������Ԫ��λ��,����������Ԫ�ز�����,
public int getPre(int obj);   //��obj�Ǳ��е�Ԫ��,��������ǰ��
public int getNext(int obj);  //��obj�Ǳ��е�Ԫ��,�������ĺ��
public void insertElementAt(int obj,int i); //�ڵ�i��λ��֮ǰ�����µ�����Ԫ��obj,���ȼ�1    
public int remove(int i);   //ɾ����i������Ԫ��,��������ֵ,����1
public void printAll();
public void insertsort();  //ֱ�Ӳ�������
public void insertsort1(int x);  //һ�˲�������x�������Ա���Ȼ����
public  int binarysearch(int x, int n);  //�������������ֲ������±�0��n֮��
}  


