package cn.ucai.day15;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * HashMap Hashtable 的区别：
 * 1、同StringBuilder/StringBuffer ArrayList/Vector
 * 2、HashMap支持null作为key和value，而Hashtable会报NullPointerException
 * 
 * 
 */
public class TestMap4 {
	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String,String>();
		map.put("name", "zhangsan");
		map.put("password", "123456");
		map.put("email", "zhangsan@ucai.cn");
		map.put(null, null);
		// 判断是否包含key，依赖hashcode和equals方法
//		System.out.println(map.containsKey(new String("name")));
		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();
		while(it.hasNext()){
			String key = it.next();
			String value = map.get(key);
			System.out.println(key + ":" + value);
		}
	}
}
