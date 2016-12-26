package cn.ucai.day28;

import java.text.DecimalFormat;

public class TestDecimalFormat {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#.00");
		String s = df.format(1.237493274923);
		System.out.println(s);
	}
}
