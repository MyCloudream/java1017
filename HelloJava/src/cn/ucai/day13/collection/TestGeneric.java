package cn.ucai.day13.collection;

import java.util.ArrayList;

/**
 * generic������
 * 
 * ���͵ĺô���
 * 1�������������͵����ݻ��루���������ݣ�
 * 2������ǿ������ת��
 * 		1������
 * 		2��������ǿ������ת���쳣
 * 
 * () {} "" [] <> ''
 */
public class TestGeneric {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("����");// Object o = new String("����"):
		list.add(("����"));
		list.add("����");
		list.add("����");
		list.add("����");
		/*list.add(123);
		list.add(true);
		list.add(1.2);*/
		
		for(int i=0;i<list.size();i++){
			String s = list.get(i);
			System.out.println(s.charAt(0));
			// Object o = new String("����"); o.toString();
			/*Object o = list.get(i);
			String s = (String)o;
			System.out.println(s.charAt(0));
			System.out.println(s.substring(0, 1));*/
		}
	}
}
