package cn.ucai.day16.exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// ¼������
		List<String> list = new ArrayList<String>();
		for(;;){
			System.out.println("��¼���ļ���");
			String str = scan.next();
			if(!"over".equals(str)){
				list.add(str);
			}else{
				break;
			}
		}
		System.out.println(list);
		// �ּ�����
		List<String> listText = new ArrayList<String>();
		List<String> listImage = new ArrayList<String>();
		List<String> listElse = new ArrayList<String>();
		
		for(int i=0;i<list.size();i++){
			String name = list.get(i);
			if(name.endsWith(".txt") || name.endsWith(".java") || name.endsWith(".json")){
				listText.add(name);
			}else if(name.endsWith(".jpg") || name.endsWith(".png") || name.endsWith(".bmp")){
				listImage.add(name);
			}else{
				listElse.add(name);
			}
		}
		System.out.print("�ı��ļ�Ϊ��");
		for(String name : listText){
			System.out.print(name+" ");
		}
		
		System.out.println();
		
		System.out.print("ͼƬ�ļ�Ϊ��");
		for(String name : listImage){
			System.out.print(name+" ");
		}
	}
}
