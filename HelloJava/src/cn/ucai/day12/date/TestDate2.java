package cn.ucai.day12.date;

import java.util.Date;

/**
 * 日期类：Date
 * 相对时间、时间戳
 * 相对时间用法：
 * 1、计算程序运行时间
 * 2、命名文件或者作为数据库的一个字段，作为一个唯一的标示，用于区分其他数据。
 * 
 * 
 * Date和相对时间的相互转换
 */
public class TestDate2 {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		System.out.println(date.getTime());;
		
		long l = System.currentTimeMillis();
		Date date2 = new Date(l);
		System.out.println(date2);
	}
}
