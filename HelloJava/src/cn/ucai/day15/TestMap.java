package cn.ucai.day15;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ��ֵ��
 * 1����:put(key,value)
 * 2���ޣ�put(key,value)
 * 3��ɾ��remove(key)
 * 4����ѯ:
 * 	1)������keyȡvalue��get(key)
 *  2)��ȡ�����е�valueֵ values()
 * 	3)��ȡ�����е�key��ʹ��keySet��Ȼ����Ը���keyȡ�����е�value
 * 	4)��ȡ�����е�key��value��ʹ��entrySet
 * 
 * HashMap
 * 1������Ԫ�ص�˳���ȡ��Ԫ�ص�˳��һ��
 * 2��HashMap�е�key�����ظ�
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
