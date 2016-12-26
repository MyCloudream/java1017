package cn.ucai.day03.homework;

/**
 * 键盘输入一个整数，要求只输入四位数。然后将该数反向打印。
 * 例如：输入5327,显示7235
 */
public class Hw04 {
	public static void main(String[] args) {
		int num = 5327;
		int a = num / 1000;
		int b = num % 1000 / 100;
		int c = num % 100 / 10;
		int d = num % 10;
		num = d * 1000 + c * 100 + b * 10 + a;
		System.out.println(num);
	}
}
