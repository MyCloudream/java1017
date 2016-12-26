package cn.ucai.day14.set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TestTreeSet {
	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "abc";
		System.out.println(s1.compareTo(s2));
		Set<String> set = new TreeSet<String>();
		set.add("zhangsan");
		set.add("lisi");
		set.add("wangwu");
		set.add("zhaoliu");
		set.add("zhangfei");
		set.add("lisi");
		
		Iterator<String> it = set.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}
