package cn.ucai.day03;

/**
 * ��ʹ��if������������ϰ�� �������ֳɼ�100�֣�������������ֱ�׼�����ɼ��ĵȼ��� 
 * 90(��)-100�֣����� 80(��)-90�֣�����
 * 60(��)-80�֣����� 60�����£�������
 */
public class Test03 {
	public static void main(String[] args) {
		int score = 98;
		if (score >= 90) {// 1��
			System.out.println("����");
		} else if (score >= 80) {// 0-���
			System.out.println("����");
		} else if (score >= 60) {
			System.out.println("����");
		} else {// 0-1��
			System.out.println("������");
		}
	}
}
