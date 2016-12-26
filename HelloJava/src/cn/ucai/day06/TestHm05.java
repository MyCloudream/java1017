package cn.ucai.day06;

import java.util.Arrays;
import java.util.Random;

public class TestHm05 {
	public static void main(String[] args) {
		char[] chArr = new char[62];
		// 26 A-Z
		// 26 a-z
		// 10 0-9
		for(int i=0;i<26;i++){
			chArr[i] = (char)('A'+i);
			chArr[i+26] = (char)('a'+i);
		}
		
		for(int i=0;i<10;i++){
			chArr[i+52] = (char)('0'+i);
		}
		
		System.out.println(Arrays.toString(chArr));
		
		Random ran = new Random();
		for(int j=0;j<100;j++){
			String str = "";
			for(int i=0;i<8;i++){
				int ni = ran.nextInt(chArr.length);
				char ch = chArr[ni];
				str += ch;
			}
			System.out.println("6Î»Ëæ»úÃÜÂëÎª£º"+str);
		}
	}
}
