package cn.ucai.day10;

public class StaticInner {
	
	public void m(){
		Mem memClass = new Mem();
		memClass.method();
	}
	
	public static void main(String[] args) {
		Mem memClass = new Mem();
		memClass.method();
	}
	
	public static class Mem{
		public void method(){
			System.out.println("我是静态内部类");
		}
	}
}
