package cn.ucai.day09.myfinal;

/**
 * 常量：不可变的变量
 * static final 共同修饰的变量
 * 
 * 编程规范：
 * 1、常量所有单词字母全部大写，不同单词之间使用_分割。
 */
public class Student{
	final static int a = 10;
	static final int b ;
	static{
		b = 10;
	}
	/*final static int c;
	public Person(int c){
		this.c = c;;
	}*/
	
	public static void main(String[] args) {
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Math.PI);
	}
}
