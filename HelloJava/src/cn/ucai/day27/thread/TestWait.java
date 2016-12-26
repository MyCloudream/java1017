package cn.ucai.day27.thread;

/**
 * wait:使在运行中的线程释放锁，并进入等待池等待。
 * notify：随机一个线程从等待池中出来，进入对象锁池。
 * notifyAll:让所有等待池中的线程出来，进入对象锁池。
 */
public class TestWait {
	public synchronized void m1(){
		try {
			wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		while(true){
			System.out.println("Hello");
		}
	}
	
	public synchronized void m2(){
		/*while(true){
			System.out.println("World");
		}*/
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		notify();
	}
	public static void main(String[] args) {
		TestWait tw = new TestWait();
		MyThread1 mt1 = new MyThread1(tw);
		Thread th1 = new Thread(mt1);
		th1.start();
		
		MyThread2 mt2 = new MyThread2(tw);
		Thread th2 = new Thread(mt2);
		th2.start();
	}
}

class MyThread1 implements Runnable{
	private TestWait tw;
	public MyThread1(TestWait tw) {
		this.tw = tw;
	}
	@Override
	public void run() {
		tw.m1();
	}
}
class MyThread2 implements Runnable{
	private TestWait tw;
	public MyThread2(TestWait tw) {
		this.tw = tw;
	}
	@Override
	public void run() {
		tw.m2();
	}
}
