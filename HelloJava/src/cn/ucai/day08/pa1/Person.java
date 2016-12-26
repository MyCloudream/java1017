package cn.ucai.day08.pa1;

/**
 * 实体类 javabean
 * 封装：是一种规范
 * 1、属性私有
 * 2、无参构造和全参构造的提供
 * 3、对外提供统一的访问方式
 */
public class Person {
	private String name;
	private int age;
	
	public Person(){
		
	}
	
	public Person(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	 public String getName(){
		 return this.name;
	 }
	 
	 public void setName(String name){
		 this.name = name;
	 }

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void desc(){
		System.out.println(name+":"+age);
	}
	
}
