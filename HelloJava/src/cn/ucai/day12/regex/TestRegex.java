package cn.ucai.day12.regex;

import java.util.Arrays;

/**
 * 正则表达式:一般做数据的校验
 * \\d 表示数字
 * +好表示规则出现1到多次
 */
public class TestRegex {
	public static void main(String[] args) {
		String str = "abc123def34mon1jkl";
		// 转义字符 \+字符
//		System.out.println("\\d");//		String[] strArr = str.split("\\d{1,}");
//		String[] strArr = str.split("\\d+");
		String[] strArr = str.split("[0-9]{1,}");
		System.out.println(Arrays.toString(strArr));
	}
}
