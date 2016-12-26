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
			System.out.println("请输入一个数字：");
			int num = scan.nextInt();
			count -- ;
			if(count==0){
				System.out.println("次数用完了");
				break;
			}
			if(num>ni){
				System.out.println("大了");
//				continue;
			}else if(num<ni){
				System.out.println("小了");
//				continue;
			}else{
				System.out.println("猜对了");
				break;
			}
			System.out.println("剩余次数："+count);
		}
	}
}
