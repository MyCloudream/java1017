package cn.ucai.day29;

public class TestThread {
	static int money = 1000;
	private static Object obj = new Object();
	public static void main(String[] args) {
		MyThread mt = new MyThread();
		Thread th1 = new Thread(mt);
		Thread th2 = new Thread(mt);
		Thread th3 = new Thread(mt);
		
		th1.start();
		th2.start();
		th3.start();
	}
	
	private static class MyThread implements Runnable{
		@Override
		public void run() {
//			synchronized (obj) {
				// 1、是各线程无关的。
				for(int i=0;i<10;i++){
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName()+"--a");
				}
				synchronized (obj) {
					// 2、money
					if(money>=400){
						System.out.println("取了400");
						money -= 400;
						System.out.println("余额："+money);
					}else{
						System.out.println("余额不足");
					}
				}
				// 3、无关
				for(int i=0;i<10;i++){
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName()+"--b");
				}
//			}
		}
	}
}
