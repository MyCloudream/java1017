package cn.ucai.day05;

/**
 * ���飺���ݵ�����
 */
public class TestArray {
	public static void main(String[] args) {
		// ����Ķ���
		int[] scoreArr = new int[7];
		// ����Ԫ�صĳ�ʼ��
		scoreArr[0] = 98;
		scoreArr[1] = 89;
		scoreArr[2] = 92;
		scoreArr[3] = 67;
		scoreArr[4] = 40;
		scoreArr[5] = 49;
		scoreArr[6] = 62;
		
		for(int i=0;i<scoreArr.length;i++){// Ӳ���루д���ˣ�hard coding
			System.out.println(i);
			if(scoreArr[i]>=60){
				System.out.println("����");
			}
		}
	}
}
