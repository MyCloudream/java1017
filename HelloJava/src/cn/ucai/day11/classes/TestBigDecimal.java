package cn.ucai.day11.classes;

import java.math.BigDecimal;

/**
 * 常用工具类：
 * BigDecimal
 * 1、小数运算:金额的精确计算
 * 2、大数运算
 * 
 * 1、String、StringBuilder、StringBuffer
 * 2、正则表达式
 * 3、日期处理类Date Calendar SimpleDateFormat
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
