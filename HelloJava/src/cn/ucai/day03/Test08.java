package cn.ucai.day03;

import java.util.Scanner;

/**
 * 让用户输入一个年龄： 如果年龄>25 输出青年人 如果年龄>40 输出中年人 如果年龄>60 输出老年人
 */
public class Test08 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入一个年龄：");
		int age = scan.nextInt();
		if (age > 60) {
			System.out.println("老年人");
		} else if (age > 40) {
			System.out.println("中年人");
		} else if (age > 25) {
			System.out.println("青年人");
		}
	}
}
