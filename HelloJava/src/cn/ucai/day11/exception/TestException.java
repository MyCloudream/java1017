package cn.ucai.day11.exception;

/**
 * �����쳣��
 * NullPointerException:��ָ���쳣
 * ArrayIndexOutOfBoundsException�������±�Խ���쳣
 * StringIndexOutOfBoundsException���ַ����±�Խ���쳣
 * NumberFormatException:���ָ�ʽ���쳣
 * ArithmeticException:���������쳣
 */
public class TestException {
	public static void main(String[] args) {
		/*String str = null;
		System.out.println(str.charAt(0));*/
		
		/*int[] niArr = new int[3];
		System.out.println(niArr[5]);*/
		
		/*String str = "abc";
		System.out.println(str.charAt(5));*/
		
		/*String str = "abc";
		int i = Integer.parseInt(str);
		System.out.println(i+1);*/
		
		int a = 2;
		int b = 0;
		System.out.println(a/b);
	}
}
