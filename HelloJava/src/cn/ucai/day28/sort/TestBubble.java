package cn.ucai.day28.sort;

import java.util.Arrays;

/**
 * 升序 冒泡排序
 */
public class TestBubble {
	public static void main(String[] args) {
		int[] niArr = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		System.out.println(Arrays.toString(niArr));
		for (int k = 0; k < niArr.length - 1; k++) {// k控制比较的轮数
			// 第一轮 14 13 12 11 10
			for (int i = 0; i < niArr.length - 1 - k; i++) {
				if (niArr[i] > niArr[i + 1]) {
					int temp = niArr[i];
					niArr[i] = niArr[i + 1];
					niArr[i + 1] = temp;
				}
			}
			System.out.println(Arrays.toString(niArr));
		}
	}
}
