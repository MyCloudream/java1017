package cn.ucai.day03;

/**
 * ���������ĺ���ѧ���Ƴɼ���������������ֱ�׼�����ɼ��ĵȼ��� 
 * 1�����ģ�90(��)-100�ֲ�����ѧ��90(��)-100�� ���������
 * 2�����Ļ���ѧ����һ��90�����ϣ�������һ��60������ �����ƫ��
 */
public class Test04 {
	public static void main(String[] args) {
		int a = 98;
		int b = 57;
		if (a >= 90 && b >= 90) {
			System.out.println("����");
		} else if ((a >= 90 && b < 60) || (b >= 90 && a < 60)) {
			System.out.println("ƫ��");
		}

		if (a >= 90) {
			if (b >= 90) {
				System.out.println("����");
			} else if (b < 60) {
				System.out.println("ƫ��");
			}
		} else if (a < 60) {
			if (b >= 90) {
				System.out.println("ƫ��");
			}
		}
	}
}
