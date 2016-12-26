package cn.ucai.day12.date;

import java.util.Date;

/**
 * 日期类：Date
 * 
 */
public class TestDate {
	public static void main(String[] args) {
		// 2010年8月15号
		Date date = new Date(2010-1900,8-1,15);
		date.setYear(2012-1900);
		System.out.println(date);
		
		method();
	}
	
	@Deprecated  // 已过时
	public static void method(){
		
	}
	
}
