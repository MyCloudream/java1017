package cn.ucai.day05;

import java.util.Arrays;
import java.util.Random;

/**
 * java.util : ���߰�
 * Arrays���ǲ�������Ĺ�����
 */
public class TestArray3 {
	public static void main(String[] args) {
		// ����Ķ���
		int[] niArr = new int[10];
		Random ran = new Random();
		// ����forѭ���������Ķ�̬��ʼ��
		for (int i = 0; i < niArr.length; i++) {
			niArr[i] = ran.nextInt(101);
		}

		// ����ĸ�ʽ�����
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
