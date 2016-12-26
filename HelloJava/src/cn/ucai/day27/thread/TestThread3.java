package cn.ucai.day27.thread;

/**
 * ���䰸����
 * ����һ�ң�һ�����������Ÿ���������������
 * 400 
 */
public class TestThread3 {
	static int money = 1000;
	public static void main(String[] args) {
		// ����3���̣߳�ͬʱȥȡǮ��ģ������һ��ȥȡǮ�ĳ���
		MyThread mt1 = new MyThread("����");
		MyThread mt2 = new MyThread("����������");
		MyThread mt3 = new MyThread("�����Ķ���");
		mt1.start();
		try {
			mt1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		mt2.start();
		try {
			mt2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		mt3.start();
		try {
			mt3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	private static class MyThread extends Thread{
		public MyThread(String name){
			super(name);
		}
		@Override
		public void run() {
			// ��������
			if(money>=400){
				System.out.println(Thread.currentThread().getName()+"ȡ��400");//ȡǮ�Ĺ���
				money -= 400;// ȡǮ֮�����п��ڴ����ȵı仯
				System.out.println(Thread.currentThread().getName()+"���������Ϊ��"+money);
			}else{
				System.out.println(Thread.currentThread().getName()+"���������Ϊ������");
			}
			// ��������
		}
	}
}
