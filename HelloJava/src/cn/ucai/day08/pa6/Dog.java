package cn.ucai.day08.pa6;

public class Dog extends Animal {
	@Override
	public void eat(){
		System.out.println("小狗吃骨头");
	}
	
	public void dogMethod(){
		System.out.println("Dog类的其他方法");
	}
}
