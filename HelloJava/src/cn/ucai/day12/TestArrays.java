package cn.ucai.day12;

import java.util.Arrays;

public class TestArrays {
	public static void main(String[] args) {
		int[] niArr = {1,2,3};
		niArr = Arrays.copyOf(niArr, 10);
		System.out.println(Arrays.toString(niArr));
	}
}
