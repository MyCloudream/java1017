package cn.ucai.day09.pa8;

/**
 * һ���������ڹ��췽�����У�����ÿ��ʹ�ù��췽����������
 * ��̬����Ҳ�����ڹ��췽�����У�����ֻ����һ�Ρ�
 */
public class Student {
	public Student(){
		System.out.println("���ǹ��췽��");
	}
	static{// ��̬����
		System.out.println("���Ǿ�̬����");
	}
	
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		Student s4 = new Student();
		Student s5 = new Student();
		
	}
}
