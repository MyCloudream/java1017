package cn.ucai.day03;

/**
 * ��������javase��android��javaee���Ʒ������ҳ�������߷֡�
 */
public class Test05 {
	public static void main(String[] args) {
		int a = 3;
		int b = 5;
		int c = 2;
		int max = a;
		if (max < b) {
			max = b;
		}
		if (max < c) {
			max = c;
		}
		System.out.println("���ֵ��" + max);

		System.out.println(Math.max(Math.max(a, b), c));// ���ֵ
		System.out.println(Math.min(Math.min(a, b), c));// ��Сֵ
		System.out.println(a + b + c - Math.max(Math.max(a, b), c) - Math.min(Math.min(a, b), c));// �м�ֵ
	}
}
