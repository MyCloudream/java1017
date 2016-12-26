package cn.ucai.day03;

import java.util.Scanner;

/**
 * 键盘输入一个5分制的分数，根据以下评分标准给出成绩的等级 5分：优秀 4分：良好 3分：及格 0～2：不及格
 * switch：后面跟的变量的类型：
 * JDK7.0之前：<= int : byte short char int 枚举
 * JDK7.0及以后：String
 */
public class Test01 {
	public static void main(String[] args) {
		System.out.println("请输入一个成绩：");
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		String s;
		switch (score) {
		case 5:// case 当。。。的时候
			s = "优秀";
			break;// 用于结束switch语句
		case 4:
			s = "良好";
			break;
		case 3:
			s = "及格";
			break;
		case 2:
		case 1:
		case 0:
			s = "不及格";
			break;
		default:// 默认的，也即上面所有的case都不符合的时候
			s = "成绩录入有误！";
//			break;
		}
		System.out.println(s);
	}
}
