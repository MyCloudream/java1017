package cn.ucai.day03;

/**
 * 用三目运算判断奇偶数
 */
public class Test06 {
	public static void main(String[] args) {
		int a = -1;
		// String str = a>=0?"正数":"负数";
		// boolean f = a>=0?true:false;
		System.out.println(a % 2 == 0 ? "偶数" : "奇数");
	}
}
