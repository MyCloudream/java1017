package cn.ucai.day14.set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * 1、按照年龄的升序排序，如果说年龄相同，则按照姓名的字典顺序排序。
 */
public class TestTreeSet2 {
	public static void main(String[] args) {
		
		Person p1 = new Person("zhangsan", 20);
		Person p2 = new Person("lisi", 18);
		Person p3 = new Person("wangwu", 20);
		Person p4 = new Person("zhaoliu", 19);
		Person p5 = new Person("tianqi", 22);
		Person p6 = new Person("zhangfei", 20);
		
		Set<Person> set = new TreeSet<Person>();
		set.add(p1);
		set.add(p2);
		set.add(p3);
		set.add(p4);
		set.add(p5);
		set.add(p6);

		Iterator<Person> it = set.iterator();
		while (it.hasNext()) {
			Person p = it.next();
			System.out.println(p);
		}
	}
}
