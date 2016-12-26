package cn.ucai.day07.pa1;

public class TestPerson {
	public static void main(String[] args) {
		// new Person();创建对象
		// new + 构造方法：用于创建对象
		// p：对象的引用
		Person p = new Person();
		p.name = "张三";
		p.age = 20;
		
		p.desc();
		
		
		Person p2 = new Person("李四",30);
		p2.desc();
		
		Person p3 = new Person("王五");
		p3.age = 25;
		p3.desc();
	}
}
