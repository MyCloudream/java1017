package cn.ucai.day13.homework;

import java.util.Arrays;

/**
 * 如果拆分不开，就考虑转义
 */
public class TestRegex {
	public static void main(String[] args) {
		String ip = "192$168$100$2";
		String[] strArr = ip.split("\\$");
		String $ = "abc";
		System.out.println(Arrays.toString(strArr));
	}
}
