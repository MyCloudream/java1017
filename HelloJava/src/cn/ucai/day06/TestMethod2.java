package cn.ucai.day06;

/**
 * ��д���п���TestCard.java��ģ���ȡǮ�������£�
	ԭ����1000��Ǯ��ȡ��100����ȡ��500���ִ���1000����ȡ��300���д�����200��
	������������п����ʣ��Ǯ����
 */
public class TestMethod2 {
	public static void main(String[] args) {
		int t = 1000;
		t = getMoney(100,1000);
		t = getMoney(500,t);
		t = saveMoney(1000,t);
		t = getMoney(300,t);
		t = saveMoney(200,t);
		System.out.println("ʣ��Ǯ����"+t);
	}
	
	public static int getMoney(int n,int t){
		t -= n;
		return t;
	}
	
	public static int saveMoney(int n,int t){
		t += n;
		return t;
	}
}
