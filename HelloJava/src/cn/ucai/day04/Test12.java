package cn.ucai.day04;

import java.util.Scanner;

public class Test12 {
	public static void main(String[] args) {
		System.out.println("请输入星期：");
		String week = new Scanner(System.in).nextLine();
		if (week.charAt(0) == 'M') {
			System.out.println("周一");
		} else if (week.charAt(0) == 'T') {
			if (week.charAt(1) == 'u') {
				System.out.println("周二");
			} else if (week.charAt(1) == 'h') {
				System.out.println("周四");
			}
		} else if (week.charAt(0) == 'W') {
			System.out.println("周三");
		} else if (week.charAt(0) == 'F') {
			System.out.println("周五");
		} else if (week.charAt(0) == 'S') {
			if (week.charAt(1) == 'a') {
				System.out.println("周六");
			} else if (week.charAt(1) == 'u') {
				System.out.println("周日");
			}
		}
	}
}
