package cn.ucai.day08.pa5;

/**
 * Java�еıȽϣ��жϣ�
 * 1�������������͵ıȽϣ�ʹ��== �� !=
 * 2�������������͵ıȽ�
 * 		1����ʹ��==���Ƚϵ��Ƕ��е��ڴ��ַ
 * 		2����ʹ��equals
 * 			��1�������û����дequals����ʹ��equals�൱��ʹ��==��Object�е�equals����==�Ƚϣ�	
 * 			��2���������д��equals�������Լ�����ıȽϹ���Ƚ�
 * 3�������������ͺ�null�Ƚϣ�ʹ��== �� !=
 * 	
 */
public class TestPerson {
	public static void main(String[] args) {
		Person p1 = new Person("������",20);
		
		Person p2 = new Person("������2",20);
		
		Person p3 = new Person("����",18);
		
		System.out.println(p1.equals(p2));
		
//		String s1 = new String("bye");
//		String s2 = new String("bye");
//		System.out.println(s1.equals(s2));
	}
}
