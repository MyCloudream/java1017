package cn.ucai.day04;

import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		System.out.println("欢迎来到优才聊天室，请文明聊天");
		System.out.println("请输入您的姓名：");
		Scanner scan = new Scanner(System.in);
		String name = scan.next();
		for(;;){
			System.out.println("请说：");
			String strInput = scan.next();
			if(strInput.equalsIgnoreCase("bye")){
				System.out.println(name+"说："+strInput);
				break;
			}else if(strInput.equalsIgnoreCase("敏感词")){
				strInput = "******";
//				continue;
			}
			System.out.println(name+"说："+strInput);
		}
	}
}
