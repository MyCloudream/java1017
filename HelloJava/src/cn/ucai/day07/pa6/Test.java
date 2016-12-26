package cn.ucai.day07.pa6;

/**
 * GC : 垃圾回收机制
 */
public class Test {
	public static void main(String[] args) {
		Person p1 = new Person("张三",20);
		Person p2 = p1;
		p2 = new Person("李四",25);
		System.out.println(p1.name);
		System.out.println(p2.name);
		p1.name = "王五";
		System.out.println(p1.name);
		System.out.println(p2.name);
		p1 = new Person("赵六",19);
		System.out.println(p1.name);
		/*Person p1 = new Person("张三",20);
		Person p2 = p1;
		p2.name = "李四";
		System.out.println(p1.name);
		System.out.println(p2.name);*/
		
		// 开辟堆内存空间：真实对象是存在于堆中的
		/*Person p1 = new Person("张三",20);
		Person p2 = p1;
		System.out.println(p1.name);
		System.out.println(p2.name);*/
		
	}
}
