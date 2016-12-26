package cn.ucai.day07.pa2;

/**
 * 在没有其他构造方法的时候，默认有一个无参构造
 * 其他构造方法提供之后，不再有默认无参构造。
 * 
 * 局部变量必须初始化才能使用
 * 属性有默认初始化
 *
 * this：表示本类对象，外部哪个对象来调，this就指谁。
 * this是外部对象在本类内部的表示。
 * 用法：
 * 1、使用this.来调用本类的属性或方法
 * 2、this([参数])用于调用其他的构造方法，
 * 在使用过程中，要避免死循环问题。
 * 
 * 
 */
public class Person {
	String name;
	int age;
	
	public Person(){
//		this("张三",20);
	}
	
	public Person(String name){
//		this();
		this.name = name;
	}
	
	// 全参构造
	public Person(String name,int age){
//		this("张三");
		this.name = name;
		this.age = age;
	}
	
	public void desc(){
		System.out.println("我叫"+this.name+
				",今年"+this.age+"岁");
	}
}
