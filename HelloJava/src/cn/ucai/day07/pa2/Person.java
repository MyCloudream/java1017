package cn.ucai.day07.pa2;

/**
 * ��û���������췽����ʱ��Ĭ����һ���޲ι���
 * �������췽���ṩ֮�󣬲�����Ĭ���޲ι��졣
 * 
 * �ֲ����������ʼ������ʹ��
 * ������Ĭ�ϳ�ʼ��
 *
 * this����ʾ��������ⲿ�ĸ�����������this��ָ˭��
 * this���ⲿ�����ڱ����ڲ��ı�ʾ��
 * �÷���
 * 1��ʹ��this.�����ñ�������Ի򷽷�
 * 2��this([����])���ڵ��������Ĺ��췽����
 * ��ʹ�ù����У�Ҫ������ѭ�����⡣
 * 
 * 
 */
public class Person {
	String name;
	int age;
	
	public Person(){
//		this("����",20);
	}
	
	public Person(String name){
//		this();
		this.name = name;
	}
	
	// ȫ�ι���
	public Person(String name,int age){
//		this("����");
		this.name = name;
		this.age = age;
	}
	
	public void desc(){
		System.out.println("�ҽ�"+this.name+
				",����"+this.age+"��");
	}
}
