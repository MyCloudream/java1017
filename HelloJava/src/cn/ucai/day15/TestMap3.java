package cn.ucai.day15;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestMap3 {
	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String,String>();
		map.put("name", "zhangsan");
		map.put("password", "123456");
		map.put("email", "zhangsan@ucai.cn");
		
		Set<Entry<String, String>> set = map.entrySet();
		Iterator<Entry<String, String>> it = set.iterator();
		while(it.hasNext()){
			Entry<String, String> entry = it.next();
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key+":"+value);
		}
	}
}
