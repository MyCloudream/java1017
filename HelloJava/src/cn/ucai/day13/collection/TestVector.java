package cn.ucai.day13.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * ArrayList �� Vector������
 * StringBuilder �� StringBuffer
 * HashMap �� Hashtable 
 * 1��ǰ���Ƴ�ʱ����
 * 2��ǰ�� ��֧�ֶ��߳� �̲߳���ȫ �첽����    ����֧�ֶ��߳� �̰߳�ȫ ͬ������
 * 3��ǰ��Ч�ʸ� ����Ч�ʵ�
 * 
 * 4�������ʽ����
 * ǰ�ߣ�for foreach Iterator ListIterator 
 * ���ߣ�for foreach Iterator ListIterator Enumeration
 * 
 * 5�����������ԣ�
 * 	ArrayList������ԭ���ȵ�1/2
 *  Vector������ԭ���ȵ�1����
 * 
 * ArrayList �� Vector ��ϵ��
 * ����List�ӿڵ�ʵ����
 */
public class TestVector {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("����");
		list.add(("����"));
		list.add("����");
		list.add("����");
		list.add("����");
		for(int i=0;i<list.size();i++){
			String s = list.get(i);
			System.out.println(s.charAt(0));
		}
	}
}
