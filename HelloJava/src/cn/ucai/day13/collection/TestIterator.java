package cn.ucai.day13.collection;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

/**
 * ArrayList �� Vector������
 * ǰ�ߣ�for foreach Iterator ListIterator 
 * ���ߣ�for foreach Iterator ListIterator Enumeration
 * 
 * ÿ�ּ��ϵĲ�ͬ��������ײ����ݽṹ�����ݴ洢�ķ�ʽ���Ĳ�ͬ��
 * 
 * Iterable�� ���Ե�����ѭ��ȡ������ 
 * ÿ��ʵ�����iterator���������Խ������Ԫ��˳��ȡ��
 * 
 * Emp   Iterable 
 * public abstract double getTotalSal();
 * public abstract Iterator iterator()
 * 
 * 1��ArrayList�е�Ԫ�ؿ���ʹ��forѭ���ܷ����ȡ����Ϊʲô����Ҫѧϰ��������
 * ����������û�취ͨ��forѭ��+�±�ȡ�ã����ҵ�������һ��ͳһ��ȡ����ʽ�����ּ��϶���ʹ�á�
 * 
 * 2��Emp�ǳ����࣬ΪʲôIterable�Ǹ��ӿڣ�
 * 		1)Emp �� Iterable �ܲ�����һ���ࣿ���ܣ����󷽷���һ��ǿ�ƵĹ���
 * 		2���������ǳ�����Ҳ�����ǽӿ�ʱ������ʹ�ýӿڡ�why���ӿ��ܹ���ʵ�֣����̳��ǵ��̳С�
 */
public class TestIterator {
	public static void main(String[] args) {
		List<String> list = new Vector<String>();
		list.add("����");
		list.add(("����"));
		list.add("����");
		list.add("����");
		list.add("����");
		
		Iterator<String> it = list.iterator();
		while(it.hasNext()){
			String s = it.next();
			if(s.equals("����")){
				it.remove();
			}
		}
		System.out.println(list);
		/*List<String> list = new ArrayList<String>();
		list.add("����");
		list.add(("����"));
		list.add("����");
		list.add("����");
		list.add("����");
		
		Iterator<String> it = list.iterator();
		while(it.hasNext()){
			String s = it.next();
			System.out.println(s);
		}*/
	}
}
