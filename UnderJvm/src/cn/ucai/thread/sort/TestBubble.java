package cn.ucai.thread.sort;

import java.util.Arrays;

public class TestBubble {
	public static void main(String[] args) {
		int[] niArr = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		for (int k = 0; k < niArr.length - 1; k++) {
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
