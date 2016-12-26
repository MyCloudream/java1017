package cn.ucai.day07.pa4;

public class Test {
	public static void main(String[] args) {
		
		Dog dog = new Dog("猫咪",2);
		// 输出dog的名字
		System.out.println(dog.name);
		
		Person p = new Person("奥巴马",50,dog);
		// 输出奥巴马的狗的名字
		System.out.println(p.dog.name);
	}
}
