package cn.ucai.day17.pa1;

/**
 * ��װ���ģʽ��װ�����ģʽ������ԭ���ܽ�������չ��
 * ʹ�ó�����
 * 1�������
 * 2������������ͬ�����ƵĹ���
 */
public class Test {
	public static void main(String[] args) {
		// 1��Ҫһ���ᳪ���java ��ʦ
		/*JavaTeacher jt = new JavaTeacher();
		SingTeacher st = new SingTeacher(jt);
		st.teach();*/
		
		// 2���ᳪ�� �ὲЦ����JAVA��ʦ
		JavaTeacher jt = new JavaTeacher();// �����ࡢ����װ��
		JokeTeacher jokeTeacher = new JokeTeacher(jt);// ��װ�ࡢ��չ��
		SingTeacher st = new SingTeacher(jokeTeacher);
		
		st.teach();
	}
}
