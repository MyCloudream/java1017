package cn.ucai.day07.pa6;

/**
 * GC : �������ջ���
 */
public class Test {
	public static void main(String[] args) {
		Person p1 = new Person("����",20);
		Person p2 = p1;
		p2 = new Person("����",25);
		System.out.println(p1.name);
		System.out.println(p2.name);
		p1.name = "����";
		System.out.println(p1.name);
		System.out.println(p2.name);
		p1 = new Person("����",19);
		System.out.println(p1.name);
		/*Person p1 = new Person("����",20);
		Person p2 = p1;
		p2.name = "����";
		System.out.println(p1.name);
		System.out.println(p2.name);*/
		
		// ���ٶ��ڴ�ռ䣺��ʵ�����Ǵ����ڶ��е�
		/*Person p1 = new Person("����",20);
		Person p2 = p1;
		System.out.println(p1.name);
		System.out.println(p2.name);*/
		
	}
}
