package cn.ucai.day30;

import java.util.ArrayList;

public class MyStack<E> {
	private ArrayList<E> list ;
	
	public MyStack(){
		list = new ArrayList<E>();
	}
	
	/**
	 * 压栈 入栈
	 */
	public void push(E e){
		list.add(e);
	}
	
	/**
	 * 出栈：
	 * 1、得到栈顶的元素
	 * 2、删除栈顶的元素
	 */
	public E pop(){
		E e = list.get(list.size()-1);
		list.remove(list.size()-1);
		return e;
	}
	
	/**
	 * 得到栈顶元素，但是不出栈
	 */
	public E peek(){
		return list.get(list.size()-1);
	}
	
	public boolean isEmpty(){
		return list.size()==0;
	}
	
	public static void main(String[] args) {
		MyStack<String> ms = new MyStack<>();
		ms.push("a");
		ms.push("b");
		ms.push("c");
		ms.push("d");
		ms.push("e");
		while(!ms.isEmpty()){
			System.out.println(ms.pop());
		}
	}
}
