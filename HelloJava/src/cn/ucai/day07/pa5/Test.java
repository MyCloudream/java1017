package cn.ucai.day07.pa5;

public class Test {
	public static void main(String[] args) {
		Person p3 = new Person();
		p3.name = "张小小三";
		p3.age = 2;
		
		Person p2 = new Person("张小三",25,p3);
		
		Person p1 = new Person("张三",60,p2);
		
		// 张三的儿子的姓名
		System.out.println(p1.person.name);
		// 张三的儿子的儿子的姓名
		System.out.println(p1.person.person.name);
	}
}
