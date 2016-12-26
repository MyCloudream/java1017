package cn.ucai.day29.datastructure;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 实际使用当中，使用此方案。
 */
public class TestDeque {
	public static void main(String[] args) {
		Deque<String> stack = new LinkedList<>();
		stack.addFirst("a");
		stack.addFirst("b");
		stack.addFirst("c");
		stack.addFirst("d");
		stack.addFirst("e");
		
		while(!stack.isEmpty()){
			String s = stack.removeFirst();
			System.out.println(s);
		}
	}
}
