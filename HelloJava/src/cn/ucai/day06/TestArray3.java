package cn.ucai.day06;

import java.util.Arrays;
import java.util.Random;

/**
 * ctrl + m : ��ȡ����ȫ��
 * alt + ��/�£� �ƶ���������е���/��һ��
 * ctrl + d �� ɾ�����������
 * shift + enter �� ����������һ��
 * ctrl + 1 �� �����޸�
 * ctrl +shift + o : ������ɾ������İ���
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
		
		System.out.println("��ά���ȣ�"+niArr.length);
		for(int i=0;i<niArr.length;i++){
			System.out.println("һά���ȣ�"+niArr[i].length);
			for(int j=0;j<niArr[i].length;j++){
				System.out.print(niArr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
