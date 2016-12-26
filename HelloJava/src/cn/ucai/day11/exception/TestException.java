package cn.ucai.day11.exception;

/**
 * 常见异常：
 * NullPointerException:空指针异常
 * ArrayIndexOutOfBoundsException：数组下标越界异常
 * StringIndexOutOfBoundsException：字符串下标越界异常
 * NumberFormatException:数字格式化异常
 * ArithmeticException:算术运算异常
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
