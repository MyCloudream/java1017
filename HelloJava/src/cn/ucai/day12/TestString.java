package cn.ucai.day12;

/**
 * �����������ͱȽ�ʹ�� == �� != 
 * �����������ͱȽ�
 * 		1��ʹ��==���Ƚϵ����ڴ��ж���ĵ�ַ
 * 		2��ʹ��equals��
 * 			1����û����дequals�����ǱȽϵĶ��еĵ�ַ���൱��==
 * 			2������д��equals�������Լ�����д���򣬽��бȽϡ�
 * �����������ͺ�null�Ƚϣ�ʹ��== �� !=
 * 
 * ���������ַ���������
 * String s = "abc";
 * 1���鿴�ַ�������������û��"abc"�����������
 * 2������У�����������ø�s
 * 3�����û�У����ڳ��������½�һ��"abc",���Ұ����ø�s
 */
public class TestString {
	public static void main(String[] args) {
		/*String s1 = new String("abc");
		String s2 = new String("abc");
		System.out.println(s1==s2);// false
		System.out.println(s1.equals(s2));// true
*/		
		
		/*String s3 = "abc";
		String s4 = "abc";
		s4 = "mon";
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));*/
		
		/*String s5 = "abc";
		String s6 = new String("abc");
		System.out.println(s5.equals(s6));
		System.out.println(s5==s6);
		*/
		
		String s1 = new String("abc");
		String s2 = new String("abc");
	}
}
