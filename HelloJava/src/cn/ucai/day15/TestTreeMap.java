package cn.ucai.day15;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * HashMap TreeMap������
 * 1��HashMap��key���Կ�����HashSet  TreeMap��key���Կ�����TreeSet
 * 2�����TreeMap�е�key��ʹ����һ���Զ����࣬��Ҫôʵ��Comparable�ӿڣ�ҪôTreeMap������Comparator�ӿڡ�
 * 
 * HashSet�ĵײ���HashMap
 * TreeSet�ĵײ���TreeMap
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
