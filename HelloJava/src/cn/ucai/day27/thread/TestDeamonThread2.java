package cn.ucai.day27.thread;

import java.util.Scanner;

public class TestDeamonThread2 {
	public static void main(String[] args) {
		/*MyThread mt = new MyThread();
		// ����mtΪ�ػ��߳�
		mt.setDaemon(true);
		mt.start();*/
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Hello");
		/*Scanner scan = new Scanner(System.in);
		// ��������
		String str = scan.next();
		System.out.println("str:"+str);
		scan.close();*/
	}
	
	/*private static class MyThread extends Thread{
		@Override
		public void run() {
			while(true){
				System.out.println(Thread.currentThread().getName());
			}
		}
	}*/
}
