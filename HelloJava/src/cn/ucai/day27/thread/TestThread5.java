package cn.ucai.day27.thread;

/**
 * ͬ�� �첽
 * 1������10���߳�ȥ����10��ͼƬ��ÿ���߳�����һ�ţ��첽
 * 2������5���߳�ͬʱȥ����ͬһ�����ݡ����첽
 * 
 * ͬ����
 * 1������̲߳���ͬһ����ʱ��������ͬ���������Ž�ͬ����
 * 2��һ���߳��е������β�ͬ�ķ���Ҳ��ͬ����
 * 
 * ͬ�����涨�ȸ�ʲô�ٸ�ʲô������˭�ȸ�˭��ɣ�ǰ���û�и������ľͲ��ܿ�ʼ�ɡ�
 * �첽�������ģ��Ҹ��ҵģ�����໥û��Ӱ�졣
 * 
 * �������һ������
 * 1��JAVA���κ�һ���������һ������
 * �ڶԶ�������һ����־λ������꣩
 * 0 
 */
public class TestThread5 {
	static Integer money = 1000;
	private static Object obj = new Object();
	public static void main(String[] args) {
		// ����3���̣߳�ͬʱȥȡǮ��ģ������һ��ȥȡǮ�ĳ���
		MyThread mt1 = new MyThread("����");
		MyThread mt2 = new MyThread("����������");
		MyThread mt3 = new MyThread("�����Ķ���");
		MyThread mt4 = new MyThread("����");
		MyThread mt5 = new MyThread("����������");
		MyThread mt6 = new MyThread("�����Ķ���");
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
			synchronized (obj) {// ͬ�������
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
}