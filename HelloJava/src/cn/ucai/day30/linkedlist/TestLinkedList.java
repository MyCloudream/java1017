package cn.ucai.day30.linkedlist;

public class TestLinkedList {
	public static void main(String[] args) {
		Node<String> node = new Node<>();
		node.value = "a";
		Node<String> head = node;// headָ���һ��Ԫ��
		node.next = new Node<>();
		node.next.value = "b";
//		node1.next = node2;
		// �ڶ���Ԫ�أ������ã���node�������Ļ���nodeָ��ڶ���Ԫ�ء�
		node = node.next;
		
		// ����̫����
//		node.next.next = new Node<>();
		node.next = new Node<>();
		node.next.value ="c";
		// nodeָ�������Ԫ��
		node = node.next;
		
		node.next = new Node<>();
		node.next.value = "d";
		// nodeָ����ĸ�Ԫ��
		node = node.next;
		
		node.next = new Node<>();
		node.next.value = "e";
		// nodeָ������Ԫ��
		node = node.next;
		
		node = head;// nodeָ���һ��Ԫ��
		System.out.println(node.value);
		
		while(node!=null){
			System.out.println(node.value);// a
			node = node.next;
		}
	}
}