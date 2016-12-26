package cn.ucai.day13.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class TestListIterator {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("张三");
		list.add(("李四"));
		list.add("王五");
		list.add("赵六");
		list.add("田七1");
		list.add("田七2");
		
		ListIterator<String> it = list.listIterator();
		while(it.hasNext()){
			String s = it.next();
			if(s.equals("李四")){
				it.add("one");
			}
		}
		System.out.println(list);
	}
}
