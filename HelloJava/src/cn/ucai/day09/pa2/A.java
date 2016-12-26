package cn.ucai.day09.pa2;

public abstract class A {
	public abstract void m1();
	public abstract void m2();
	public void m3(){
		System.out.println("具体方法");
		m1();
		m2();
	}
}
