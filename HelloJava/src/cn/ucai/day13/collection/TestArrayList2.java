package cn.ucai.day13.collection;

import java.util.ArrayList;

/**
 * ArrayList的修改和删除
 * 
 * ArrayList能存储引用数据类型，也能够存储基本数据类型，但是基本数据类型是以其包装类的类型存进来的。
 * 
 * ArrayList中的查找是否包含，以及删除等方法，都是依据equals方法。
 */
public class TestArrayList2 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("one");
//		list.add(new String("two"));
		list.add(("two"));
//		list.add(new Integer(3));// Integer i = 3; Object o = i;
		list.add(3);// Integer i = 3; Object o = i;
		list.add("four");
		list.add("five");
		list.add("six");
		
		/*System.out.println(list);
		System.out.println(list.set(1, "123"));
		System.out.println(list);*/
		
		// 删除:根据下标来删除
		/*System.out.println(list);
		list.remove(3);
		System.out.println(list);*/
		
		// 根据元素来删除
		/*System.out.println(list);
		list.remove(new Integer(3));
		System.out.println(list);*/
		
		System.out.println(list);
		list.remove(new String("two"));
		System.out.println(list);
		
	}
}
