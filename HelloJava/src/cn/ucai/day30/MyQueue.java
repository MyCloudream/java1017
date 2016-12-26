package cn.ucai.day30;

/**
 * 懒汉式 饿汉式
 */
public class MyQueue<E> {
	private MyStack<E> stackIn;
	private MyStack<E> stackOut;
	
	public MyQueue(){
		stackIn = new MyStack<>();
		stackOut = new MyStack<>();
	}
	
	/**
	 * 向队尾添加元素
	 */
	public void addLast(E e){
		stackIn.push(e);
	}
	
	public E removeFirst(){
		if(stackOut.isEmpty()){
			while(!stackIn.isEmpty()){
				stackOut.push(stackIn.pop());
			}
		}
		return stackOut.pop();
	}
	
	public E getFirst(){
		if(stackOut.isEmpty()){
			while(!stackIn.isEmpty()){
				stackOut.push(stackIn.pop());
			}
		}
		return stackOut.peek();
	}
	
	public boolean isEmpty(){
		return stackOut.isEmpty()&&stackIn.isEmpty();
	}
	
	public static void main(String[] args) {
		MyQueue<String> mq = new MyQueue<>();
		mq.addLast("a");
		mq.addLast("b");
		mq.addLast("c");
		mq.addLast("d");
		mq.addLast("e");
		
		System.out.println(mq.removeFirst());
		
		mq.addLast("f");
		System.out.println(mq.removeFirst());
	}
}
