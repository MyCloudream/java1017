package cn.ucai.day03;

import java.util.Scanner;

/**
 * ����ĳ��ĳ��ĳ�գ��ж���һ������һ��ĵڼ��죿 ���������꣩
 */
public class Test09 {
	public static void main(String[] args) {
		int year, mouth, day, sum = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("���������ڵ���ݣ��·����������Կո�ָ���XXXX XX XX��");
		year = scan.nextInt();
		mouth = scan.nextInt();
		day = scan.nextInt();
		switch (mouth) {
		case 12:
			sum += 30;
		case 11:
			sum += 31;
		case 10:
			sum += 30;
		case 9:
			sum += 31;
		case 8:
			sum += 31;
		case 7:
			sum += 30;
		case 6:
			sum += 31;
		case 5:
			sum += 30;
		case 4:
			sum += 31;
			// 3 15
		case 3:
			if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
				sum += 29;
			} else {
				sum += 28;
			}
		case 2:
			sum += 31;
		case 1:
			sum += day;
		}
		System.out.println("�����������" + year + "��ĵ�" + sum + "��");
	}
}
