package cn.ucai.day05;

import java.util.Arrays;
import java.util.Random;

public class TestArray6 {
	public static void main(String[] args) {
		int[] niArr = new int[10];
		Random ran = new Random();
		int sum = 0;
		for(int i = 0;i < niArr.length;i ++){
			// [0-40]+60
			niArr[i] = ran.nextInt(41)+60;
			sum += niArr[i];
		}
		System.out.println(Arrays.toString(niArr));
		
		int niAvg = sum/niArr.length;
		System.out.println(niAvg);
		
		for(int i=0;i<niArr.length;i++){
			if(niArr[i]>niAvg){
				System.out.println(niArr[i]+":"+i);
			}
		}
	}
}
