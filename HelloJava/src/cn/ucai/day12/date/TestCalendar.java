package cn.ucai.day12.date;

import java.util.Calendar;

/**
 * Calendar:日历
 * Calendar和Date之间的转换
 * 
 */
public class TestCalendar {
	public static void main(String[] args) {
		/*Calendar calendar = Calendar.getInstance();
		System.out.println(calendar);
		Date date = calendar.getTime();
		System.out.println(date);*/
		
		/*Calendar calendar = Calendar.getInstance();
		Date date = new Date(2010-1900,8-1,15);
		calendar.setTime(date);*/
		
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar.getTime());
		calendar.set(2010, 8-1, 15);
		System.out.println(calendar.getTime());
		
	}
}
