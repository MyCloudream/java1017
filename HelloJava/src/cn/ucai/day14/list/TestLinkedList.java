package cn.ucai.day14.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * ArrayList������
 * LinkedList��
 * 
 * ArrayList���ײ�������
 * LinkedList���ײ���˫������
 * �����ҪƵ�������ӻ�ɾ�����ݣ���ʹ��LinkedList�������Ƶ���Ĳ������ݣ���ʹ��ArrayList
 */

public class TestLinkedList {
	public static void main(String[] args) {
		List<String> list = new LinkedList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("five");
		
		Iterator<String> it = list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
 	}
}
