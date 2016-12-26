package cn.ucai.day13.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * ArrayList 和 Vector的区别
 * StringBuilder 和 StringBuffer
 * HashMap 和 Hashtable 
 * 1、前者推出时间晚
 * 2、前者 不支持多线程 线程不安全 异步处理    后者支持多线程 线程安全 同步处理
 * 3、前者效率高 后者效率低
 * 
 * 4、输出方式区别：
 * 前者：for foreach Iterator ListIterator 
 * 后者：for foreach Iterator ListIterator Enumeration
 * 
 * 5、自增长策略：
 * 	ArrayList是增加原长度的1/2
 *  Vector是增加原长度的1倍。
 * 
 * ArrayList 和 Vector 联系：
 * 都是List接口的实现类
 */
public class TestVector {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("张三");
		list.add(("李四"));
		list.add("王五");
		list.add("赵六");
		list.add("田七");
		for(int i=0;i<list.size();i++){
			String s = list.get(i);
			System.out.println(s.charAt(0));
		}
	}
}
