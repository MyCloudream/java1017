package cn.ucai.thread.sort;

import java.util.Arrays;

/**
 * ԭʼ���ݣ�3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48
 * 
 * 
 */
public class TestBubble2 {
	public static void main(String[] args) {
		int[] niArr = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
		
		for(int i=0;i<niArr.length-1;i++){
			if(niArr[i]>niArr[i+1]){
				int temp = niArr[i];
				niArr[i] = niArr[i+1];
				niArr[i+1] = temp;
			}
		}
		
		System.out.println(Arrays.toString(niArr));
		
		/*for(int i=0;i<niArr.length-1-1;i++){
			if(niArr[i]>niArr[i+1]){
				int temp = niArr[i];
				niArr[i] = niArr[i+1];
				niArr[i+1] = temp;
			}
		}
		
		System.out.println(Arrays.toString(niArr));
		
		for(int i=0;i<niArr.length-1-1-1;i++){
			if(niArr[i]>niArr[i+1]){
				int temp = niArr[i];
				niArr[i] = niArr[i+1];
				niArr[i+1] = temp;
			}
		}
		
		System.out.println(Arrays.toString(niArr));*/
	}
}
