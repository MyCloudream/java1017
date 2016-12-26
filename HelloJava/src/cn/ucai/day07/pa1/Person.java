package cn.ucai.day07.pa1;

/**
 * 人类：有每个人的共同特征抽象而来
 * 只是用于说明全人类共有的数据和行为
 * 
 * 1、如果一个类中没有任何构造方法，则默认有一个无参构造方法
 * 构造方法：是一种特殊的方法
 * 1、作用：用于创建对象    一般方法作用：表示一个具体的功能
 * 2、写法上：
 * 构造方法的写法：
 * 权限修饰符　＋　类名 
 */
public class Person {
	String name;
	int age;
	
	/**
	 * 无参构造
	 */
	public Person(){
		System.out.println("我是无参构造");
	}
	
	public Person(String n){
		name = n;
	}
	
	public Person(String n,int a){
		name = n;
		age = a;
	}
	
	public void read(){
		System.out.println("读书");
	}
	
	public void walk(){
		System.out.println("走路");
	}
	// 自我介绍 
	public void desc(){
		System.out.println("我叫"+name+",今年"+age+"岁");
	}
}
