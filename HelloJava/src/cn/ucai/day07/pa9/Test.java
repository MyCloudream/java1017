package cn.ucai.day07.pa9;

public class Test {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.setName("Ã¨ßä");
		dog.setAge(2);
		
		Person p = new Person("°Â°ÍÂí",60,dog);
		
		System.out.println(p.getDog().getName());
	}
}
