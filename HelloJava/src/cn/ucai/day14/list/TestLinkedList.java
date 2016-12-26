package cn.ucai.day14.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * ArrayList的区别：
 * LinkedList：
 * 
 * ArrayList：底层是数组
 * LinkedList：底层是双向链表
 * 如果需要频繁的增加或删除数据，就使用LinkedList，如果是频繁的查找数据，就使用ArrayList
 */

public class TestLinkedList {
	public static void main(String[] args) {
		List<String> list = new LinkedList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("five");
		
		Iterator<String> it = list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
 	}
}
