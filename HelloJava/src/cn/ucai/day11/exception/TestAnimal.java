package cn.ucai.day11.exception;

public class TestAnimal {
	public static void main(String[] args) {
		Animal a = new Cat();
		if(a instanceof Dog){
			Dog d = (Dog)a;
			d.dogMethod();
		} 
		
		
//		Dog dog = new Dog();
//		dog.dogMethod();
		
		
	}
}
