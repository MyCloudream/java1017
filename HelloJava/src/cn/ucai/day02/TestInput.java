package cn.ucai.day02;

import cn.ucai.tools.InputTools;

/**
 * java.lang : ���İ�
 * ���ڷǱ�����java.lang���е������࣬�����ʹ�þͱ����ȵ�����
 * 
 * Scanner
 * 
 */
public class TestInput {
	public static void main(String[] args) {
		System.out.println("����������������");
		String name = InputTools.getInputString();
		System.out.println("name:"+name);
		System.out.println("����������:");
		int age = InputTools.getInputInt();
		System.out.println("age:"+age);
	}
}
