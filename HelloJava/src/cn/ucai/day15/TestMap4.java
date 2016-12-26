package cn.ucai.day15;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * HashMap Hashtable ������
 * 1��ͬStringBuilder/StringBuffer ArrayList/Vector
 * 2��HashMap֧��null��Ϊkey��value����Hashtable�ᱨNullPointerException
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
		// �ж��Ƿ����key������hashcode��equals����
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
