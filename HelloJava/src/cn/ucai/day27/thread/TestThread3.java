package cn.ucai.day27.thread;

/**
 * 经典案例：
 * 张三一家：一个主卡，两张副卡　　１０００
 * 400 
 */
public class TestThread3 {
	static int money = 1000;
	public static void main(String[] args) {
		// 启动3个线程，同时去取钱，模拟张三一家去取钱的场景
		MyThread mt1 = new MyThread("张三");
		MyThread mt2 = new MyThread("张三的老婆");
		MyThread mt3 = new MyThread("张三的儿子");
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
			// 其他代码
			if(money>=400){
				System.out.println(Thread.currentThread().getName()+"取了400");//取钱的过程
				money -= 400;// 取钱之后银行卡在处理额度的变化
				System.out.println(Thread.currentThread().getName()+"看到的余额为："+money);
			}else{
				System.out.println(Thread.currentThread().getName()+"看到的余额为：余额不足");
			}
			// 其他代码
		}
	}
}
