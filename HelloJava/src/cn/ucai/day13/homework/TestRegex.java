package cn.ucai.day13.homework;

import java.util.Arrays;

/**
 * �����ֲ������Ϳ���ת��
 */
public class TestRegex {
	public static void main(String[] args) {
		String ip = "192$168$100$2";
		String[] strArr = ip.split("\\$");
		String $ = "abc";
		System.out.println(Arrays.toString(strArr));
	}
}
