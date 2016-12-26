package cn.ucai.day07.pa6;

public class Person {
	String name;
	int age;
	public Person(){
		
	}
	public Person(String name,int age){
		this.name = name;
		this.age = age;
	}
	public void desc(){
		System.out.println(name+":"+age);
	}
}
