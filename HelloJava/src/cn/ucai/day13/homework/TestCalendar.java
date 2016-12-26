package cn.ucai.day13.homework;

import java.util.Calendar;

public class TestCalendar {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		long l1 = cal.getTimeInMillis();
		
		Calendar cal2 = Calendar.getInstance();
		cal2.setTimeInMillis(l1);
		cal2.set(Calendar.YEAR, 2016);
		cal2.set(Calendar.MONTH, 11-1);
		cal2.set(Calendar.DATE, 1);
		long l2 = cal2.getTimeInMillis();
		
		Calendar cal3 = Calendar.getInstance();
		cal3.setTimeInMillis(l1);
		cal3.set(Calendar.YEAR, 2010);
		cal3.set(Calendar.MONTH, 8-1);
		cal3.set(Calendar.DATE, 15);
		
		long l3 = cal3.getTimeInMillis();
		
		
		long days = (l2-l3)/(24*60*60*1000);
		System.out.println(days);
	}
}
