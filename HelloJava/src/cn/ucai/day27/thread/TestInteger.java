package cn.ucai.day27.thread;

public class TestInteger {
	public static void main(String[] args) {
		Integer i1 = 100;
		Integer i2 = 100;
		Integer i3 = 1000; // Integer i3 = new Integer(1000)
		Integer i4 = 600;
		System.out.println(i1==i2);
		System.out.println(i3==i4);
		
		/*String str1 = new String("abc");
		String str2 = new String("abc");
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		
		String str3 = "abc";
		String str4 = "abc";
		System.out.println(str3==str4);
		System.out.println(str3.equals(str4));
		
		System.out.println(str3==str1);
		System.out.println(str3.equals(str1));*/
	}
}
