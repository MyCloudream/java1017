package cn.ucai.day15;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * HashMap TreeMap的区别：
 * 1、HashMap的key可以看作是HashSet  TreeMap的key可以看作是TreeSet
 * 2、如果TreeMap中的key，使用了一个自定义类，则要么实现Comparable接口，要么TreeMap本身传入Comparator接口。
 * 
 * HashSet的底层是HashMap
 * TreeSet的底层是TreeMap
 * 
 */
public class TestTreeMap {
	public static void main(String[] args) {
		Map<String,String> map = new TreeMap<String,String>();
		map.put("B", "B");
		map.put("C", "C");
		map.put("D", "D");
		map.put("A", "A");
		map.put("E", "E");
		map.put("A", "A");
		map.put("C", "C");
		
		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();
		while(it.hasNext()){
			String key = it.next();
			String value = map.get(key);
			System.out.println(key + ":" + value);
		}
	}
}
