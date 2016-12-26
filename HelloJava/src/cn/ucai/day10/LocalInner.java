package cn.ucai.day10;

public class LocalInner {

	public void m() {
		class Mem {
			public void method() {
				System.out.println("我是局部内部类");
			}
		}

		Mem memClass = new Mem();
		memClass.method();
	}

	public static void main(String[] args) {
		LocalInner li = new LocalInner();
		li.m();
	}

}
