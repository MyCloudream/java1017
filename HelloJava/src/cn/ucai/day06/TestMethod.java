package cn.ucai.day06;

/**
 	���3��Hello
	���5��World
	���3��Hello
	���3��World
	���6��Hello
	���5��World
	
	alt + shift + r : һ���Ը���ĳһ�������򷽷������������ơ�
 */
public class TestMethod {
	public static void main(String[] args) {
		// ������ʹ��
		print(3,"Hello");// ʵ�ʲ���
		print(5,"World");
		print(3,"Hello");
		print(3,"World");
		print(6,"Hello");
		print(5,"World");
	}
	
	// �����Ķ���
	public static void print(int n,String s){// ��ʽ����
		for(int i = 0;i < n ;i ++){
			System.out.println(s);
		}
	}
}
