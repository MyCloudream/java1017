package cn.ucai.day15;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Collections��sort���������Խ�list��������ֻ�贫��һ���Ƚ������Զ���ȽϹ���Ϳ����ˡ�
 */
public class TestCollections {
	public static void main(String[] args) {
		Phone p1 = new Phone("aƻ���ֻ�", 4999);
		Phone p2 = new Phone("b��Ϊ�ֻ�", 4999);
		Phone p3 = new Phone("С���ֻ�", 3999);
		Phone p4 = new Phone("�����ֻ�", 2999);
		Phone p5 = new Phone("oppo�ֻ�", 4999);
		List<Phone> list = new ArrayList<Phone>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		list.add(p5);
		
		// ���ռ۸�����
		Collections.sort(list, new Comparator<Phone>() {
			@Override
			public int compare(Phone o1, Phone o2) {
				if(o1.getPrice()==o2.getPrice()){
					return o1.getName().compareTo(o2.getName());
				}
				return o1.getPrice() - o2.getPrice();
			}
		});
		
		for(Phone p : list){
			System.out.println(p);
		}
	}
}
