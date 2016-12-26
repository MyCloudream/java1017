package cn.ucai.day06;

import java.util.Arrays;

/**
 * 不规则二维数组的动态初始化：
 * 1、定义二维数组，一维长度不指定
 * 2、分别指定每一个一维数组的长度
 * 3、完成初始化
 */
public class TestArray4 {
	public static void main(String[] args) {
		int[][] niArr = new int[3][];
		niArr[0] = new int[5];
		niArr[1] = new int[3];
		niArr[2] = new int[4];
		
		niArr[0][0] = 88;
		niArr[0][1] = 79;
		niArr[1][1] = 79;
		niArr[2][3] = 89;
		
		int[] niArr2[] = new int[3][5];
		int niArr3[][] = new int[3][5];
	}
}
