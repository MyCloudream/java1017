package cn.ucai.day10;

/**
 * �����ڲ��ࣺ
 * 1��new + ����/���ӿ� () {}
 * public class HelloWorld
 * �ص㣺
 * û�����η�  û��class�ؼ��� û������ û��implements����extends�ؼ���
 * �и������ʵ�� ������ ����д����
 */
public class AnnoInner {
	public void m1(Inter inter){
		System.out.println("m1");
		inter.method();
	}
	
	/**
	 * �ֲ��ڲ���
	 */
	public void m2(){
		
		class Anno implements Inter{
			@Override
			public void method() {
				System.out.println("����Inter��ʵ�������д���method����");
			}
		}
		
		Inter inter = new Anno();
		
		m1(inter);
		m1(new Anno());
	}
	
	/**
	 * �����ڲ���
	 */
	public void m3(){
		// ��̬�ڶ�������������̬ʱ����ʱ�ĸ���������βΣ�ָ������Ҳ�������ڲ����ʵ�Σ���
		// ���õ���������д֮��ģ�Ҳ�������ڲ�������д�ķ���
		m1(new Inter(){
			@Override
			public void method() {
				System.out.println("���������ڲ���");
			}
		});
	}
	public static void main(String[] args) {
		AnnoInner ai = new AnnoInner();
		ai.m3();
	}
}

interface Inter{
	public abstract void method();
}
