package cn.ucai.day12.date;

import java.util.Date;

/**
 * �����ࣺDate
 * ���ʱ�䡢ʱ���
 * ���ʱ���÷���
 * 1�������������ʱ��
 * 2�������ļ�������Ϊ���ݿ��һ���ֶΣ���Ϊһ��Ψһ�ı�ʾ�����������������ݡ�
 * 
 * 
 * Date�����ʱ����໥ת��
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
