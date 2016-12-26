package cn.ucai.day29.datastructure;

import java.util.Deque;
import java.util.LinkedList;

/**
 * ���У��Ƚ��ȳ���һ�����ݽṹ���������ݶ��ǴӶ�β���롣
 * �Ƚ��ȳ� ������
 */
public class TestQueue {
	public static void main(String[] args) {
		Deque<String> queue = new LinkedList<>();
		queue.addLast("a");
		queue.addLast("b");
		queue.addLast("c");
		queue.addLast("d");
		queue.addLast("e");
		
		while(!queue.isEmpty()){
			// 1�����Ҷ�ͷԪ�� 2��ɾ����ͷԪ��
			String s = queue.removeFirst();
			System.out.println(s);
		}
	}
}
