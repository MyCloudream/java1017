package cn.ucai.day04;

/**
 * �����������͵ıȽϣ�ʹ��==
 * �����������͵ıȽϣ�ʹ��equals
 * 
 * �������ֵ��ã�
 * 1��ʹ������. ����Math.pow(2,4);
 * 2��ʹ�ö���(����). 
 * 
 * String�������ȫ�������������ı�String������
 */
public class TestString2 {
	public static void main(String[] args) {
		String name = " zhang san     ";
		String name2 = name.trim();// ȥ��ǰ��ո�
		System.out.println(name.length());
		System.out.println(name2.length());
		/*String str = "abc1abc1abc";
//		String str2 = str.replace('a', '0');
		String str2 = str.replace("ab", "000000");
		System.out.println(str2);
		System.out.println(str);*/
	}
}
