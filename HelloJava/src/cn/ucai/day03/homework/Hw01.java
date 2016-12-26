package cn.ucai.day03.homework;

import java.util.Scanner;

/**
 * 编写程序，输入两个数字，输出两数之和。
 */
public class Hw01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入两个数：");
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println("两个数之和为：" + (a + b));
	}
}
