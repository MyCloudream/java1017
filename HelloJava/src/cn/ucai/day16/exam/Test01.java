package cn.ucai.day16.exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 录入数据
		List<String> list = new ArrayList<String>();
		for(;;){
			System.out.println("请录入文件名");
			String str = scan.next();
			if(!"over".equals(str)){
				list.add(str);
			}else{
				break;
			}
		}
		System.out.println(list);
		// 分拣数据
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
		System.out.print("文本文件为：");
		for(String name : listText){
			System.out.print(name+" ");
		}
		
		System.out.println();
		
		System.out.print("图片文件为：");
		for(String name : listImage){
			System.out.print(name+" ");
		}
	}
}
