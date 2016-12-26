package cn.ucai.day10;

/**
 * 匿名内部类：
 * 1、new + 父类/父接口 () {}
 * public class HelloWorld
 * 特点：
 * 没有修饰符  没有class关键字 没有类名 没有implements或者extends关键字
 * 有父子类的实质 有类体 有重写方法
 */
public class AnnoInner {
	public void m1(Inter inter){
		System.out.println("m1");
		inter.method();
	}
	
	/**
	 * 局部内部类
	 */
	public void m2(){
		
		class Anno implements Inter{
			@Override
			public void method() {
				System.out.println("我是Inter的实现类的重写后的method方法");
			}
		}
		
		Inter inter = new Anno();
		
		m1(inter);
		m1(new Anno());
	}
	
	/**
	 * 匿名内部类
	 */
	public void m3(){
		// 多态第二条：当发生多态时（此时的父类的引用形参，指向子类也即匿名内部类的实参），
		// 调用的是子类重写之后的，也即匿名内部类中重写的方法
		m1(new Inter(){
			@Override
			public void method() {
				System.out.println("我是匿名内部类");
			}
		});
	}
	public static void main(String[] args) {
		AnnoInner ai = new AnnoInner();
		ai.m3();
	}
}

interface Inter{
	public abstract void method();
}
