package cn.ucai.day08.pa6;

public class Cat extends Animal {
	@Override
	public void eat(){
		System.out.println("小猫吃鱼");
	}
	
	public void catMethod(){
		System.out.println("cat类的其他方法");
	}
}
