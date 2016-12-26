package cn.ucai.day28.sort;

import java.util.Arrays;

/**
 * 选择排序
 */
public class TestSelect {
	public static void main(String[] args) {
		int[] niArr = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
		// 第一轮：
		for(int k=0;k<niArr.length-1;k++){
			int min = niArr[k];
			int minIndex = k;
			for(int i=(k+1);i<niArr.length;i++){
				if(niArr[i]<min){
					min = niArr[i];
					minIndex = i;
				}
			}
			// 最小数和第一个数交换
			int temp = niArr[k];
			niArr[k] = niArr[minIndex];
			niArr[minIndex] = temp;
			System.out.println(Arrays.toString(niArr));
		}
		
		/*// 第二轮
		min = niArr[1];
		minIndex = 1;
		for(int i=2;i<niArr.length;i++){
			if(niArr[i]<min){
				min = niArr[i];
				minIndex = i;
			}
		}
		temp = niArr[1];
		niArr[1] = niArr[minIndex];
		niArr[minIndex] = temp;
		System.out.println(Arrays.toString(niArr));
		
		// 第三轮
		min = niArr[2];
		minIndex = 2;
		for(int i=3;i<niArr.length;i++){
			if(niArr[i]<min){
				min = niArr[i];
				minIndex = i;
			}
		}
		temp = niArr[2];
		niArr[2] = niArr[minIndex];
		niArr[minIndex] = temp;
		System.out.println(Arrays.toString(niArr));*/
	}
}
