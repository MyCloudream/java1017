package cn.ucai.day09.myfinal;

public class Person {
	final int a = 10;
	final int b;
	{
		b = 10;
	}
	final int c;
	public Person(int c){
		this.c = c;;
	}
	
	public static void main(String[] args) {
		Person p = new Person(100);
//		p.c = 100;
		
		final int d = 10;
	}
}
