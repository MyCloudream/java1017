package cn.ucai.day11.exception;

/**
 * try-catch-finally
 */
public class TestTry {
	public static void main(String[] args) {
		int a = 2;
		int b = 0;
		// 1��������һ���쳣���� new ArithmeticException();
		// 2�����쳣�����׳�,�׳�������ĵ����ߣ������
		// 3��������������򣬲��ڿ���̨��ӡ�쳣��Ϣ
		System.out.println(a/b);
		
		/*try{// ���ܻ��׳��쳣�Ĵ���
			int a = 2;
			int b = 1;
			System.out.println(a/b);// 1��������һ���쳣���� new ArithmeticException(); �൱��ʵ�ʲ���
		}catch(ArithmeticException e){// ץס�쳣  ��ʽ����
			System.out.println("��������Ϊ0");
			System.out.println(e.toString());
		}
		System.out.println("else");*/
	}
}
