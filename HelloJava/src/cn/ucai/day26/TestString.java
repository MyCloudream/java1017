package cn.ucai.day26;

import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;

public class TestString {
	public static void main(String[] args) {
		/*String str = "�й�";
		try {
			String str2 = new String(str.getBytes("ISO-8859-1"),"utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}*/

//		String s = new String(byArr);
//		System.out.println(s);
		
		// �����ļ�   0-100
		// 100*���ص��ֽ���/���ֽ���
		
		long i = 100l*Integer.MAX_VALUE/Integer.MAX_VALUE;
		System.out.println(i);
		
		BigDecimal bg1 = new BigDecimal(Integer.MAX_VALUE);// 2.6 0.6 
		BigDecimal bg2 = new BigDecimal(Integer.MAX_VALUE);
		BigDecimal bg3 = new BigDecimal(100);
		
		int ni = bg3.multiply(bg1).divide(bg2).intValue();
		System.out.println(ni);
		
		BigDecimal bg4 = new BigDecimal("2.6");
	}
}