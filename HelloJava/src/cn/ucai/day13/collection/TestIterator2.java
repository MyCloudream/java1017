package cn.ucai.day13.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * ConcurrentModificationException:�����޸��쳣
 * ���������ڵ�����ʱ�����ʹ�ü��ϱ������������ɾ���ޣ������ݣ�����׸��쳣��
 */
public class TestIterator2 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("����");
		list.add(("����"));
		list.add("����");
		list.add("����");
		list.add("����1");
		list.add("����2");
		
		Iterator<String> it = list.iterator();
		while(it.hasNext()){
			String s = it.next();
			if(s.equals("����")){
				list.add("one");
			}
			System.out.println(s);
		}
		
		// 2���½����������������ѭ������ֻȡ��ż����Ԫ�����⡣
		/*List<String> list = new ArrayList<String>();
		list.add("����");
		list.add(("����"));
		list.add("����");
		list.add("����");
		list.add("����1");
		list.add("����2");
		
		Iterator<String> it = list.iterator();
		while(it.hasNext()){
			String s = it.next();
			System.out.println(s);
		}*/
		
		// ����1����α�����ֻ����һ��it����
		/*List<String> list = new ArrayList<String>();
		list.add("����");
		list.add(("����"));
		list.add("����");
		list.add("����");
		list.add("����");
		
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
