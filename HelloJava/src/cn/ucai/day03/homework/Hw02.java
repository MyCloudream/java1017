package cn.ucai.day03.homework;

/**
 * 编写程序，计算第46天是第几周零几天。
 */
public class Hw02 {
	public static void main(String[] args) {
		int days = 46;
		int week = days / 7;
		int day = days % 7;
		System.out.println(days + "是第" + week + "周的第" + day + "天");
	}
}
