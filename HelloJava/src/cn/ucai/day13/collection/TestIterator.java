package cn.ucai.day13.collection;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

/**
 * ArrayList 和 Vector的区别
 * 前者：for foreach Iterator ListIterator 
 * 后者：for foreach Iterator ListIterator Enumeration
 * 
 * 每种集合的不同，在于其底层数据结构（数据存储的方式）的不同。
 * 
 * Iterable： 可以迭代（循环取出）的 
 * 每种实现类的iterator方法，可以将本身的元素顺序取出
 * 
 * Emp   Iterable 
 * public abstract double getTotalSal();
 * public abstract Iterator iterator()
 * 
 * 1、ArrayList中的元素可以使用for循环很方便的取出，为什么还需要学习迭代器？
 * 其他集合类没办法通过for循环+下标取得，并且迭代器是一种统一的取出方式，各种集合都能使用。
 * 
 * 2、Emp是抽象类，为什么Iterable是个接口？
 * 		1)Emp 或 Iterable 能不能是一个类？不能！抽象方法是一种强制的规则。
 * 		2）当可以是抽象类也可以是接口时，我们使用接口。why？接口能够多实现，而继承是单继承。
 */
public class TestIterator {
	public static void main(String[] args) {
		List<String> list = new Vector<String>();
		list.add("张三");
		list.add(("李四"));
		list.add("王五");
		list.add("赵六");
		list.add("田七");
		
		Iterator<String> it = list.iterator();
		while(it.hasNext()){
			String s = it.next();
			if(s.equals("王五")){
				it.remove();
			}
		}
		System.out.println(list);
		/*List<String> list = new ArrayList<String>();
		list.add("张三");
		list.add(("李四"));
		list.add("王五");
		list.add("赵六");
		list.add("田七");
		
		Iterator<String> it = list.iterator();
		while(it.hasNext()){
			String s = it.next();
			System.out.println(s);
		}*/
	}
}
