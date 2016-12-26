package cn.ucai.day07.pa8;

/**
 * alt + shift + s
 *  µÃÂ¿‡£∫javabean
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

	public void desc(){
		System.out.println(name+":"+age);
	}
}
