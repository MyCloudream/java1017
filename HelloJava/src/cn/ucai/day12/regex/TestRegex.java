package cn.ucai.day12.regex;

import java.util.Arrays;

/**
 * ������ʽ:һ�������ݵ�У��
 * \\d ��ʾ����
 * +�ñ�ʾ�������1�����
 */
public class TestRegex {
	public static void main(String[] args) {
		String str = "abc123def34mon1jkl";
		// ת���ַ� \+�ַ�
//		System.out.println("\\d");//		String[] strArr = str.split("\\d{1,}");
//		String[] strArr = str.split("\\d+");
		String[] strArr = str.split("[0-9]{1,}");
		System.out.println(Arrays.toString(strArr));
	}
}
