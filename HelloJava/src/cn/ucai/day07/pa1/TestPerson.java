package cn.ucai.day07.pa1;

public class TestPerson {
	public static void main(String[] args) {
		// new Person();��������
		// new + ���췽�������ڴ�������
		// p�����������
		Person p = new Person();
		p.name = "����";
		p.age = 20;
		
		p.desc();
		
		
		Person p2 = new Person("����",30);
		p2.desc();
		
		Person p3 = new Person("����");
		p3.age = 25;
		p3.desc();
	}
}
