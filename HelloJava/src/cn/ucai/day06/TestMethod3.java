package cn.ucai.day06;

/**
 * �����������int�������ݵ����
 * 
 * �����ķ���ֵ�ͷ���ֵ����Ҫһ��
 * ���һ������û�з���ֵ����д��void
 */
public class TestMethod3 {
	public static void main(String[] args) {
		int n = add(2, 3);
	}
	
	public static int add(int a,int b){
		int c = a + b;
		return c;// ��c����
	}
	
	
	public static void print(){
		System.out.println("Hello ");
		return ;
	}
	
}
