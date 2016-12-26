package cn.ucai.day07.pa4;

public class Dog {
	String name;
	int age;
	public Dog(){
		
	}
	public Dog(String name,int age){
		this.name = name;
		this.age = age;
	}
	public void desc(){
		System.out.println(name+":"+age);
	}
}
