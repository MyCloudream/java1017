package cn.ucai.day19.thread;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
	public MyFrame(){
		JButton btn = new JButton("����");
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				MyThread mt = new MyThread();
				Thread th = new Thread(mt);
				th.start();
			}
		});
		
		setContentPane(btn);
		setTitle("�̰߳���");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 200, 200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new MyFrame();
	}
	
	/**
	 * ��д��
	 * 1�������ڸ�������
	 * 2��ͬ��ͬ��ͬ����
	 * 3�������׳����쳣�����ܱȸ��ࣨ���ӿڣ�������
	 * 4����������η����ܱȸ�������
	 */
	private class MyThread implements Runnable{
		@Override
		public void run(){
			System.out.println("�������ſ�ʼ....");
			try {
				// ģ���������Ӧ�еĺ�ʱ
				Thread.sleep(5000);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			System.out.println("�������Ž���");
		}
	}
}
