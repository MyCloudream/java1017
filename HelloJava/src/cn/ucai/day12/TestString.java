package cn.ucai.day12;

/**
 * 基本数据类型比较使用 == 或 != 
 * 引用数据类型比较
 * 		1、使用==，比较的是内存中对象的地址
 * 		2、使用equals：
 * 			1）、没有重写equals，还是比较的堆中的地址，相当于==
 * 			2）、重写了equals，则按照自己的重写规则，进行比较。
 * 引用数据类型和null比较，使用== 或 !=
 * 
 * 方法区：字符串常量池
 * String s = "abc";
 * 1、查看字符串常量池中有没有"abc"这个常量对象
 * 2、如果有，则把它的引用给s
 * 3、如果没有，则在常量池中新建一个"abc",并且把引用给s
 */
public class TestString {
	public static void main(String[] args) {
		/*String s1 = new String("abc");
		String s2 = new String("abc");
		System.out.println(s1==s2);// false
		System.out.println(s1.equals(s2));// true
*/		
		
		/*String s3 = "abc";
		String s4 = "abc";
		s4 = "mon";
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));*/
		
		/*String s5 = "abc";
		String s6 = new String("abc");
		System.out.println(s5.equals(s6));
		System.out.println(s5==s6);
		*/
		
		String s1 = new String("abc");
		String s2 = new String("abc");
	}
}
