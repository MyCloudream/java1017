package cn.ucai.day13.collection;

import java.util.ArrayList;

/**
 * ArrayList���޸ĺ�ɾ��
 * 
 * ArrayList�ܴ洢�����������ͣ�Ҳ�ܹ��洢�����������ͣ����ǻ������������������װ������ʹ�����ġ�
 * 
 * ArrayList�еĲ����Ƿ�������Լ�ɾ���ȷ�������������equals������
 */
public class TestArrayList2 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("one");
//		list.add(new String("two"));
		list.add(("two"));
//		list.add(new Integer(3));// Integer i = 3; Object o = i;
		list.add(3);// Integer i = 3; Object o = i;
		list.add("four");
		list.add("five");
		list.add("six");
		
		/*System.out.println(list);
		System.out.println(list.set(1, "123"));
		System.out.println(list);*/
		
		// ɾ��:�����±���ɾ��
		/*System.out.println(list);
		list.remove(3);
		System.out.println(list);*/
		
		// ����Ԫ����ɾ��
		/*System.out.println(list);
		list.remove(new Integer(3));
		System.out.println(list);*/
		
		System.out.println(list);
		list.remove(new String("two"));
		System.out.println(list);
		
	}
}
