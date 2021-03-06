package cn.ucai.day26.gene;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import cn.ucai.day26.reflex.Person;

public class TestTreeSet {
	public static void main(String[] args) {
		Person p1 = new Person("zhangsan",20);
		Person p2 = new Person("lisi",21);
		Person p3 = new Person("wangwu",22);
		Person p4 = new Person("zhaoliu",20);
		
		Set<Person> set = new TreeSet<Person>(new Comparator<Person>(){
			@Override
			public int compare(Person o1, Person o2) {
				return 0;
			}});
		
		set.add(p1);
		set.add(p2);
		set.add(p3);
		set.add(p4);
		
		Iterator<Person> it = set.iterator();
		while(it.hasNext()){
			Person p = it.next();
			System.out.println(p);
		}
	}
}
