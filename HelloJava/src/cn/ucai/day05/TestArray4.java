package cn.ucai.day05;

import java.util.Scanner;

public class TestArray4 {
	public static void main(String[] args) {
		String[] scoreLevel = { "不及格", "不及格", "不及格", "及格", "良好", "优秀" };
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入您的成绩：");
		int score = scan.nextInt();
		if (score >= 0 && score <= 5) {
			System.out.println("您成绩对应的等级为：" + scoreLevel[score]);
		} else {
			System.out.println("输入不合法");
		}
	}
}
