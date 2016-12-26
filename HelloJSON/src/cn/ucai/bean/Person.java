package cn.ucai.bean;

import java.util.List;

public class Person {
	private String name;
	private int age;
	private List<Address> list;
	public Person() {
		super();
	}
	public Person(String name, int age,List<Address> list) {
		super();
		this.name = name;
		this.age = age;
		this.list = list;
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
	
	public List<Address> getList() {
		return list;
	}
	public void setList(List<Address> list) {
		this.list = list;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", list=" + list + "]";
	}
	
}
