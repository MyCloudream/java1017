package cn.ucai.day13.collection;

import java.util.ArrayList;

public class TestArrayList {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("one");
		list.add("two");
		list.add(3);
		list.add("four");
		list.add("five");
		list.add("six");
		
		// 取得元素的个数
		System.out.println(list.size());
		// 取得元素
		System.out.println(list.get(1));
		// 取得全部数据
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
	}
}
