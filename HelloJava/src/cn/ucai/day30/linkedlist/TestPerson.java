package cn.ucai.day30.linkedlist;

public class TestPerson {
	public static void main(String[] args) {
		Person p = new Person("张三",20);
		
		Person p2 = p;
		p2.setAge(30);
		System.out.println(p.getAge());
		
		
		p2 = new Person("李四",20);
		p2.setAge(30);
		
		System.out.println(p.getAge());
		

		
		/*Person p3 = new Person("张小小三",5);
		
		p1.setChild(p2);
		
		p2.setChild(p3);
		
		// 输出张三的儿子的儿子的姓名
		System.out.println(p1.getChild().getChild().getName());*/
		
		
		
		
	}
}
