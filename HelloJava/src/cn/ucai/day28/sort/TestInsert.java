package cn.ucai.day28.sort;

import java.util.Arrays;

public class TestInsert {
	public static void main(String[] args) {
		int[] niArr = { 3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48 };
		for (int k = 1; k < niArr.length; k++) {
			int temp = niArr[k];
			int index = k;
			for (int i = index - 1; i >= 0; i--) {
				if (temp < niArr[i]) {
					niArr[i + 1] = niArr[i];
					index--;
				}else{
					break;
				}
			}
			niArr[index] = temp;
			System.out.println(Arrays.toString(niArr));
		}
	}
}
