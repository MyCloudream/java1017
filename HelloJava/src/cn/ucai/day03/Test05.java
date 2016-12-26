package cn.ucai.day03;

/**
 * 键盘输入javase、android和javaee三科分数，找出其中最高分。
 */
public class Test05 {
	public static void main(String[] args) {
		int a = 3;
		int b = 5;
		int c = 2;
		int max = a;
		if (max < b) {
			max = b;
		}
		if (max < c) {
			max = c;
		}
		System.out.println("最大值：" + max);

		System.out.println(Math.max(Math.max(a, b), c));// 最大值
		System.out.println(Math.min(Math.min(a, b), c));// 最小值
		System.out.println(a + b + c - Math.max(Math.max(a, b), c) - Math.min(Math.min(a, b), c));// 中间值
	}
}
