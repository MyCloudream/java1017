package cn.ucai.day27.thread;

/**
 * 同步 异步
 * 1、开启10个线程去下载10张图片，每个线程下载一张：异步
 * 2、开启5个线程同时去操作同一个数据。：异步
 * 
 * 同步：
 * 1、多个线程操作同一数据时，加上了同步处理，才叫同步。
 * 2、一个线程中调用依次不同的方法也叫同步。
 * 
 * 同步：规定先干什么再干什么，或者谁先干谁后干，前面的没有干完后面的就不能开始干。
 * 异步：你干你的，我干我的，大家相互没有影响。
 * 
 * 如何来加一把锁：
 * 1、JAVA中任何一个对象就是一把锁。
 * 在对对象中有一个标志位（锁旗标）
 * 0 
 */
public class TestThread5 {
	static Integer money = 1000;
	private static Object obj = new Object();
	public static void main(String[] args) {
		// 启动3个线程，同时去取钱，模拟张三一家去取钱的场景
		MyThread mt1 = new MyThread("张三");
		MyThread mt2 = new MyThread("张三的老婆");
		MyThread mt3 = new MyThread("张三的儿子");
		MyThread mt4 = new MyThread("张三");
		MyThread mt5 = new MyThread("张三的老婆");
		MyThread mt6 = new MyThread("张三的儿子");
		mt1.start();
		mt2.start();
		mt3.start();
		mt4.start();
		mt5.start();
		mt6.start();
	}
	
	private static class MyThread extends Thread{
		public MyThread(String name){
			super(name);
		}
		@Override
		public void run() {
			synchronized (obj) {// 同步代码块
				if(money>=400){
					System.out.println(Thread.currentThread().getName()+"取了400");//取钱的过程
					money -= 400;// 取钱之后银行卡在处理额度的变化
					System.out.println(Thread.currentThread().getName()+"看到的余额为："+money);
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}else{
					System.out.println(Thread.currentThread().getName()+"看到的余额为：余额不足");
				}
			}
		}
	}
}
