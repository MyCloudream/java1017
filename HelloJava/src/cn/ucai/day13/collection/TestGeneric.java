package cn.ucai.day13.collection;

import java.util.ArrayList;

/**
 * generic：泛型
 * 
 * 泛型的好处：
 * 1、避免其他类型的数据混入（避免脏数据）
 * 2、避免强制类型转换
 * 		1）、简单
 * 		2）、避免强制类型转换异常
 * 
 * () {} "" [] <> ''
 */
public class TestGeneric {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("张三");// Object o = new String("张三"):
		list.add(("李四"));
		list.add("王五");
		list.add("赵六");
		list.add("田七");
		/*list.add(123);
		list.add(true);
		list.add(1.2);*/
		
		for(int i=0;i<list.size();i++){
			String s = list.get(i);
			System.out.println(s.charAt(0));
			// Object o = new String("张三"); o.toString();
			/*Object o = list.get(i);
			String s = (String)o;
			System.out.println(s.charAt(0));
			System.out.println(s.substring(0, 1));*/
		}
	}
}
