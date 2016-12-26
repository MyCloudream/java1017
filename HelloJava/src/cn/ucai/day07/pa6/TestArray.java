package cn.ucai.day07.pa6;

import java.util.Arrays;

public class TestArray {
	public static void main(String[] args) {
		// 开辟一段连续的内存空间
		int[] niArr = new int[3];
		niArr[0] = 88;
		niArr[1] = 98;
		niArr[2] = 90;
		
		int[] niArr2 = niArr;
		
		niArr2[0] = 99;
		System.out.println(Arrays.toString(niArr));
		
		System.out.println(Arrays.toString(niArr2));
		
	}
}
