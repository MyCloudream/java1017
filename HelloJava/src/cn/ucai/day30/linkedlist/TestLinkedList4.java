package cn.ucai.day30.linkedlist;

/**
 * 1����ָ��ֵ�Ľڵ�ɾ����c
 * 
 */
public class TestLinkedList4 {
	public static void main(String[] args) {
		Node<String> node = createLinkedList();
		interLinkedList(node);
		// �������βԪ�أ��ڵ㣩ɾ��
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
