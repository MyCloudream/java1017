package cn.ucai.day08.pa3;

/**
 * JAVA中的继承是单根继承
 * 1、一个类只能有一个父类
 * 2、一个父类可以有多个子类
 * 
 * 对象和引用：
 * 1、一个引用只能指向一个对象
 * 2、一个对象可以被多个引用指向
 */
public class C extends B{
	public static void main(String[] args) {
		C c = new C();
		c.m();
	}
}
