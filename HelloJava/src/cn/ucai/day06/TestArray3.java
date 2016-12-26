package cn.ucai.day06;

import java.util.Arrays;
import java.util.Random;

/**
 * ctrl + m : （取消）全屏
 * alt + 上/下： 移动光标所在行到上/下一行
 * ctrl + d ： 删除光标所在行
 * shift + enter ： 快速跳往下一行
 * ctrl + 1 ： 快速修复
 * ctrl +shift + o : 导包（删除多余的包）
 */
public class TestArray3 {
	public static void main(String[] args) {
		Random ran = new Random();
		int score = 88;
		int[] niArr1 = {88,79,98,89,90};
		int[] niArr2 = {88,79,98,89,90};
		int[] niArr3 = {88,79,98,89,90};
		
		int[][] niArr = {
				{81,79,98,89,90},
				{82,79,98},
				{83,79,98,89}
		};
		
		System.out.println("二维长度："+niArr.length);
		for(int i=0;i<niArr.length;i++){
			System.out.println("一维长度："+niArr[i].length);
			for(int j=0;j<niArr[i].length;j++){
				System.out.print(niArr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
