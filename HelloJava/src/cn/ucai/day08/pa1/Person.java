package cn.ucai.day08.pa1;

/**
 * ʵ���� javabean
 * ��װ����һ�ֹ淶
 * 1������˽��
 * 2���޲ι����ȫ�ι�����ṩ
 * 3�������ṩͳһ�ķ��ʷ�ʽ
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
