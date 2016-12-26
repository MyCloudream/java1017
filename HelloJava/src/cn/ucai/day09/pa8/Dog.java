package cn.ucai.day09.pa8;

public class Dog extends Animal{
	static int b = 4;
	static{
		System.out.println(b);
	}
	{
		b = 5;
		System.out.println(b);
	}
	public Dog(){
		super();
		b = 6;
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		Dog dog = new Dog();
		
	}
}
