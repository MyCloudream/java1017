package cn.ucai.day19.thread;

public class TestRunnable {
	public static void main(String[] args) {
		MyThread mt = new MyThread();
		Thread th = new Thread(mt);
		th.start();
		
		for(int i = 0;i<100;i++){
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("boss打我一下");
		}
	}
	
	private static class MyThread implements Runnable{
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
