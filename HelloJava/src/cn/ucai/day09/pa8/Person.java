package cn.ucai.day09.pa8;

/**
 * static修饰的属性，为所有对象共享。
 * 一般属性或方法是属于某个个体（对象）的
 * static修饰的属性属于所有对象，是类的
 */
public class Person {
	int age;
	static int a;
	public Person(){
		age ++ ;
		a ++;
	}
	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person();
		Person p4 = new Person();
		
		System.out.println(p1.age);
		System.out.println(p1.a);
		System.out.println(p2.age);
		System.out.println(p2.a);
		System.out.println(p3.age);
		System.out.println(p3.a);
		System.out.println(p4.age);
		System.out.println(p4.a);
	}
}
