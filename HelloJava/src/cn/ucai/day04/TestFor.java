package cn.ucai.day04;

/**
 * 
 * 
 * 添加或取消多行注释：
 * ctrl + shift + /
 * ctrl + shift + \
 */
public class TestFor {
	public static void main(String[] args) {
		// 1 243 243 243 243 ... 243 2
		for(int i=0/*1*/;i<10/*2*/;i++/*3*/){
			System.out.println("Hello World ");//4
		}
		
		/*int a = 2;
		// 后++，先运算，再自增
		int b = a ++ ;
		System.out.println(b);// 2
		System.out.println(a);// 3
		
		a = 2;
		// 前++，先自增，再运算
		int c = ++ a;
		System.out.println(c);
		System.out.println(a);
		
		a = 2;
		// 2 + 4 + 4 + 6
		int d = a++ + ++a + a++ + ++a ;
		System.out.println(d);
		System.out.println(a);*/
	}
}
