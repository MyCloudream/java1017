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
			System.out.println("请录入姓名：");
			strNameArr[i] = scan.next();
			System.out.println("请录入分数：");
			niScoreArr[i] = scan.nextInt();
			if(niScoreArr[i]>max){
				max = niScoreArr[i];
			}
		}
		// step 3
		System.out.println("请输入要查找的姓名");
		String name = scan.next();
		for(int i=0;i<n;i++){
			if(strNameArr[i].equals(name)){
				System.out.println(name+"的分数为："+niScoreArr[i]);
			}
		}
		
		// step 4 
		for(int i=0;i<n;i++){
			if(niScoreArr[i]==max){
				System.out.println(max+"分数对应的姓名为："+strNameArr[i]);
			}
		}
	}
}
