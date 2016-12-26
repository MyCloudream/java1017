package cn.ucai.day12.date;

import java.util.Calendar;

/**
 * Calendar和long相对时间之间的转换
 */
public class TestCalendar3 {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar.getTimeInMillis());
		
		long millis = System.currentTimeMillis();
		calendar.setTimeInMillis(millis);
	}
}
