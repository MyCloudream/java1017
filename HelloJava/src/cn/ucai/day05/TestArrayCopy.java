package cn.ucai.day05;

import java.util.Arrays;

public class TestArrayCopy {
	public static void main(String[] args) {
		int[] niArr1 = {3,1,8,5,4,2,7,9,6,0};
		int[] niArr2 = new int[10];
		
		// ��niArr1�еĴӵ�3��Ԫ�ؿ�ʼ��������niArr2�У���niArr2�ĵ�5��Ԫ�ؿ�ʼ��һ������3��Ԫ�ء�
		/*niArr2[4] = niArr1[2];
		niArr2[5] = niArr1[3];
		niArr2[6] = niArr1[4];*/
		
		/*for(int i=0;i<3;i++){
			niArr2[4+i] = niArr1[2+i];
		}*/
		
		/*
		 * src��Դ����
		 * srcPos��Դ�������ʼλ��
		 * dest��Ŀ������
		 * destPos��Ŀ���������ʼλ��
		 * length��Ҫ������Ԫ�صĸ���
		 */
		System.out.println(Arrays.toString(niArr2));
		System.arraycopy(niArr1, 2, niArr2, 4, 3);
		System.out.println(Arrays.toString(niArr2));
		
	}
}
