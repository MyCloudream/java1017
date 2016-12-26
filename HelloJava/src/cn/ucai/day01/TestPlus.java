package cn.ucai.day01;

/**
 * 1、测试五则运算
 * 2、+号的用法总结
 *  1）、+号做数学运算
 *  2）、+号可以做字符串的拼接
 *  3)、字符串和数字运算，结果为字符串
 * 
 * 两个整数相除，结果为整数
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
