package cn.ucai.day08.pa5;

/**
 * Java中的比较（判断）
 * 1、基本数据类型的比较，使用== 或 !=
 * 2、引用数据类型的比较
 * 		1）、使用==，比较的是堆中的内存地址
 * 		2）、使用equals
 * 			（1）、如果没有重写equals，则使用equals相当于使用==（Object中的equals按照==比较）	
 * 			（2）、如果重写了equals，则按照自己定义的比较规则比较
 * 3、引用数据类型和null比较：使用== 或 !=
 * 	
 */
public class TestPerson {
	public static void main(String[] args) {
		Person p1 = new Person("李鹏鹏",20);
		
		Person p2 = new Person("李鹏鹏2",20);
		
		Person p3 = new Person("李四",18);
		
		System.out.println(p1.equals(p2));
		
//		String s1 = new String("bye");
//		String s2 = new String("bye");
//		System.out.println(s1.equals(s2));
	}
}
