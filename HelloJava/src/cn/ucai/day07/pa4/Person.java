package cn.ucai.day07.pa4;

public class Person {
	String name;
	int age;
	Dog dog;
	public Person(){
		
	}
	public Person(String name,int age,Dog dog){
		this.name = name;
		this.age = age;
		this.dog = dog;
	}
	public void desc(){
		System.out.println(name+":"+age);
	}
}
