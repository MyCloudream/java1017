package cn.ucai.day03;

import java.util.Scanner;

/**
 * 输入某年某月某日，判断这一天是这一年的第几天？ （考虑闰年）
 */
public class Test09 {
	public static void main(String[] args) {
		int year, mouth, day, sum = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入日期的年份，月份与天数，以空格分隔（XXXX XX XX）");
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
		System.out.println("输入的日期是" + year + "年的第" + sum + "天");
	}
}
