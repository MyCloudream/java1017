package cn.ucai.day03;

import java.util.Scanner;

/**
 * ��������һ��5���Ƶķ����������������ֱ�׼�����ɼ��ĵȼ� 5�֣����� 4�֣����� 3�֣����� 0��2��������
 * switch��������ı��������ͣ�
 * JDK7.0֮ǰ��<= int : byte short char int ö��
 * JDK7.0���Ժ�String
 */
public class Test01 {
	public static void main(String[] args) {
		System.out.println("������һ���ɼ���");
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		String s;
		switch (score) {
		case 5:// case ����������ʱ��
			s = "����";
			break;// ���ڽ���switch���
		case 4:
			s = "����";
			break;
		case 3:
			s = "����";
			break;
		case 2:
		case 1:
		case 0:
			s = "������";
			break;
		default:// Ĭ�ϵģ�Ҳ���������е�case�������ϵ�ʱ��
			s = "�ɼ�¼������";
//			break;
		}
		System.out.println(s);
	}
}
