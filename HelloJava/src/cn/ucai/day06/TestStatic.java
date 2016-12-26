package cn.ucai.day06;

/**
 * Math
 * 一般方法里，可以调用一般方法或一般全局变量，也可以调用静态方法或静态全局变量
 * 静态方法中，可以调用静态方法或静态全局变量，不能调用一般方法或一般全局变量
 * 在其他类中，本类的静态方法使用类名.来调用
 * 一般方法，使用对象.来调用
 */
public class TestStatic {
	static int a = 2;// 全局变量
	public static void m4(){
//		int a = 2;// 局部变量
		System.out.println("我是static修饰的静态方法m4");
	}

	public static void main(String[] args) {
		
	}
	
	public void m1(){
		System.out.println("我是没有static修饰的一般方法m1");
		System.out.println(a);
	}
	
	public void m2(){
		System.out.println("我是没有static修饰的一般方法m2");
		System.out.println(a);
	}
	
	public static void m3(){
		System.out.println("我是static修饰的静态方法m3");
		System.out.println(a);
		m4();
	}
	
}
