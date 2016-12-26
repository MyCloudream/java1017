package cn.ucai.day12.date;

import java.util.Calendar;

/**
 * Calendar:����
 * Calendar��Date֮���ת��
 * 
 * Calendar�еĳ����ֶΣ�
 * 
 */
public class TestCalendar2 {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar.getTime());
		calendar.set(Calendar.YEAR, 2010);
		System.out.println(calendar.getTime());
		
		System.out.println(calendar.get(Calendar.YEAR));
		System.out.println(calendar.get(Calendar.MONTH));
		System.out.println(calendar.get(Calendar.DATE));
		System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
		System.out.println(calendar.get(Calendar.HOUR_OF_DAY));// 24Сʱ��
		System.out.println(calendar.get(Calendar.MINUTE));
		System.out.println(calendar.get(Calendar.SECOND));
		
		calendar.add(Calendar.MONTH, 10);
		System.out.println(calendar.getTime());
	}
}
