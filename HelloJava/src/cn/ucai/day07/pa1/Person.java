package cn.ucai.day07.pa1;

/**
 * ���ࣺ��ÿ���˵Ĺ�ͬ�����������
 * ֻ������˵��ȫ���๲�е����ݺ���Ϊ
 * 
 * 1�����һ������û���κι��췽������Ĭ����һ���޲ι��췽��
 * ���췽������һ������ķ���
 * 1�����ã����ڴ�������    һ�㷽�����ã���ʾһ������Ĺ���
 * 2��д���ϣ�
 * ���췽����д����
 * Ȩ�����η����������� 
 */
public class Person {
	String name;
	int age;
	
	/**
	 * �޲ι���
	 */
	public Person(){
		System.out.println("�����޲ι���");
	}
	
	public Person(String n){
		name = n;
	}
	
	public Person(String n,int a){
		name = n;
		age = a;
	}
	
	public void read(){
		System.out.println("����");
	}
	
	public void walk(){
		System.out.println("��·");
	}
	// ���ҽ��� 
	public void desc(){
		System.out.println("�ҽ�"+name+",����"+age+"��");
	}
}
