package cn.ucai.day03;

/**
 * ��ʹ��switch���������ϰ�� �������ֳɼ�100�֣�������������ֱ�׼�����ɼ��ĵȼ��� 90(��)�����ϣ�����
 */
public class Test02 {
	public static void main(String[] args) {
		/*int a = 2;
		if(a==2){
			System.out.println("ok");
		}*/
		int score = 89;
		switch (score) {
		case 100:
		case 99:
		case 98:
		case 97:
		case 96:
		case 95:
		case 94:
		case 93:
		case 92:
		case 91:
		case 90:
			System.out.println("����");
			break;
		default:
			System.out.println("������");
			break;
		}
	}
}
