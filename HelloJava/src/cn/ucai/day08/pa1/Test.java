package cn.ucai.day08.pa1;

/**
 * 一般方法被继承
 * 属性被继承，但是受private的访问限制
 * 但是可以通过一般方法访问属性
 * 构造方法不被继承
 * 
 * 构造方法：用于创建对象
 */
public class Test {
	public static void main(String[] args) {
		Student stu = new Student("1001","张三",20);
		stu.desc();
	}
}
