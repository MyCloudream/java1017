package cn.ucai.day11.classes;

import java.math.BigDecimal;

/**
 * ���ù����ࣺ
 * BigDecimal
 * 1��С������:���ľ�ȷ����
 * 2����������
 * 
 * 1��String��StringBuilder��StringBuffer
 * 2��������ʽ
 * 3�����ڴ�����Date Calendar SimpleDateFormat
 */
public class TestBigDecimal {
	public static void main(String[] args) {
		BigDecimal bd1 = new BigDecimal("2.6");
		BigDecimal bd2 = new BigDecimal("2.0");
		double d1 = bd1.subtract(bd2).doubleValue();
		System.out.println(d1);
		
		BigDecimal bd3 = new BigDecimal(Double.MAX_VALUE);
		BigDecimal bd4 = new BigDecimal(Double.MAX_VALUE);
		System.out.println(bd3.add(bd4));
		System.out.println(bd3.subtract(bd4));
		System.out.println(bd3.multiply(bd4));
		System.out.println(bd3.divide(bd4));
	}
}
