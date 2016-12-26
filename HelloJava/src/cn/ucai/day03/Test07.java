package cn.ucai.day03;

/**
 * 用三目运算改写三个数比大小程序。
 */
public class Test07 {
	public static void main(String[] args) {
		int a = 3;
		int b = 5;
		int c = 2;
		int max1 = (a > b ? a : b) > c ? (a > b ? a : b) : c;
		System.out.println(max1);
		int max2 = a > b ? (a > c ? a : c) : (b > c ? b : c);
		System.out.println(max2);
	}
}
