package cn.ucai.day07.pa5;

public class Test {
	public static void main(String[] args) {
		Person p3 = new Person();
		p3.name = "��СС��";
		p3.age = 2;
		
		Person p2 = new Person("��С��",25,p3);
		
		Person p1 = new Person("����",60,p2);
		
		// �����Ķ��ӵ�����
		System.out.println(p1.person.name);
		// �����Ķ��ӵĶ��ӵ�����
		System.out.println(p1.person.person.name);
	}
}
