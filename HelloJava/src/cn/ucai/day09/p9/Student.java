package cn.ucai.day09.p9;

/**
 * 静态方法被继承
 * 静态方法没有重写,也没有多态。
 * 如果一个子类中定义了和父类静态方法一样的名字的方法，
 * 则该方法也必须为静态的。
 */
public class Student extends Person{
//	@Override  (hide)
	public static void m(){
		System.out.println("Student的静态m方法");
	}
}
