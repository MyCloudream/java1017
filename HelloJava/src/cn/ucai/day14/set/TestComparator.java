package cn.ucai.day14.set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Comparator:±È½ÏÆ÷
 */
public class TestComparator {
	public static void main(String[] args) {
		Person p1 = new Person("zhangsan", 20);
		Person p2 = new Person("lisi", 18);
		Person p3 = new Person("wangwu", 20);
		Person p4 = new Person("zhaoliu", 19);
		Person p5 = new Person("tianqi", 22);
		Person p6 = new Person("zhangfei", 20);
		
		Set<Person> set = new TreeSet<Person>(new Comparator<Person>(){
			@Override
			public int compare(Person o1, Person o2) {
				if(o1.getAge()==o2.getAge()){
					return o1.getName().compareTo(o2.getName());
				}else{
					return o1.getAge() - o2.getAge();
				}
			}
		});
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
	
	/*private static class MyComparator implements Comparator<Person>{
		@Override
		public int compare(Person o1, Person o2) {
			if(o1.getAge()==o2.getAge()){
				return o1.getName().compareTo(o2.getName());
			}else{
				return o1.getAge() - o2.getAge();
			}
		}
	}*/
}
