package cn.ucai.day27.thread;

/**
 * join:将一个线程加入到另外一个线程中。
 * 如果A加入到了B中，则会先执行A，直到A执行完，才会执行B。
 * 把两条执行路线合并成了一条路线，把并行执行的改为了顺序执行，并且是先A后B
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
