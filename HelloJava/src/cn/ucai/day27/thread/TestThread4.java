package cn.ucai.day27.thread;

/**
 * join:��һ���̼߳��뵽����һ���߳��С�
 * ���A���뵽��B�У������ִ��A��ֱ��Aִ���꣬�Ż�ִ��B��
 * ������ִ��·�ߺϲ�����һ��·�ߣ��Ѳ���ִ�еĸ�Ϊ��˳��ִ�У���������A��B
 */
public class TestThread4 {
	public static void main(String[] args) {
		MyThread mt = new MyThread();
		mt.start();
		try {
			mt.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Hello ");
	}
	
	private static class MyThread extends Thread{
		@Override
		public void run() {
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("World");
		}
	}
}