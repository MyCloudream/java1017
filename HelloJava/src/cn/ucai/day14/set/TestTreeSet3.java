package cn.ucai.day14.set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TestTreeSet3 {
	public static void main(String[] args) {
		Set<String> set = new TreeSet<String>();
		set.add("D");
		set.add("B");
		set.add("A");
		set.add("C");
		set.add("E");
		set.add("A");
		set.add("E");
		
		Iterator<String> it = set.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}
