package cn.ucai.day17;

/**
 * �ݹ飺��һ�ַ����ڲ����÷�������ı�̼��ɡ� 
 * ����5! = 5*4*3*2*1
 * 5�Ľ׳ˣ�
 * 5�� = 4�� * 5
 * 4�� = 3�� * 4
 * 3�� = 2�� * 3
 * 2! = 1! * 2
 * 1! = 1;
 * 
 * �׳�Ҫ�����ޡ�
 * 
 * �Ʋ��������У�1 1 2 3 5 8 13 21 34 55 
 * f(n) = f(n-1) + f(n-2);
 * f(10) = f(9) + f(8);
 */
public class TestFile {
	public static void main(String[] args) {
		int s = m(5);
		System.out.println(s);
	}
	
	/**
	 * ����n�Ľ׳�
	 */
	public static int m(int n){
		if(n==1){
			return 1;
		}
		return m(n-1)*n;
	}
}
