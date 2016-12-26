package cn.ucai.day05;

import java.util.Arrays;

// 65 50 75 62 68
public class TestArrayCopy2 {
	public static void main(String[] args) {
		/*int[] niArr1 = {3,1,8,5,4,2,7,9,6,0};
		int[] niArr2 = Arrays.copyOf(niArr1, 5);
		System.out.println(Arrays.toString(niArr2));
		
		int[] niArr3 = Arrays.copyOfRange(niArr1, 3, 6);
		System.out.println(Arrays.toString(niArr3));*/
		
		int[] niArr1 = {3,1,8,5,4,2,7,9,6,0};
		Arrays.sort(niArr1);// …˝–Ú≈≈–Ú
		System.out.println(Arrays.toString(niArr1));
		int[] niArr2 = new int[10];
		for(int i=0;i<10;i++){
			niArr2[i] = niArr1[10-1-i];
		}
		System.out.println(Arrays.toString(niArr2));
	}
}
