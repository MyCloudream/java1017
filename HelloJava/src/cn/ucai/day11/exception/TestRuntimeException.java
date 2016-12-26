package cn.ucai.day11.exception;

public class TestRuntimeException {
	public static void main(String[] args) throws NullPointerException{
		m1();
	}
	
	public static void m1() throws NullPointerException{
		m2();
	}
	
	public static void m2() throws NullPointerException,ArithmeticException{
		String str = null;
		System.out.println(str.charAt(0));
	}
}
