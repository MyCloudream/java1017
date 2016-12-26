package cn.ucai.day07;

import java.util.Arrays;

public class TestString {
	public static void main(String[] args) {
		String str = "abcdef";
		char[] chArr = new char[str.length()];
		for(int i=0;i<str.length();i++){
			chArr[i] = str.charAt(i);
		}
		System.out.println(Arrays.toString(chArr));
//		char[] chArr = str.toCharArray();
//		System.out.println(Arrays.toString(chArr));
		/*String str = "abc2def2mon2jkl";
		String[] strArr = str.split("2");// °´ÕÕ2À´²ð·Ö
		System.out.println(Arrays.toString(strArr));*/
		/*String str1 = "abc";
		String str2 = "abc";
		System.out.println(str1.compareTo(str2));
		
		System.out.println(str1.equals(str2));// true/false
*/	
		
	
	}
}
