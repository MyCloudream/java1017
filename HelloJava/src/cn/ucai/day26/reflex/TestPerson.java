package cn.ucai.day26.reflex;

/**
 * ���䣺ͨ��Class�����ǿ��Ի�ȡָ������������ݣ����ԡ����������췽���ȣ�����ִ���乹�췽���ͷ����ȡ�
 */
public class TestPerson {
	public static void main(String[] args) throws Exception {
		Class c1 = Person.class;// һ�����ڴ���
		
		Person p = new Person();
		Class c2 = p.getClass();
		
		Class c = Class.forName("cn.ucai.day26.reflex.Person");
		Person person = (Person) c.newInstance();// Person person = new Person();
		System.out.println(person);
		
		
	}
}