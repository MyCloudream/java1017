package cn.ucai.day12;

/**
 * 针对大规模的String的拼接，使用StringBuilder或者StringBuffer
 * 
 * StringBuilder StringBuffer 
 * 区别：
 * 1、StringBuilder从1.5开始，StringBuffer从1.0开始
 * 2、StringBuilder不支持多线程（线程不安全） StringBuffer线程安全（支持多线程）
 * 3、StringBuilder效率高，StringBuffer效率低
 * 
 * ArrayList Vector
 * Hashtable HashMap
 * 
 * 我们平时常用的，就是效率高的。
 * 
 * String、StringBuilder和StringBuffer的联系：
 * 都是CharSequence接口的实现类
 */
public class TestStringBuilder {
	public static void main(String[] args) {
		String s1 = "zhangsan";
		String s2 = "123456";
		String s3 = "18911011001";
		String s4 = "zhangsan@ucai.cn";
		String s5 = "87Fak8";
		String s6 = "#";
		// "zhangsan#" "zhangsan#123456" "zhangsan#123456#"
		String str = s1+s6+s2+s6+s3+s6+s4+s6+s5;
		
		System.out.println(str);
		
		// 1、字符数组如何存不定长度的内容？ 数组的扩容
		// 2、
		/*StringBuilder builder = new StringBuilder();
		builder.append(s1).append(s6).append(s2).append(s6)
		.append(s3).append(s6).append(s4).append(s6).append(s5);
		String strResult = builder.toString();
		System.out.println(builder);
		System.out.println(builder.toString());
		System.out.println(strResult);*/
		
		StringBuffer buffer = new StringBuffer();
		buffer.append(s1).append(s6).append(s2).append(s6)
		.append(s3).append(s6).append(s4).append(s6).append(s5);
		String strResult2 = buffer.toString();
		System.out.println(buffer);
		System.out.println(buffer.toString());
		System.out.println(strResult2);
	}
}
