package cn.ucai.day30.linkedlist;

public class TestLinkedList {
	public static void main(String[] args) {
		Node<String> node = new Node<>();
		node.value = "a";
		Node<String> head = node;// head指向第一个元素
		node.next = new Node<>();
		node.next.value = "b";
//		node1.next = node2;
		// 第二个元素（的引用）给node，这样的话，node指向第二个元素。
		node = node.next;
		
		// 这样太长了
//		node.next.next = new Node<>();
		node.next = new Node<>();
		node.next.value ="c";
		// node指向第三个元素
		node = node.next;
		
		node.next = new Node<>();
		node.next.value = "d";
		// node指向第四个元素
		node = node.next;
		
		node.next = new Node<>();
		node.next.value = "e";
		// node指向第五个元素
		node = node.next;
		
		node = head;// node指向第一个元素
		System.out.println(node.value);
		
		while(node!=null){
			System.out.println(node.value);// a
			node = node.next;
		}
	}
}
