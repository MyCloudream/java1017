package cn.ucai.day27.thread;

/**
 * �̵߳Ĵ�����ʽ
 * 1���̳�Thread�࣬��дrun����������start()��������
 * 2��ʵ��Runnable�ӿڣ���дrun������ͨ��Thread���start()����������
 * 
 * �߳����֣�
 * 1��main 
 * 2��Thread-0 Thread-1 Thread-2
 */
public class TestThread {
	public static void main(String[] args) {
		MyThread mt = new MyThread();
		mt.start();
		
		for(int i=0;i<30;i++){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"--"+i);
		}
	}
	
	private static class MyThread extends Thread{
		@Override
		public void run() {
			for(int i=0;i<30;i++){
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()+"--"+i);
			}
		}
	}
}