package cn.ucai.day07.pa7;

public class Person {
	
	private String name;
	private int age;
	
	public Person(){
		
	}
	
	public Person(String name,int age){
		this.name = name;
		setAge(age);
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}
	
	// ÉèÖÃÄêÁä
	public void setAge(int age){
		if(age<0 || age>=300){
			this.age = 0;
		}else{
			this.age = age;
		}
	}
	
	public int getAge(){
//		return this.age;
		return age;
	}
	
	public void desc(){
		System.out.println(name+":"+age);
	}
}
