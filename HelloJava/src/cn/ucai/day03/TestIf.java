package cn.ucai.day03;

/**
 * �߼������
 * λ�����
 * 1���߼������ֻ�ܽ����߼����㣬λ��������Խ����߼������λ����
 * 2���߼�������Ƕ�·���������磬���ڻ��ߣ�||����˵�����ǰ��Ϊtrue������沿�ֲ��ټ��㡣
 */
public class TestIf {
	public static void main(String[] args) {
		double d=2.6;
		d=2.6-2;
		System.out.println(d);
		if(d-0.6<0.0000000001){
			System.out.println("���");
		}else{
			System.out.println("�����");
		}

		/*int age=18;	
		boolean b=(age<=18||age++<19);
		System.out.println(age);
		System.out.println(b);*/

	}
}
