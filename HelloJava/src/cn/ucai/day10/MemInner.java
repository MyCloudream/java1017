package cn.ucai.day10;

/**
 * һ�����ԣ�ȫ�ֱ�������Ա������ʵ������
 * һ�㷽������������Ա������ʵ������
 * 
 * �ڲ��ࣺ���������е���
 * 1����Ա�ڲ���
 * 2����̬�ڲ���
 * 3���ֲ��ڲ���
 * 4�������ڲ��ࣺ��ʵ��һ������ľֲ��ڲ���
 */
public class MemInner {
	
	public void m(){
		Mem memClass = new Mem();
		memClass.method();
	}
	
	public static void main(String[] args) {
		MemInner mi = new MemInner();
		Mem memClass = mi.new Mem();
		memClass.method();
	}
	
	public class Mem{
		public void method(){
			System.out.println("���ǳ�Ա�ڲ���");
		}
	}
}

/*class Mem2{
	public void method(){
		System.out.println("���ǳ�Ա�ڲ���");
	}
}
*/