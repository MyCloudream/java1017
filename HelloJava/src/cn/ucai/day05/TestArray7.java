package cn.ucai.day05;

import java.util.Scanner;

public class TestArray7 {
	public static void main(String[] args) {
		// step 1
		int n = 5;
		String[] strNameArr = new String[n];
		int[] niScoreArr = new int[n];

		// stpe 2
		Scanner scan = new Scanner(System.in);
		int max = 0;
		for (int i = 0; i < n; i++) {
			System.out.println("��¼��������");
			strNameArr[i] = scan.next();
			System.out.println("��¼�������");
			niScoreArr[i] = scan.nextInt();
			if(niScoreArr[i]>max){
				max = niScoreArr[i];
			}
		}
		// step 3
		System.out.println("������Ҫ���ҵ�����");
		String name = scan.next();
		for(int i=0;i<n;i++){
			if(strNameArr[i].equals(name)){
				System.out.println(name+"�ķ���Ϊ��"+niScoreArr[i]);
			}
		}
		
		// step 4 
		for(int i=0;i<n;i++){
			if(niScoreArr[i]==max){
				System.out.println(max+"������Ӧ������Ϊ��"+strNameArr[i]);
			}
		}
	}
}
