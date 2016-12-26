package cn.ucai.day08.pa4;

/**
 * 使用Syso输出一个对象的时候，其实是输出其字符串形式
 * 
 * 重写Object的toString，自己定义输出规则
 */
public class TestPerson {
	public static void main(String[] args) {
		Student stu = new Student("李四",20,"1001");
		System.out.println(stu);
	}
}
