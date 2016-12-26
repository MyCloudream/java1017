package cn.ucai.day30.linkedlist;

public class TestLinkedList2 {
	public static void main(String[] args) {
		Node<String> node = createLinkedList();
		interLinkedList(node);
		// ��������ͷԪ�أ��ڵ㣩ɾ��
		System.out.println();
		System.out.println();
		node = node.next;
		interLinkedList(node);
	}
	
	// �������е�Ԫ��ȫ�����������
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
		
		node = head;// nodeָ���һ��Ԫ��
		
		return node;
	}
}