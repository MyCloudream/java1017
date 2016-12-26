package cn.ucai.day08.pa6;

/**
 * 多态的表现形式：
 * 1、父类的引用指向子类的对象
 * 
 * 两条定理：（发生多态的前提下）
 * 1、只能调用父类的方法，不能调用子类的方法
 * 2、如果子类对父类的方法进行了重写，则调用的是重写之后的。
 */
public class Test {
	public static void main(String[] args) {
		// 编译器（主观认为）      运行(客观存在）
		Animal a = new Dog();
		
		a.animlMethod();
//		a.dogMethod();
		
		a.eat();
		
	}
}
