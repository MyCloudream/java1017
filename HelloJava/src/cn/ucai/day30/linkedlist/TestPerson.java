package cn.ucai.day30.linkedlist;

public class TestPerson {
	public static void main(String[] args) {
		Person p = new Person("����",20);
		
		Person p2 = p;
		p2.setAge(30);
		System.out.println(p.getAge());
		
		
		p2 = new Person("����",20);
		p2.setAge(30);
		
		System.out.println(p.getAge());
		

		
		/*Person p3 = new Person("��СС��",5);
		
		p1.setChild(p2);
		
		p2.setChild(p3);
		
		// ��������Ķ��ӵĶ��ӵ�����
		System.out.println(p1.getChild().getChild().getName());*/
		
		
		
		
	}
}
