package cn.ucai.day16.exam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test02 {
	public static void main(String[] args) {
		String[] arr = { "user/add", "user/get", "user/list", "user/edit", "role/add", "role/get", "role/list",
				"staff/add", "staff/edit", "staff/list","student/add","student/list" };
		
		
		
		Map<String,List<String>> map = new HashMap<String,List<String>>();
		
		for(int i=0;i<arr.length;i++){
			String[] strArr = arr[i].split("/");
			if(map.containsKey(strArr[0])){
				map.get(strArr[0]).add(strArr[1]);
			}else{
				List<String> list = new ArrayList<String>();
				list.add(strArr[1]);
				map.put(strArr[0], list);
			}
		}
		System.out.println(map);
		
		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();
		while(it.hasNext()){
			String key = it.next();
			List<String> list = map.get(key);
			System.out.print(key+":");
			for(String str : list){
				System.out.print(str+" ");
			}
			System.out.println();
		}
	}
}
