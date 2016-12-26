package cn.ucai.day09.pa8;

/**
 * 一般语句块先于构造方法运行，并且每次使用构造方法都会运行
 * 静态语句快也是先于构造方法运行，但是只运行一次。
 */
public class Student {
	public Student(){
		System.out.println("我是构造方法");
	}
	static{// 静态语句块
		System.out.println("我是静态语句块");
	}
	
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		Student s4 = new Student();
		Student s5 = new Student();
		
	}
}
