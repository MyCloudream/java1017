package cn.ucai.day06;

/**
 * 练习：定义重载的add方法，完成两个int的相加，int和String的相加，String和int的相加，int和double类型的相加，三个int的相加。
 * 重载（overload）：同名不同参
 * 不同参：
 * 1、类型不同
 * 2、顺序不同
 * 3、个数不同
 * 
 * 可变长参数和其他add方法也构成重载
 * 可变长参数相当于数组，不能和数组同时存在。
 * 可变长参数只能作为参数的最后一个。
 */
public class TestOverload {
	
	public static int add(int a,int b){
		return a + b;
	}
	
	public static String add(int a,String b){
		return a + b;
	}
	
	public static String add(String a,int b){
		return a + b;
	}
	
	public static double add(int a,double b){
		return a + b;
	}
	
	public static int add(int a,int b,int c){
		return a + b + c;
	}
	
	public static int add(int a,int... ni){
		int sum = 0;
		for(int i=0;i<ni.length;i++){
			sum += ni[i];
		}
		return sum;
	}
	
	public static int add(int[] ni){
		int sum = 0;
		for(int i=0;i<ni.length;i++){
			sum += ni[i];
		}
		return sum;
	}
}
