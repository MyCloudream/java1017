package cn.ucai.day07.pa4;

public class Test {
	public static void main(String[] args) {
		
		Dog dog = new Dog("è��",2);
		// ���dog������
		System.out.println(dog.name);
		
		Person p = new Person("�°���",50,dog);
		// ����°���Ĺ�������
		System.out.println(p.dog.name);
	}
}
