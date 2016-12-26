package cn.ucai.day12;

/**
 * JDK5.0之后：
 * 线程池 数据库连接池
 * 
 * Byte Short Int Long 整数 ： -128~127
 * 浮点类型：没有常量池
 * boolean： 
 */
public class TestInteger {
	public static void main(String[] args) {
		Integer i1 = 200;// 自动装箱
		Integer i2 = 200;// 
		System.out.println(i1==i2);
		
		int i3 = i1 + i2;// 自动解箱
		
		Integer i4 = 200;
		int i5 = 200;
		// int和Integer类型比较，先转为int，再比较
		System.out.println(i4==i5);
	}
}
