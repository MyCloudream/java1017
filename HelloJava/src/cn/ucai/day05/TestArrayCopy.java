package cn.ucai.day05;

import java.util.Arrays;

public class TestArrayCopy {
	public static void main(String[] args) {
		int[] niArr1 = {3,1,8,5,4,2,7,9,6,0};
		int[] niArr2 = new int[10];
		
		// 把niArr1中的从第3个元素开始，拷贝到niArr2中，从niArr2的第5个元素开始，一共拷贝3个元素。
		/*niArr2[4] = niArr1[2];
		niArr2[5] = niArr1[3];
		niArr2[6] = niArr1[4];*/
		
		/*for(int i=0;i<3;i++){
			niArr2[4+i] = niArr1[2+i];
		}*/
		
		/*
		 * src：源数组
		 * srcPos：源数组的起始位置
		 * dest：目标数组
		 * destPos：目标数组的起始位置
		 * length：要拷贝的元素的个数
		 */
		System.out.println(Arrays.toString(niArr2));
		System.arraycopy(niArr1, 2, niArr2, 4, 3);
		System.out.println(Arrays.toString(niArr2));
		
	}
}
