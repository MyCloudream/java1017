package cn.ucai.day06;

import java.util.Arrays;

public class TestArray2 {
	public static void main(String[] args) {
		// 3��һά���� ÿ����5��Ԫ��
		// 3��Ϊ��ά���ȣ�5��һά����
		int[][] arr = new int[3][5];
		
		int[] niArr = new int[5];
		/*System.out.println(Arrays.toString(niArr));
		System.out.println(niArr);
		
		System.out.println(Arrays.toString(arr));
		
		for(int i=0;i<3;i++){
			System.out.println(Arrays.toString(arr[i]));
		}*/
		
		int n = 1;
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				arr[i][j] = n ++ ;
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		for(int i=0;i<3;i++){
			System.out.println(Arrays.toString(arr[i]));
		}
		
	}
}
