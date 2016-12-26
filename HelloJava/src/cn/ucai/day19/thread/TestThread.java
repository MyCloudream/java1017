package cn.ucai.day19.thread;

/**
 * 进程：一个运行中的程序
 * 线程：就是程序运行的一条路径
 * 
 * 一个进程可能包含1个或多个线程
 * 
 * 当main方法运行的时候，已经开始了一个新线程，称为主（main）线程
 * 
 * 线程的写法：
 * 1、继承Thread类，需要重写其run方法。通过Thread的start开启新线程
 * 2、实现Runnable接口，实现其run方法。依然需要通过Thread的start开启新线程
 * 
 * 线程的用法：
 * 1、开启多个线程，充分利用cpu，加快程序执行效率，比如多线程下载
 * 2、Android中，用于处理耗时操作。
 * 3、其他。
 */
public class TestThread {
	public static void main(String[] args) {
		MyThread mt = new MyThread();
		mt.start();// 通知虚拟机，开启线程，会自动运行run方法，run方法运行结束，线程结束。
		
		for(int i = 0;i<100;i++){
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("boss打我一下");
		}
	}
	
	private static class MyThread extends Thread{
		@Override
		public void run() {
			for(int i=0;i<100;i++){
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("我打boss一下");
			}
		}
	}
}
