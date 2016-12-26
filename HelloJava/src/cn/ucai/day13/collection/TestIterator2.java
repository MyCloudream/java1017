package cn.ucai.day13.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * ConcurrentModificationException:并发修改异常
 * 当迭代器在迭代的时候，如果使用集合本身操作（增、删、修）了数据，则会抛该异常。
 */
public class TestIterator2 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("张三");
		list.add(("李四"));
		list.add("王五");
		list.add("赵六");
		list.add("田七1");
		list.add("田七2");
		
		Iterator<String> it = list.iterator();
		while(it.hasNext()){
			String s = it.next();
			if(s.equals("李四")){
				list.add("one");
			}
			System.out.println(s);
		}
		
		// 2、新建多个迭代器导致死循环或者只取出偶数的元素问题。
		/*List<String> list = new ArrayList<String>();
		list.add("张三");
		list.add(("李四"));
		list.add("王五");
		list.add("赵六");
		list.add("田七1");
		list.add("田七2");
		
		Iterator<String> it = list.iterator();
		while(it.hasNext()){
			String s = it.next();
			System.out.println(s);
		}*/
		
		// 错误1、多次遍历，只定义一个it对象
		/*List<String> list = new ArrayList<String>();
		list.add("张三");
		list.add(("李四"));
		list.add("王五");
		list.add("赵六");
		list.add("田七");
		
		Iterator<String> it = list.iterator();
		while(it.hasNext()){
			String s = it.next();
			System.out.println("1:"+s);
		}
		Iterator<String> it2 = list.iterator();
		while(it2.hasNext()){
			String s = it2.next();
			System.out.println("2:"+s);
		}*/
	}
}
