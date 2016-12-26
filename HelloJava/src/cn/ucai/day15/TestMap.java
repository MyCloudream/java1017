package cn.ucai.day15;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 键值对
 * 1、增:put(key,value)
 * 2、修：put(key,value)
 * 3、删：remove(key)
 * 4、查询:
 * 	1)、根据key取value：get(key)
 *  2)、取出所有的value值 values()
 * 	3)、取出所有的key：使用keySet，然后可以根据key取得所有的value
 * 	4)、取出所有的key和value：使用entrySet
 * 
 * HashMap
 * 1、加入元素的顺序和取出元素的顺序不一致
 * 2、HashMap中的key不能重复
 */
public class TestMap {
	public static void main(String[] args) {
		/*String[] strArr1 = new String[10];
		String[] strArr2 = new String[]{"1","2","3"};*/
		
		Map<String,String> map = new HashMap<String,String>();
		map.put("name", "zhangsan");
		map.put("password", "123456");
		map.put("email", "zhangsan@ucai.cn");
		
		Collection<String> coll = map.values();
		String[] strArr = coll.toArray(new String[]{});
		for(int i = 0;i<strArr.length;i++){
			System.out.println(strArr[i]);
		}
		
		/*for(String value : coll){
			System.out.println("value:"+value);
		}*/
		
		/*Iterator<String> it = coll.iterator();
		while(it.hasNext()){
			System.out.println("value:"+it.next());
		}*/
		
		/*String value = map.get("name");
		System.out.println(value);*/
		
		/*System.out.println(map);
		String value = map.put("name", "lisi");
		System.out.println(value);
		System.out.println(map);*/
	}
}
