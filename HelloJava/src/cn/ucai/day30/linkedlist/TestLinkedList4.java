package cn.ucai.day30.linkedlist;

/**
 * 1、把指定值的节点删除：c
 * 
 */
public class TestLinkedList4 {
	public static void main(String[] args) {
		Node<String> node = createLinkedList();
		interLinkedList(node);
		// 把链表的尾元素（节点）删除
		System.out.println();
		System.out.println();
		Node<String> preNode = node;
		Node<String> head = node;
		while(node.next!=null){
			preNode = node;
			node = node.next;
			if(node.value.equals("c")){
				break;
			}
		}
		preNode.next = node.next;
		interLinkedList(head);
	}
	
	
	
	// 将链表中的元素全部迭代输出。
	public static void interLinkedList(Node<String> node){
		while(node!=null){
			System.out.println(node.value);// a
			node = node.next;
		}
	}
	
	public static Node<String> createLinkedList(){
		Node<String> node = new Node<>();
		node.value = "a";
		Node<String> head = node;
		node.next = new Node<>();
		node.next.value = "b";
		node = node.next;
		
		node.next = new Node<>();
		node.next.value ="c";
		node = node.next;
		
		node.next = new Node<>();
		node.next.value = "d";
		node = node.next;
		
		node.next = new Node<>();
		node.next.value = "e";
		node = node.next;
		
		node = head;// node指向第一个元素
		
		return node;
	}
}
