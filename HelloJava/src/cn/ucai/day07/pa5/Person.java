package cn.ucai.day07.pa5;

public class Person {
	String name;
	int age;
	Person person;
	public Person(){
		
	}
	public Person(String name,int age,Person person){
		this.name = name;
		this.age = age;
		this.person = person;
	}
	public void desc(){
		System.out.println(name+":"+age);
	}
}
