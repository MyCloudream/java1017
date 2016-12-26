package cn.ucai.day02;

/**
 * boolean：布尔类型
 * char : 字符型
 * 
 * 编码方式：GBK GB2312
 * 中 == 0011
 * 国 == 0010
 * 
 * char使用的就是unicode编码
 * char有数字和字符的双重特性，可以进行数学运算。
 */
public class TestDataType {
	public static void main(String[] args) {
		/*int a = 2;
		double d = 2.0;
		double n = a + d;*/
		
		char b1 = 3;
		short b2 = 5;
		int b3 = b1 + b2;
		
		double d = 2d;
		
		int n = 20013;
		char ch = (char)n;
		System.out.println(ch);
		/*
		int n1 = 2;
		byte b = (byte)n1;
		System.out.println(b);
		
		double d1 = 2.0;
		int n2 = (int)d1;
		System.out.println(n2);*/
	/*	
		byte b = 127;
		int a = b;
		char ch = '中';
		int n = ch;
		System.out.println(ch+1);
		long l1 = 10000000000000000L;
		
		
		double d1 = 2.0;
		float f1 = 2.0f;*/
		
		
		/*String str1 = "abc";
		char ch  = '三';
		System.out.println(ch+1);
		char ch2 = '\u2E3D';
		System.out.println(ch2+1);*/
		
		
	}
}
