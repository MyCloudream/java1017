package cn.ucai.day29.datastructure;

import java.util.ArrayList;

/**
 * 使用自定义的栈MyStack完成队列的功能。
 * 
 */
public class MyQueue<E> {
	private ArrayList<E> list;
	
	public void addLast(E e){
		list.add(e);
	}
	
	public E removeFirst(){
		/*E e = list.get(0);
		list.remove(0);
		return e;*/
		return list.remove(0);
	}
	
	public E getFirst(){
		return list.get(0);
	}
}
