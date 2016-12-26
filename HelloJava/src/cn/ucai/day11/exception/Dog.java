package cn.ucai.day11.exception;

public class Dog extends Animal{

	@Override
	public void eat() {
		System.out.println("dog");
	}
	
	public void dogMethod(){
		System.out.println("dog的一般方法");
	}

}
