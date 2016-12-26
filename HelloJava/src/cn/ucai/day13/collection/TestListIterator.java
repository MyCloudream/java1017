package cn.ucai.day13.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class TestListIterator {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("����");
		list.add(("����"));
		list.add("����");
		list.add("����");
		list.add("����1");
		list.add("����2");
		
		ListIterator<String> it = list.listIterator();
		while(it.hasNext()){
			String s = it.next();
			if(s.equals("����")){
				it.add("one");
			}
		}
		System.out.println(list);
	}
}
