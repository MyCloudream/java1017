package cn.ucai.day03;

import java.util.Scanner;

/**
 * ���û�����һ�����䣺 �������>25 ��������� �������>40 ��������� �������>60 ���������
 */
public class Test08 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("������һ�����䣺");
		int age = scan.nextInt();
		if (age > 60) {
			System.out.println("������");
		} else if (age > 40) {
			System.out.println("������");
		} else if (age > 25) {
			System.out.println("������");
		}
	}
}
