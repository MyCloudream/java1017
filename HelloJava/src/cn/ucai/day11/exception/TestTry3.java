package cn.ucai.day11.exception;

/**
 * e���÷���:
 * 1��toString
 * 2��getMessage
 * 3��e.printStackTrace()
 * 
 * try-catch-finally�÷���
 * 1��try����һ�Σ����ÿ��ܻᷢ���쳣�Ĵ���
 * 2��catch���Գ��ֶ�Σ����catch�е������쳣ƽ�����ߺ��޹�ϵ����catch��˳������ν��
 * ���catch�е������쳣���ڸ��ӹ�ϵ������Ҫ������ķ����棬����ķ����档
 * 
 * catch������дʲô��
 * 1�����������û��򽻵������ṩ����Ѻõ���ʾ
 * 2�����˵����������򽻵���һ��e.printStackTrace()��ӡ��Ϣ������̨���߽��쳣��Ϣ��¼����־�С�
 * 3������
 */
public class TestTry3 {
	public static void main(String[] args) {
		try{
			int a = 2;
			int b = 1;
			System.out.println(a/b);
			
//			String str = null;
//			System.out.println(str.charAt(0));
			
			String s = "abc";
			System.out.println(Integer.parseInt(s));
		}catch(ArithmeticException e){//RuntimeException e = new NullPointerException();
			System.out.println("���������쳣");
		}catch(NullPointerException e){
			System.out.println("��ָ���쳣");
		}catch(RuntimeException e){
			System.out.println("����ʱ�쳣");
		}
	}
}
