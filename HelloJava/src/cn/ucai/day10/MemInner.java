package cn.ucai.day10;

/**
 * 一般属性：全局变量、成员变量、实例变量
 * 一般方法：函数、成员方法、实例方法
 * 
 * 内部类：定义在类中的类
 * 1、成员内部类
 * 2、静态内部类
 * 3、局部内部类
 * 4、匿名内部类：其实是一种特殊的局部内部类
 */
public class MemInner {
	
	public void m(){
		Mem memClass = new Mem();
		memClass.method();
	}
	
	public static void main(String[] args) {
		MemInner mi = new MemInner();
		Mem memClass = mi.new Mem();
		memClass.method();
	}
	
	public class Mem{
		public void method(){
			System.out.println("我是成员内部类");
		}
	}
}

/*class Mem2{
	public void method(){
		System.out.println("我是成员内部类");
	}
}
*/