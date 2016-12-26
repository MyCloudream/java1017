package cn.ucai.day15;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestMap2 {
	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String,String>();
		map.put("name", "zhangsan");
		map.put("password", "123456");
		map.put("email", "zhangsan@ucai.cn");
		
		// 获取所有的key：keySet得到所有key的set集合
		Set<String> set = map.keySet();
		// 遍历set集合
		Iterator<String> it = set.iterator();
		while(it.hasNext()){
			// 取得每个key
			String key = it.next();
			// 通过key取value
			String value = map.get(key);
			System.out.println(key+":"+value);
		}
	}
}
