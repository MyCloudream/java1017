package cn.ucai.day29.datastructure;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 队列：先进先出的一种数据结构，并且数据都是从队尾加入。
 * 先进先出 后进后出
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
			// 1、查找队头元素 2、删除队头元素
			String s = queue.removeFirst();
			System.out.println(s);
		}
	}
}
