package cn.ucai.day04;

import java.util.Random;
import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		Random ran = new Random();
		int ni = ran.nextInt(100)+1;// [1-100]
		Scanner scan = new Scanner(System.in);
		System.out.println(ni);
		int count = 6;
		for(;;){
			System.out.println("������һ�����֣�");
			int num = scan.nextInt();
			count -- ;
			if(count==0){
				System.out.println("����������");
				break;
			}
			if(num>ni){
				System.out.println("����");
//				continue;
			}else if(num<ni){
				System.out.println("С��");
//				continue;
			}else{
				System.out.println("�¶���");
				break;
			}
			System.out.println("ʣ�������"+count);
		}
	}
}
