package cn.ucai.day12.date;

import java.util.Date;

/**
 * �����ࣺDate
 * 
 */
public class TestDate {
	public static void main(String[] args) {
		// 2010��8��15��
		Date date = new Date(2010-1900,8-1,15);
		date.setYear(2012-1900);
		System.out.println(date);
		
		method();
	}
	
	@Deprecated  // �ѹ�ʱ
	public static void method(){
		
	}
	
}
