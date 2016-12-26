package cn.ucai.day14.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 程序运行结构：
 * 1、顺序
 * 2、分支
 * 3、循环：for while do-while
 * for while：
 * 两者一样，可以相互转换，一般情况下，for循环使用最多，某些情况下，为了可读性会使用while
 */
public class TestArrayList {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("five");
		
		/*for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}*/
		// 泛型没有传递性 泛型的擦除
		/*Iterator<String> it = list.iterator();
		while(it.hasNext()){
			String s = it.next();
			System.out.println(s.charAt(0));
		}*/
		
		/*for(Iterator<String> it = list.iterator();it.hasNext();){
			String s = it.next();
			System.out.println(s);
		}*/
		// ：后面写要循环的数组或者集合
		// foreach 用来遍历（查询）数据
		for(String s : list){// 底层原理就是Iterator
			/*if(s.equals("one")){
				list.add("123");
			}*/
			System.out.println(s);
		}
	}
}
