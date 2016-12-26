package cn.ucai.day14.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestForEach {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("five");
		for (String string : list) {
			System.out.println(string);
		}
	}
}
