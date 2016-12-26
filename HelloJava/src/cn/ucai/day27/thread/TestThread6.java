package cn.ucai.day27.thread;

public class TestThread6 {
	static Integer money = 1000;
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
			m();
		}
		
		public synchronized void m(){
			if(money>=400){
				System.out.println(Thread.currentThread().getName()+"ȡ��400");//ȡǮ�Ĺ���
				money -= 400;// ȡǮ֮�����п��ڴ�����ȵı仯
				System.out.println(Thread.currentThread().getName()+"���������Ϊ��"+money);
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}else{
				System.out.println(Thread.currentThread().getName()+"���������Ϊ������");
			}
		}
	}
}