package cn.ucai.day04;

import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		System.out.println("��ӭ�����Ų������ң�����������");
		System.out.println("����������������");
		Scanner scan = new Scanner(System.in);
		String name = scan.next();
		for(;;){
			System.out.println("��˵��");
			String strInput = scan.next();
			if(strInput.equalsIgnoreCase("bye")){
				System.out.println(name+"˵��"+strInput);
				break;
			}else if(strInput.equalsIgnoreCase("���д�")){
				strInput = "******";
//				continue;
			}
			System.out.println(name+"˵��"+strInput);
		}
	}
}
