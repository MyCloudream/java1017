package cn.ucai.day05;

import java.util.Scanner;

public class TestArray4 {
	public static void main(String[] args) {
		String[] scoreLevel = { "������", "������", "������", "����", "����", "����" };
		Scanner scan = new Scanner(System.in);
		System.out.println("���������ĳɼ���");
		int score = scan.nextInt();
		if (score >= 0 && score <= 5) {
			System.out.println("���ɼ���Ӧ�ĵȼ�Ϊ��" + scoreLevel[score]);
		} else {
			System.out.println("���벻�Ϸ�");
		}
	}
}
