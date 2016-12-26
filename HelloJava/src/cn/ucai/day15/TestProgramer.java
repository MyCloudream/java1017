package cn.ucai.day15;

import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * 当同时存在Comparable（compareTo）和Comparator(compare)时，
 * 比较器Comparator生效。 
 */
public class TestProgramer {
	public static void main(String[] args) {
		
		Programer p1 = new Programer("张三",20,10);
		Programer p2 = new Programer("李四",19,8);
		Programer p3 = new Programer("王五",21,8);
		Programer p4 = new Programer("赵六",19,9);
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入一个数字：");
		String in = scan.next();
		Set<Programer> set = null;
		if("1".equals(in)){
			set = new TreeSet<Programer>(new Comparator<Programer>() {
				@Override
				public int compare(Programer o1, Programer o2) {
					return o1.getAge() - o2.getAge();
				}
			});
		}else if("2".equals(in)){
			set = new TreeSet<>(new Comparator<Programer>() {
				@Override
				public int compare(Programer o1, Programer o2) {
					if(o1.getAge()==o2.getAge()){
						return (int) (o1.getSalary() - o2.getSalary());
					}
					return o1.getAge() - o2.getAge();
				}
			});
		}
		set.add(p1);
		set.add(p2);
		set.add(p3);
		set.add(p4);
		for(Programer p : set){
			System.out.println(p);
		}
		scan.close();
	}
}
