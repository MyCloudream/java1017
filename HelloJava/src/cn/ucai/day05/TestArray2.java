package cn.ucai.day05;

/**
 * ���鶨���֮������Ԫ����Ĭ�ϳ�ʼ��
 * �����������͵�Ĭ��ֵ��
 * 1��byte��short��int��long���飺��ͬλ����0
 * 2��float��double����ͬλ����0.0
 * 3��boolean��false
 * 4��char��'\u0000'
 * 
 * ������������������˵��Ϊnull
 * 
 */
public class TestArray2 {
	public static void main(String[] args) {
		String[] strArrNames = {"����","����","����"};
		for(int i=0;i<strArrNames.length;i++){
			System.out.println(strArrNames[i]);
		}
		System.out.println(strArrNames[1]);
		
		/*int scoreArr2[] = new int[7];
		
		// ����Ķ���
		int[] scoreArr = new int[7];
		System.out.println(scoreArr[0]);
		System.out.println(scoreArr[1]);
		System.out.println(scoreArr[5]);
		
		boolean[] boolArr = new boolean[10];
		System.out.println(boolArr[3]);
		
		char ch = '\u4E2D';
		System.out.println(ch);

		String[] strArr = new String[10];
		System.out.println(strArr[4]);*/
	}
}
