package cn.ucai.day14.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * �������нṹ��
 * 1��˳��
 * 2����֧
 * 3��ѭ����for while do-while
 * for while��
 * ����һ���������໥ת����һ������£�forѭ��ʹ����࣬ĳЩ����£�Ϊ�˿ɶ��Ի�ʹ��while
 */
public class TestArrayList {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("five");
		
		/*for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}*/
		// ����û�д����� ���͵Ĳ���
		/*Iterator<String> it = list.iterator();
		while(it.hasNext()){
			String s = it.next();
			System.out.println(s.charAt(0));
		}*/
		
		/*for(Iterator<String> it = list.iterator();it.hasNext();){
			String s = it.next();
			System.out.println(s);
		}*/
		// ������дҪѭ����������߼���
		// foreach ������������ѯ������
		for(String s : list){// �ײ�ԭ�����Iterator
			/*if(s.equals("one")){
				list.add("123");
			}*/
			System.out.println(s);
		}
	}
}
