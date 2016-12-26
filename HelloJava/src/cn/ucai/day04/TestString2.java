package cn.ucai.day04;

/**
 * 基本数据类型的比较，使用==
 * 引用数据类型的比较，使用equals
 * 
 * 方法两种调用：
 * 1、使用类名. 比如Math.pow(2,4);
 * 2、使用对象(变量). 
 * 
 * String类里面的全部方法，都不改变String对象本身。
 */
public class TestString2 {
	public static void main(String[] args) {
		String name = " zhang san     ";
		String name2 = name.trim();// 去掉前后空格
		System.out.println(name.length());
		System.out.println(name2.length());
		/*String str = "abc1abc1abc";
//		String str2 = str.replace('a', '0');
		String str2 = str.replace("ab", "000000");
		System.out.println(str2);
		System.out.println(str);*/
	}
}
