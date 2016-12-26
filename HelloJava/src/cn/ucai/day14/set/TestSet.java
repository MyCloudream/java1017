package cn.ucai.day14.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * List集合的特点：
 * 1、元素的添加顺序和取出顺序一致（有序）
 * 2、元素可以重复
 * 3、元素可以根据get(int index)方法取出
 * 4、可以使用for取出、可以使用Iterator取出、可以使用foreach取出。
 * 5、List中查、是否包含、删除都是依据equals方法。
 * 
 * Set集合：
 * 1、元素的添加顺序和取出顺序不一致 （无序）,这里的无序不是随机。
 * 2、元素不能重复
 * 3、没有get(int index) ，不能通过for循环取出。
 * 4、可以使用Iterator，或者foreach来迭代输出
 * 
 * Object：
 * HashSet(底层是HashMap 底层是数组+链表)
 * 	 HashSet的去重原理：
 * 		先比较元素的hashcode方法，如果hashcode不一致，则认为是两个对象，则存储进来。
 * 		如果hashcode一致，则比较两个元素的equals方法，如果equals不一致，则认为是两个对象，则存储进来。
 * 		如果hashcode一致，equals也一致，则认为是同一个对象，则不存储。
 * 
 *  如果两个对象的equals相等，则两个对象的hashcode也相等。
 *  如果两个对象的hashcode相等，则两个对象的equals不一定相等。
 *  
 *  重写equals，必须重写hashCode
 *  1、这是java的常规协定,保证使用HashSet时的效率问题。
 *  2、Object的hashCode，得到内存中的地址，每个对象的内存地址是不一样的。
 *  
 *  TreeSet:(底层是TreeMap 底层是红黑树（自平衡的动态二叉树） )
 *  1、Set集合添加顺序和取出顺序不一致。对于TreeSet来说，它会将元素按照一定的顺序排序。
 *  2、TreeSet排序是按照元素的compareTo方法。
 *  3、去重也是依据compareTo方法，如果该方法返回值为0，则认为是同一个元素，则不存储。
 *  4、TreeSet中的元素，要求具有可比较性，想要有可比较性，可以：
 *  	1）、元素类实现Comparable接口，重写compareTo方法，在该方法中定义比较（排序）规则。
 *  	compareTo方法如果返回0，则表示是同一个元素，则不存储
 *  	如果返回正数，则将新加入的元素放到原元素的后面
 * 		如果返回负数，则将新加入的放到前面。
 * 		2)、让TreeSet本身具有可比较元素的能力，使用Comparetor接口。
 * 		两种方式比较：如果确定只有一种比较方式，则两者都可以。如果有多种比较方式，则使用Comparator。
 */
public class TestSet {
	public static void main(String[] args) {
		Person p1 = new Person("张三",20);
		Person p2 = new Person("李四",18);
		Person p3 = new Person("王五",20);
		Person p4 = new Person("赵六",19);
		Person p5 = new Person("田七",22);
		Person p6 = new Person("张三",20);
		Set<Person> set = new HashSet<Person>();
		set.add(p1);
		set.add(p2);
		set.add(p3);
		set.add(p4);
		set.add(p5);
		set.add(p6);
		System.out.println();
		System.out.println("----------------");
		System.out.println();
		for(Person p : set){
			System.out.println(p);
		}
	}
}
