package cn.ucai.day12;

/**
 * JDK5.0֮��
 * �̳߳� ���ݿ����ӳ�
 * 
 * Byte Short Int Long ���� �� -128~127
 * �������ͣ�û�г�����
 * boolean�� 
 */
public class TestInteger {
	public static void main(String[] args) {
		Integer i1 = 200;// �Զ�װ��
		Integer i2 = 200;// 
		System.out.println(i1==i2);
		
		int i3 = i1 + i2;// �Զ�����
		
		Integer i4 = 200;
		int i5 = 200;
		// int��Integer���ͱȽϣ���תΪint���ٱȽ�
		System.out.println(i4==i5);
	}
}
