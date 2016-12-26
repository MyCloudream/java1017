package cn.ucai.day30.linkedlist;

public class Person {
	private String name;
	private int age;
	private Person child;
	public Person() {
		super();
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Person(String name, int age,Person child) {
		super();
		this.name = name;
		this.age = age;
		this.child = child;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public Person getChild() {
		return child;
	}
	public void setChild(Person child) {
		this.child = child;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", child=" + child + "]";
	}
	
}
