package cn.ucai.day05;

import java.util.Arrays;
import java.util.Random;

/**
 * java.util : 工具包
 * Arrays：是操作数组的工具类
 */
public class TestArray3 {
	public static void main(String[] args) {
		// 数组的定义
		int[] niArr = new int[10];
		Random ran = new Random();
		// 利用for循环完成数组的动态初始化
		for (int i = 0; i < niArr.length; i++) {
			niArr[i] = ran.nextInt(101);
		}

		// 数组的格式化输出
		System.out.print("[");
		for (int i = 0; i < niArr.length; i++) {
			if (i == niArr.length - 1) {
				System.out.print(niArr[i]);
			} else {
				System.out.print(niArr[i] + ", ");
			}
		}
		System.out.println("]");
		System.out.println(Arrays.toString(niArr));
	}
}
