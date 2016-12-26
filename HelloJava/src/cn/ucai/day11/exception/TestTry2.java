package cn.ucai.day11.exception;

/**
 * e常用方法
 */
public class TestTry2 {
	public static void main(String[] args) {
		m1();
	}
	
	public static void m1(){
		m2();
	}
	
	public static void m2(){
		m3();
	}
	
	public static void m3(){
		try{
			int a = 2;
			int b = 0;
			System.out.println(a/b);
		}catch(ArithmeticException e){
			e.printStackTrace();
		}
	}
	
}
