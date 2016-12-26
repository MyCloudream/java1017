package cn.ucai.day29.datastructure;

import java.util.Stack;

/**
 * ջ
 * ����
 * ����
 * ��
 * 
 * JAVA���棺
 * 1���� 2��ջ   �ڴ�����
 * 
 * ջ��Stack����˿���ɣ�  ��ջ��һ�����ݽṹ
 * ջ���Ƚ���� ����ȳ�
 * 
 * ��ջ��ѹջ�� push
 * ��ջ��pop���������Ԫ�س�ջ
 * peek����ȡ������Ԫ�أ����ǲ���ջ��
 * 
 * ջ��  ջ��
 */
public class TestStack {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		stack.push("a");
		stack.push("b");
		stack.push("c");
		stack.push("d");
		stack.push("e");
		
		while(!stack.isEmpty()){
			// ȡ��ջ����Ԫ�أ����ҽ�Ԫ�ش�ջ��ɾ������ջ��
			String s = stack.pop();
			System.out.println(s);
		}
	}
}