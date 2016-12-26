package cn.ucai.day30.linkedlist;

/**
 * 单向链表
 */
public class Node<E> {
	E value;// 值
	Node<E> next;
	
	public Node() {
		super();
	}

	public Node(E value, Node<E> next) {
		super();
		this.value = value;
		this.next = next;
	}

	public E getValue() {
		return value;
	}

	public void setE(E value) {
		this.value = value;
	}

	public Node<E> getNext() {
		return next;
	}

	public void setNext(Node<E> next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "Node [value=" + value + ", next=" + next + "]";
	}
	
}
