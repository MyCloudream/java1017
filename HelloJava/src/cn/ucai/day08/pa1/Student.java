package cn.ucai.day08.pa1;

/**
 * 当A extends B 时，
 * A称为子类、扩展类、派生类
 * B称为父类、超类、基类。
 * 
 * this:本类当前对象
 * 1、this.调用本类的属性或方法
 * 2、this()调用本类的其他的构造方法
 * super : 父类对象
 * 1、super.调用父类的属性或方法
 * 2、super()调用父类的构造方法
 * 
 * 1、任何构造方法的第一行，不是this([]),就是super([]),两者不能同时存在
 * 2、如果一个方法的第一行不是this([]),也不是super([]),则默认是super();
 */
public class Student extends Person{
	private String sno;
	
	public Student(){
		super();
	}
	
	public Student(String sno,String name,int age){
//		super(name,age);
		this();
		this.sno = sno;
		/*this.setName(name);
		this.setAge(age);*/
		/*super.setName(name);
		super.setAge(age);*/
	}
}
