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
		
		// ��ȡ���е�key��keySet�õ�����key��set����
		Set<String> set = map.keySet();
		// ����set����
		Iterator<String> it = set.iterator();
		while(it.hasNext()){
			// ȡ��ÿ��key
			String key = it.next();
			// ͨ��keyȡvalue
			String value = map.get(key);
			System.out.println(key+":"+value);
		}
	}
}
