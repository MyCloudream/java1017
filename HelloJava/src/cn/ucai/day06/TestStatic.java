package cn.ucai.day06;

/**
 * Math
 * һ�㷽������Ե���һ�㷽����һ��ȫ�ֱ�����Ҳ���Ե��þ�̬������̬ȫ�ֱ���
 * ��̬�����У����Ե��þ�̬������̬ȫ�ֱ��������ܵ���һ�㷽����һ��ȫ�ֱ���
 * ���������У�����ľ�̬����ʹ������.������
 * һ�㷽����ʹ�ö���.������
 */
public class TestStatic {
	static int a = 2;// ȫ�ֱ���
	public static void m4(){
//		int a = 2;// �ֲ�����
		System.out.println("����static���εľ�̬����m4");
	}

	public static void main(String[] args) {
		
	}
	
	public void m1(){
		System.out.println("����û��static���ε�һ�㷽��m1");
		System.out.println(a);
	}
	
	public void m2(){
		System.out.println("����û��static���ε�һ�㷽��m2");
		System.out.println(a);
	}
	
	public static void m3(){
		System.out.println("����static���εľ�̬����m3");
		System.out.println(a);
		m4();
	}
	
}
