package cn.ucai.day01;

/**
 * 1��������������
 * 2��+�ŵ��÷��ܽ�
 *  1����+������ѧ����
 *  2����+�ſ������ַ�����ƴ��
 *  3)���ַ������������㣬���Ϊ�ַ���
 * 
 * ����������������Ϊ����
 */
public class TestPlus {
	public static void main(String[] args) {
		System.out.println("abc"+"123");
		System.out.println("abc"+123);// "abc123"
		// "abc1" "abc12" "abc123"
		System.out.println("abc"+1+2+3);
		// "6abc" "6abc123"
		System.out.println(1+2+3+"abc"+1+2+3);
		
		System.out.println("Hello + World");
		
		/*System.out.println("Hello World !");
		System.out.println(100+100);
		System.out.println(3-2);
		System.out.println(3*2);
		System.out.println(3/2);
		System.out.println(5%2);
		System.out.println("abc"+"def"+"mon");*/
	}
}
