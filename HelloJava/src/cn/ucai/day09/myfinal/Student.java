package cn.ucai.day09.myfinal;

/**
 * ���������ɱ�ı���
 * static final ��ͬ���εı���
 * 
 * ��̹淶��
 * 1���������е�����ĸȫ����д����ͬ����֮��ʹ��_�ָ
 */
public class Student{
	final static int a = 10;
	static final int b ;
	static{
		b = 10;
	}
	/*final static int c;
	public Person(int c){
		this.c = c;;
	}*/
	
	public static void main(String[] args) {
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Math.PI);
	}
}
