package cn.ucai.day04;

import java.util.Scanner;

public class Test12 {
	public static void main(String[] args) {
		System.out.println("���������ڣ�");
		String week = new Scanner(System.in).nextLine();
		if (week.charAt(0) == 'M') {
			System.out.println("��һ");
		} else if (week.charAt(0) == 'T') {
			if (week.charAt(1) == 'u') {
				System.out.println("�ܶ�");
			} else if (week.charAt(1) == 'h') {
				System.out.println("����");
			}
		} else if (week.charAt(0) == 'W') {
			System.out.println("����");
		} else if (week.charAt(0) == 'F') {
			System.out.println("����");
		} else if (week.charAt(0) == 'S') {
			if (week.charAt(1) == 'a') {
				System.out.println("����");
			} else if (week.charAt(1) == 'u') {
				System.out.println("����");
			}
		}
	}
}
