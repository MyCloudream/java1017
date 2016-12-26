package cn.ucai.day11.exception;

/**
 * try-catch-finally�÷���
 * 1��try����һ�Σ����ÿ��ܻᷢ���쳣�Ĵ���
 * 2��catch���Գ��ֶ�Σ����catch�е������쳣ƽ�����ߺ��޹�ϵ����catch��˳������ν��
 * ���catch�е������쳣���ڸ��ӹ�ϵ������Ҫ������ķ����棬����ķ����档
 * 3��finally����ʾһ��(������ζ�)��ִ�еĴ��룬һ������Դ�Ĺرջ���ʱ�ļ��Ĵ����á�
 * 4��try��catch��finally�����ܵ���ʹ�� catch����0-n��,try����1�Σ�finally����0-1��
 * 
 * ���ݿ������
 * 1�����ݿ����� 2���������� 3���ر�����
 */
public class TestTry4 {
	public static void main(String[] args) {
		System.out.println(getInt());
	}
	
	public static int getInt(){
		try{
			int a = 2;
			int b = 1;
			System.out.println(a/b);
			return 1;
		}catch(ArithmeticException e){
			System.out.println("���������쳣");
			return 2;
		}finally{
			System.out.println("finally");
			return 3;
		}
	}
}
