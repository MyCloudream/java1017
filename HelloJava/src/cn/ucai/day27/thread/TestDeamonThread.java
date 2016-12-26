package cn.ucai.day27.thread;

import java.util.Scanner;

/**
 * 1���̵߳�������������
 * 2���̵߳���������
 * 3���̵߳�ͬ��
 * 
 * �ػ��߳� Deamon Thread��
 * �ػ��߳���һ��������̣߳�һ�����ڷ��������̣߳����һ���߳̽��������ػ��߳��Զ����Ž�����
 * 
 *  GC�����������߳�
 *  
 *  prio���̵߳����ȼ���
 *  ���ȼ���1-10��10��ʾ���
 *  Ĭ������£������ָ�����ȼ�����Ϊ5.
 *  
 *  
 *  ���꣺����ϵͳ
 *  ���ӣ����̣�һ�������Ͽ����ж���Է����ˣ�Ҳ������һ���Է�����
 *  �Է����ˣ��߳�
 *  �����CPU��һ��������ǵ���CPU�����������Ƕ��CPU
 *  ���Ĳˣ�����ʱ��Ƭ
 *  ����ϲˣ�CPU�ĵ���
 *  һ�����Ӻ�����һ�����ӵĽ��������̼��ͨѶ
 *  ����˶�Ҫ�ϲ���������
 *  ����ֻ��һ����һ��ֻ��һ����ʹ�ã�ͬ��
 *  һ������ʹ�ò�����������Ҳ�����ˣ��̲߳���ȫ
 *  �̲߳���ȫ��������
 *  
 *  �����Ա��и��齫�����ȴ���
 *  �����˺����齫�����ϲ������ȴ���֪ͨ����
 */
public class TestDeamonThread {
	public static void main(String[] args) {
		MyThread mt = new MyThread();
		// ����mtΪ�ػ��߳�
		mt.setDaemon(true);
		mt.start();
		
		Scanner scan = new Scanner(System.in);
		// ��������
		String str = scan.next();
		System.out.println("str:"+str);
		scan.close();
	}
	
	private static class MyThread extends Thread{
		@Override
		public void run() {
			while(true){
				System.out.println(Thread.currentThread().getName());
			}
		}
	}
}