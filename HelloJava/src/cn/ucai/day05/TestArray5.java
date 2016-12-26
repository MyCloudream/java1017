package cn.ucai.day05;

import java.util.Scanner;

public class TestArray5 {
	public static void main(String[] args) {
		int[] niArrDays = {31,28,31,30,31,30,31,31,30,31,30};
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入月份：");
		int month = scan.nextInt();
		System.out.println("请输入日期：");
		int day = scan.nextInt();
		int days = day;
		for(int i=0;i<month-1;i++){
			days += niArrDays[i];
		}
		System.out.println(days);
	}
}
