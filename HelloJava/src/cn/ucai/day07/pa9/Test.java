package cn.ucai.day07.pa9;

public class Test {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.setName("è��");
		dog.setAge(2);
		
		Person p = new Person("�°���",60,dog);
		
		System.out.println(p.getDog().getName());
	}
}
