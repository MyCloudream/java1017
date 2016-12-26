package cn.ucai.day03;

/**
 * 逻辑运算符
 * 位运算符
 * 1、逻辑运算符只能进行逻辑运算，位运算符可以进行逻辑运算和位运算
 * 2、逻辑运算符是短路操作，比如，对于或者（||）来说，如果前面为true，则后面部分不再计算。
 */
public class TestIf {
	public static void main(String[] args) {
		double d=2.6;
		d=2.6-2;
		System.out.println(d);
		if(d-0.6<0.0000000001){
			System.out.println("相等");
		}else{
			System.out.println("不相等");
		}

		/*int age=18;	
		boolean b=(age<=18||age++<19);
		System.out.println(age);
		System.out.println(b);*/

	}
}
