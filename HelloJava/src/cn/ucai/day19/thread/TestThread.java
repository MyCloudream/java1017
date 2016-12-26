package cn.ucai.day19.thread;

/**
 * ���̣�һ�������еĳ���
 * �̣߳����ǳ������е�һ��·��
 * 
 * һ�����̿��ܰ���1�������߳�
 * 
 * ��main�������е�ʱ���Ѿ���ʼ��һ�����̣߳���Ϊ����main���߳�
 * 
 * �̵߳�д����
 * 1���̳�Thread�࣬��Ҫ��д��run������ͨ��Thread��start�������߳�
 * 2��ʵ��Runnable�ӿڣ�ʵ����run��������Ȼ��Ҫͨ��Thread��start�������߳�
 * 
 * �̵߳��÷���
 * 1����������̣߳��������cpu���ӿ����ִ��Ч�ʣ�������߳�����
 * 2��Android�У����ڴ����ʱ������
 * 3��������
 */
public class TestThread {
	public static void main(String[] args) {
		MyThread mt = new MyThread();
		mt.start();// ֪ͨ������������̣߳����Զ�����run������run�������н������߳̽�����
		
		for(int i = 0;i<100;i++){
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("boss����һ��");
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
				System.out.println("�Ҵ�bossһ��");
			}
		}
	}
}
