package cn.ucai.day13;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDate {
	public static void main(String[] args) {
		/*Date date = new Date();
		System.out.println(date);
		// ģ�塢��ʽ������
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS E");
		// DateתΪ�ɶ��Ը��ߵ�String
		String strDate = sdf.format(date);
		System.out.println(strDate);*/
		
		String strDate2 = "2016-11-15 09:56:37";
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			Date date2 = sdf2.parse(strDate2);
			System.out.println(date2);
		} catch (ParseException e) {
			// ��ӡ�쳣�Ķ�ջ��Ϣ
			e.printStackTrace();
		}
	}
}
