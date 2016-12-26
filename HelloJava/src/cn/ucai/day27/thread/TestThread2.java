package cn.ucai.day27.thread;

/**
 * 线程的创建方式
 * 1、继承Thread类，重写run方法，调用start()方法启动
 * 2、实现Runnable接口，重写run方法，通过Thread类的start()方法启动。
 * 
 * 线程名字：
 * 1、main 
 * 2、Thread-0 Thread-1 Thread-2
 */
public class TestThread2 {
	public static void main(String[] args) {
		MyThread mt = new MyThread();
		Thread th = new Thread(mt);
		th.start();
		
		for(int i=0;i<30;i++){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"--"+i);
		}
	}
	
	private static class MyThread implements Runnable{
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
