package cn.ucai.day15;

import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestCollections2 {
	public static void main(String[] args) {
		String[] strArr = new File("E:\\优才学院\\20161017\\day14集合\\").list();
		List<String> list = Arrays.asList(strArr);
		Collections.sort(list,new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				int n1 = Integer.parseInt(o1.substring(0,o1.indexOf("、")));
				int n2 = Integer.parseInt(o2.substring(0,o2.indexOf("、")));
				return -(n1 - n2);
			}
		});
		for(String s : list){
			System.out.println(s);
		}
	}
}
